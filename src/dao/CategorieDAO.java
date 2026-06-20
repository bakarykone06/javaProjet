package dao;

import model.Categorie;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategorieDAO {
    
    public boolean ajouter(Categorie c){
        String sql = "INSERT INTO Categorie"
            +"(nom,description)"
            +"VALUES(?,?)";
            try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
                ps.setString(1, c.getNom());
                ps.setString(2, c.getDescription());
                return ps.executeUpdate() >0;
                } catch (SQLException ex){
                    ex.printStackTrace();
                    return false;
                }
            }

            public List<Categorie> listerTous(){
                List<Categorie> liste = new ArrayList<>();
                String sql = "SELECT * FROM Categorie";
                try(Connection conn = DatabaseConnection.getConnection();
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(sql)) {
                        while (rs.next()){
                            Categorie c = new Categorie();
                            c.setId_categorie(rs.getInt("id"));
                            c.setNom(rs.getString("nom"));
                            c.setDescription(rs.getString("description"));
                            liste.add(c);
                        }
                    } catch (SQLException ex){
                        ex.printStackTrace();
                    }return liste;
            }
                    public boolean modifier(Categorie c){
                        String sql = "UPDATE Categorie SET nom=?, description=? WHERE id_categorie=?";
                        try(Connection conn = DatabaseConnection.getConnection();
                            PreparedStatement ps = conn.prepareStatement(sql)){
                            ps.setString(1, c.getNom());
                            ps.setString(2, c.getDescription());
                            ps.setInt(3, c.getId_categorie());
                            return ps.executeUpdate() >0;
                        } catch (SQLException ex){
                            ex.printStackTrace();
                            return false;
                        }
            }

    }
