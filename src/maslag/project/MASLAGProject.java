///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package maslag.project;
//
//import Entité.Produit;
//import connexion.MaConnexion;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import service.ProduitService;
//import java.util.*;
//
///**
// *
// * @author lenovo
// */
//public class MASLAGProject {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) throws SQLException {
//   
//        
//          MaConnexion mc = MaConnexion.getInstance() ; 
//        Produit p2 = new Produit(1,"v","s","x",45);
//        ProduitService ps = new ProduitService();
//        ps.modifierProduit(p2, 1);
//
////        List<Produit> c = new ArrayList<Produit>();
////      Scanner s = new Scanner(System.in);
////      Scanner s1 = new Scanner(System.in);
////      int ch;
////      do{
////         System.out.println("1.INSERT");
////         System.out.println("2.DELETE");
////         System.out.println("3.afficher");
////         System.out.println("4.UPDATE");
////         System.out.print("Enter Your Choice : ");
////         ch = s.nextInt();
////
////         switch(ch){
////       
////        case 1:
////            List<Produit> Produit = new ArrayList<>();
////            MaConnexion mc = MaConnexion.getInstance() ; 
////            ProduitService ps = new ProduitService();
////            ps.ajouterProduit(); 
////        break;
////        case 2: 
////            List<Produit> Produits = new ArrayList<>();
////            MaConnexion mci = MaConnexion.getInstance() ; 
////            ProduitService pm = new ProduitService();
////            pm.supprimerProduit();
////          break;
////          case 3: 
////            List<Produit> Produitss = new ArrayList<>();
////            MaConnexion mcis = MaConnexion.getInstance() ; 
////            ProduitService pms = new ProduitService();
////            pms.afficherProduit();
////          break;
////          case 4: 
////            List<Produit> Produitsss = new ArrayList<>();
////            MaConnexion mcisss = MaConnexion.getInstance() ; 
////            ProduitService pmsss = new ProduitService();
////         {
////             Produit p = null;
////             pmsss.modifierProduit(p, ch);
////         }
////          break;
////         }
////      }while(ch!=0);
////        
//      
//    }   
//    
//    
//
//    
//    
//}
