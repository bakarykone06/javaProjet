package model;

public class Produit {
    private int id_produit;
    private String nom;
    private String description;
    private double prix;
    private int quantite;
    private Categorie categorie;

    public Produit(){}
    public Produit(int id_produit, String nom, String description, double prix, int quantite, Categorie categorie){
        this.id_produit = id_produit;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
        this.categorie = categorie;
    }

    public int getId_produit(){
        return this.id_produit;
    }
    public String getNom(){
        return this.nom;
    }
    public String getDescription(){
        return this.description;
    }
    public double getPrix(){
        return this.prix;
    }
    public int getQuantite(){
        return this.quantite;
    }
    public Categorie getCategorie(){
        return this.categorie;
    }

    public void setId_produit(int id_produit){
        this.id_produit = id_produit;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setPrix(double prix){
        this.prix = prix;
    }
    public void setQuantite(int quantite){
        this.quantite = quantite;
    }
    public void setCategorie(Categorie categorie){
        this.categorie = categorie;
    }
}