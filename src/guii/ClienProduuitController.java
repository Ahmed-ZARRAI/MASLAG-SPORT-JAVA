/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guii;

import Entité.Product;
import connexion.MaConnexion;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class ClienProduuitController implements Initializable {
   public Connection cnx;
     public PreparedStatement ste;
    @FXML
    private TableView<Product> tab;
    @FXML
   private TableColumn<Product, String> nomb;
    @FXML
     private TableColumn<Product, String> marqb;
    @FXML
     private TableColumn<Product, String> catb;
    @FXML
     private TableColumn<Product, String> prixb;
     private TableColumn<Product, String> quanb;
     private TableColumn<Product, String> imbb;
    @FXML
    private TextField liensearch;
    @FXML
    private Button search;
    
     ObservableList<Product>  ProduitList = FXCollections.observableArrayList();
    @FXML
    private Button retc;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          try {
        cnx = MaConnexion.getInstance().getconnection();
        ResultSet rs = cnx.createStatement().executeQuery("SELECT * FROM produit");
        while (rs.next()){
        Product p = new Product ();
  //      ProduitList.add(new Product(
     //           rs.getString("Nom_Produit"),
      //  rs.getString("Marque_Produit"),
      //  rs.getString("Categorie_Produit"),
      //  rs.getDouble("Prix_Produit")
       // rs.getInt("quantite"),
       // rs.getString("image")
      //  ));
        }
        tab.setItems(ProduitList);
        } catch (SQLException ex) {
        Logger.getLogger(AjouterProduitController.class.getName()).log(Level.SEVERE, null, ex);
        }
       // imbb.setCellValueFactory(new PropertyValueFactory<>("image"));
        nomb.setCellValueFactory(new PropertyValueFactory<>("Nom_Produit"));
        marqb.setCellValueFactory(new PropertyValueFactory<>("Marque_Produit"));
        catb.setCellValueFactory(new PropertyValueFactory<>("Categorie_Produit"));
        prixb.setCellValueFactory(new PropertyValueFactory<>("Prix_Produit"));
        //quanb.setCellValueFactory(new PropertyValueFactory<>("quantite"));
    }    

    @FXML
    private void lsaction(ActionEvent event) {
    }

    @FXML
    private void searchab(ActionEvent event) {
        Product p = new Product();
      
        ObservableList<Product> ProduitList1 = this.ProduitList;
        
       
            nomb.setCellValueFactory(new PropertyValueFactory<>("Nom_Produit"));
        marqb.setCellValueFactory(new PropertyValueFactory<>("Marque_Produit"));
        catb.setCellValueFactory(new PropertyValueFactory<>("Categorie_Produit"));
        prixb.setCellValueFactory(new PropertyValueFactory<>("Prix_Produit"));
        //quanb.setCellValueFactory(new PropertyValueFactory<>("quantite"));

        tab.setItems(ProduitList1);
        FilteredList<Product> filteredData = new FilteredList<>(ProduitList1, b -> true);
        liensearch.textProperty().addListener((observable, oldValue, newValue) -> {
        
        filteredData.setPredicate((Product art) -> {
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }
                String lowerCaseFilter = newValue.toLowerCase();

                if (art.getNom_p().toLowerCase().indexOf(lowerCaseFilter) != -1 ) {
					return true; 
				} else if (art.getMarque_p().toLowerCase().indexOf(lowerCaseFilter) != -1) {
					return true; 
				}
                             
                                else if (String.valueOf(art.getPrix_p()).indexOf(lowerCaseFilter)!=-1){
				     return true;
                                }
                               
				     else  
				    	 return false; 
			});
		});
        SortedList<Product> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(tab.comparatorProperty());
        tab.setItems(sortedData);
    }

    @FXML
    private void retac(ActionEvent event) {
    }
    
}
