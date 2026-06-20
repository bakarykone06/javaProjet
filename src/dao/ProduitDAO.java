package dao;

import model.Produit;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProduitDAO {
    
    public boolean ajouter(Produit p) {
        String sql = "INSERT INTO produit"
        + " (nom, description, prix, quantite)"
        + "VALUES ( ? , ? , ? , ? )";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, p.getNom());
            ps.setString(2, p.getDescription());
            ps.setDouble(3, p.getPrix());
            ps.setInt(4, p.getQuantite());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

        public List<Produit> listerTous() {
            List<Produit> liste = new ArrayList<>();
            String sql = "SELECT * FROM produit";
            try (Connection conn = DatabaseConnection.getConnection();
                 Statement st = conn.createStatement();
                 ResultSet rs = st.executeQuery(sql)) {
                while (rs.next()) {
                    Produit p = new Produit();
                    p.setId_produit(rs.getInt("id"));
                    p.setNom(rs.getString("nom"));
                    p.setDescription(rs.getString("description"));
                    p.setPrix(rs.getDouble("prix"));
                    p.setQuantite(rs.getInt("quantite"));
                    liste.add(p);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return liste;
        }

        public boolean modifier (Produit p) {
            String sql = "UPDATE produit SET nom=?, description=?, prix=?, quantite=? WHERE id_produit=?";
            try (Connection conn = DatabaseConnection.getConnection() ;
                PreparedStatement ps = conn.prepareStatement(sql)) {
                ps . setString(1, p.getNom());
                ps . setString(2, p.getDescription());
                ps . setDouble(3, p.getPrix());
                ps . setInt(4, p.getQuantite());
                ps . setInt(5, p.getId_produit());
                return ps.executeUpdate() > 0;
                } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        }

        public boolean supprimer (int id) {
            String sql = "DELETE FROM produit WHERE id_produit=?";
            try (Connection conn = DatabaseConnection.getConnection() ;
                PreparedStatement ps = conn.prepareStatement(sql)) {
                ps . setInt(1, id);
                return ps.executeUpdate() > 0;
                } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        }
    }