CREATE DATABASE IF NOT EXISTS "gestion_produit";
USE "gestion_produit";

CREATE TABLE IF NOT EXISTS "categorie" (
    id_categorie INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(255) NOT NULL,
    description TEXT
);

CREATE TABLE IF NOT EXISTS "produit" (
    id_produit INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(255) NOT NULL,
    description TEXT,
    prix DOUBLE NOT NULL,
    quantite INT NOT NULL,
    id_categorie INT,
    FOREIGN KEY (id_categorie) REFERENCES categorie(id_categorie)
    );