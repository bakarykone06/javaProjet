package model;

public class Categorie {
    private int id_categorie;
    private String nom;
    private String description;

    public Categorie(){}
    public Categorie(int id_categorie, String nom, String description){
        this.id_categorie = id_categorie;
        this.nom = nom;
        this.description = description;
    }

    public int getId_categorie() {
        return this.id_categorie;
    }
    
    public String getNom() {
        return this.nom;
    }
   
    public String getDescription() {
        return this.description;
    }

    public void setId_categorie(int id_categorie) {
        this.id_categorie = id_categorie;
    }
     public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
