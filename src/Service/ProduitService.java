/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entité.Product;
import connexion.MaConnexion;
import java.sql.*;
import java.util.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


/**
 *
 * @author lenovo
 */
public class ProduitService {
    public Connection cnx;
     public PreparedStatement ste;
    public ProduitService() {
    cnx = MaConnexion.getInstance().getconnection();
}

  public void ajouterProduit(Product p)  {
         
//        System.out.println("Nom");
//        Scanner sc1 = new Scanner(System.in);
//        String b = sc1.nextLine();
//        System.out.println("Marque");
//        Scanner sc2 = new Scanner(System.in);
//        String c = sc2.nextLine();
//        System.out.println("Categorie");
//        Scanner sc3 = new Scanner(System.in);
//        String d = sc3.nextLine();
//        System.out.println("Prix");
//        Scanner sc4 = new Scanner(System.in);
//        double e = sc4.nextDouble();
//        Produit p = new Produit(b,c,d,e);
       try {
      String sql = "insert into product (id,Nom_p,Marque_p,categorie_id,Prix_p,quantite_p,filename)" + "values(?,?,?,?,?,?,?)";
      ste=cnx.prepareStatement(sql);
      ste.setInt(1, p.getId());
      ste.setString(2, p.getNom_p());
      ste.setString(3, p.getMarque_p());
      ste.setInt(4, p.getCategorie_id());
      ste.setDouble(5, p.getPrix_p());
      ste.setInt(6, p.getQuantite_p());
      ste.setString(7, p.getFilename());
      ste.executeUpdate();
  }catch (SQLException ex) { System.out.println(ex);
}
  }
  
  
//  public void modifierProduit(Produit art)  {
//      
//          try {
//            String req = "UPDATE product SET Nom_Produit=?,Marque_Produit=?,Categorie_Produit=?,Prix_Produit=?,quantite=? WHERE Id_Produit =?";
//            PreparedStatement pst2 = cnx.prepareStatement(req);
//            pst2.setString(1, art.getNom_p());
//            pst2.setString(2, art.getMarque_p());
//            pst2.setString(3, art.getCategorie_id());
//             pst2.setInt(4, art.getQuantite_p());
//            pst2.setDouble(5, art.getPrix_p());
//            pst2.executeUpdate();
//
//        } catch (SQLException ex) {
//            System.err.println(ex.getMessage());
//        }
//
//  }
//    
      
    public void supprimerProduit()  {
        try {
        System.out.println("entre l Id de product a supprimer");
        Scanner sc5 = new Scanner(System.in);
        String f = sc5.nextLine();
      
      String sql = "delete from product where id="+f;
      ste=cnx.prepareStatement(sql);
      ste.executeUpdate();
  }catch (SQLException ex) { System.out.println(ex);
}}
 
public void afficherProduit() throws SQLException 
{      
}
  
  public List<Product> AffichierProduitt() {

      ObservableList<Product> list = FXCollections.observableArrayList();
        try {
           String sql = "Select a.Nom_p, a.Marque_p, a.Prix_p,a.Quantite_p,a.filename from product a ";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
           
            while (rs.next()) {
               list.add(new Product(rs.getString(1),rs.getString(2),rs.getDouble(3), rs.getInt(4),rs.getString(5)));
               }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return list;
    }
}