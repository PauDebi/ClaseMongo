import controlador.BaseDades;
import dades.Aspirant;
import org.bson.BsonValue;
import org.bson.Document;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class ProvesMain {
    public static void main(String[] args) {
        BaseDades bd = new BaseDades("localhost", 27017, "Aspirantes", "aspirants");
/*
        //    3. A la classe BaseDades crea un mètode que rebi un document i l’inserti a la base de dades.
        //    4. Al main de la classe ProvesMain crea un objecte aspirant. Crea un document a partir d’ell utilitzant append. Afegeix-lo a la col·lecció.
        Aspirant a = new Aspirant("12345678A", "Pere", "Martínez", "08001");
        Document doc = new Document("nif", a.getNif())
                .append("nom", a.getNom())
                .append("llinatges", a.getLlinatges())
                .append("cp", a.getCp());
        //BsonValue id = bd.insertOne(doc);


        //    6. Al main de la classe ProvesMain crea un nou aspirant. Crea un document a partir del HashMap de l’aspirant i inserta-la a la col·lecció.
        Aspirant a2 = new Aspirant("12345678A", "Paco", "asdaa", "07300");
        HashMap<String, Object> map = a2.toMap();
        bd.inserirDoc(new Document(map));*/

        //    7. Crea un mètode que utilitzi MongoCursor per recuperar tots els documents i torni un ArrayList<Aspirant>. Mostra’ls per pantalla al main.
/*        ArrayList<Aspirant> aspirants = bd.findAll();
        for (Aspirant aspirant : aspirants) {
            System.out.println(aspirant);
        }*/




        //    9. Crea un mètode que utilitzi el bloc creat a l’exercici anterior per mostrar el contingut de la col·lecció.
        //bd.mostrarDocuments();

        //    10. Crea un mètode que posi dins un ArrayList els documents de la col·lecció.

/*        ArrayList<Document> documents = bd.findAllDocuments();
        documents.forEach(System.out::println);*/

        //    11. Crea un mètode amb dos paràmetres, la posició inicial del primer document que volem recuperar i la quantitat de documents que volem recuperar. Ha de posar aquests documents dins d’un ArrayList.
/*        ArrayList<Document> documents = bd.findfDocumentsWithSkipAndList(1, 10);
        documents.forEach(System.out::println);*/

        //    12. Crea un altre mètode que filtri els documents per codiPostal. Ha de rebre el codi postal per paràmetre i tornar els documents dins d’un ArrayList.
/*       ArrayList<Document> documents = bd.findByCp("07300");
        documents.forEach(System.out::println);*/

        //    13. Crea un altre mètode que rebi com a paràmetres el codiPostal i el nom i torni tots els documents que compleixin els dos requisits.

/*        ArrayList<Document> documents = bd.findByCpAndNom("07300", "Maria");
        documents.forEach(System.out::println);*/

        //    14. Crea un altre mètode que rebi com a paràmetre una llista amb els noms dels camps que vol incloure al resultat. El mètode ha de crear un document amb aquests camps i utilitzar-lo amb .projection(). Ha de tornar la llista amb els documents.



        //    15. Crea un altre mètode que torni tots els documents de la col·lecció ordenats per un camp. Ha de tenir un paràmetre per el nom del camp i un altre per si volem l’ordre ascendent o descendent.


//        16. Crea un altre mètode que filtri els documents per codiPostal. Ha de rebre el codi postal per paràmetre i tornar els documents dins d’un ArrayList.
/*        ArrayList<Document> documents = bd.findByCp("07300");
        documents.forEach(System.out::println);*/


//        17. Crea un altre mètode que rebi com a paràmetres el codiPostal i el nom i torni tots els documents que compleixin els dos requisits.
/*        ArrayList<Document> documents = bd.findByCpAndNom("07300", "Maria");
        documents.forEach(System.out::println);*/

//        18. Crea un altre mètode que rebi com a paràmetres dos noms i torni tots els documents que contenguin un dels dos noms.
//        19. Crea un altre mètode que rebi com a paràmetres una llista de noms i torni tots els documents que no contenguin cap dels noms de la llista.

//        20. Crea un altre mètode que ordeni els aspirants per nom amb ascending.
//        21. Crea un altre mètode que ordeni els aspirants primer per un ascending dels llinatges i després per un altre ascending del nom.
//        22. Repeteix l’exercici anterior a un nou mètode utilitzant aquesta vegada orderBy.
//        23. Projeccions
//        24. Crea un mètode que torni un ArrayList<Document> i que utilitzi include per mostrar el nom i els llinatges dels aspirants.
//        25. Crea un mètode que torni un ArrayList<Document> i que utilitzi fields per mostrar el nom i els llinatges i no l’_id.



    }
}
