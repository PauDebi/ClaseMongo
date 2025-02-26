package dades;

import java.util.HashMap;
import java.util.Objects;

public class Aspirant {
    private String nif;
    private String nom;
    private String llinatges;
    private String cp;

    public Aspirant(String nif, String nom, String llinatges, String cp) {
        this.nif = nif;
        this.nom = nom;
        this.llinatges = llinatges;
        this.cp = cp;
    }

    public Aspirant() {
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLlinatges() {
        return llinatges;
    }

    public void setLlinatges(String llinatges) {
        this.llinatges = llinatges;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "nif='" + nif + '\'' +
                ", nom='" + nom + '\'' +
                ", llinatges='" + llinatges + '\'' +
                ", cp='" + cp + '\'' +
                '}';
    }

    //    5. Afegeix el mètode toMap() a la classe de l’aspirant. Ha de tornar un HashMap amb una entrada per a cada atribut de l’objecte.
    public HashMap<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("nif", nif);
        map.put("nom", nom);
        map.put("llinatges", llinatges);
        map.put("cp", cp);
        return map;
    }
}
