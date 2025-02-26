package controlador;

import com.mongodb.Block;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.InsertOneResult;
import dades.Aspirant;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;


public class BaseDades {
    private MongoClient client;
    private MongoDatabase db;
    private MongoCollection<Document> col;
    private Block<Document> bloc;

    public BaseDades(String host, int port, String bbdd, String colleccio) {
        client = MongoClients.create("mongodb://" + host + ":" + port);
        db = client.getDatabase(bbdd);
        col = db.getCollection(colleccio);

        //    8. Crea un atribut que sigui un Block. Inicia’l al constructor, de manera que mostri per pantalla el nif, el nom i els llinatges.
        bloc = new Block<Document>(){
            @Override
            public void apply(Document document) {
                System.out.println(document.getString("nif") + " " + document.getString("nom") + " " + document.getString("llinatges"));
            }
        };
    }

    public String inserirDoc(Document doc) {
        InsertOneResult result = col.insertOne(doc);
        return result.getInsertedId().toString();
    }

    public ArrayList<Aspirant> findAll(){
        ArrayList<Aspirant> aspirants = new ArrayList<>();
        for (Document doc : col.find()) {
            Aspirant a = new Aspirant();
            a.setNif(doc.getString("nif"));
            a.setNom(doc.getString("nom"));
            a.setLlinatges(doc.getString("llinatges"));
            a.setCp(doc.getString("cp"));
            aspirants.add(a);
        }
        return aspirants;
    }

    public void mostrarDocuments(){
        col.find().forEach(bloc::apply);
    }

    public ArrayList<Document> findAllDocuments(){
        return col.find().into(new ArrayList<>());
    }

    public ArrayList<Document> findfDocumentsWithSkipAndList(int posicio, int quantitat){
        return col.find().skip(posicio - 1).limit(quantitat).into(new ArrayList<>());
    }

    public ArrayList<Document> findByCp(String codiPostal){
        return col.find(new Document("codiPostal", codiPostal)).into(new ArrayList<>());
    }

    public ArrayList<Document> findByCpAndNom(String codiPostal, String nom){
        return col.find(new Document("codiPostal", codiPostal).append("nom", nom)).into(new ArrayList<>());
    }

    public ArrayList<Document> findAllOnlySomeFields(ArrayList<String> fields){
        Document doc = new Document();
        for (String field : fields) {
            doc.append(field, 1);
        }
        return col.find().projection(doc).into(new ArrayList<>());
    }

    public ArrayList<Document> findByCP_Filters(String cp){
        Bson filtre = Filters.eq("codiPostal", cp);
        return col.find(filtre).into(new ArrayList<>());
    }

    public ArrayList<Document> findByCPAndNom_Filters(String cp, String nom){
        Bson filtre = Filters.and(Filters.eq("codiPostal", cp), Filters.eq("nom", nom));
        return col.find(filtre).into(new ArrayList<>());
    }

}
