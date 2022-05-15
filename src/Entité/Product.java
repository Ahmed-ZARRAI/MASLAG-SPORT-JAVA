/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entité;

/**
 *
 * @author ahmed
 */
public class Product {
    private int id ;
    private String Nom_p ;
    private String Marque_p ;
    private int categorie_id ;
    private double Prix_p ;
    private int Quantite_p;
    private String filename;
     
     
     
     
 
       public Product() {
    }

   

       
       

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    public Product(String Nom_p, String Marque_p, double Prix_p, int Quantite_p) {
        this.Nom_p = Nom_p;
        this.Marque_p = Marque_p;
        this.Prix_p = Prix_p;
        this.Quantite_p = Quantite_p;
    }

    public Product(int id, String Nom_p, String Marque_p, int categorie_id, double Prix_p, int Quantite_p) {
        this.id = id;
        this.Nom_p = Nom_p;
        this.Marque_p = Marque_p;
        this.categorie_id = categorie_id;
        this.Prix_p = Prix_p;
        this.Quantite_p = Quantite_p;
    }

    public Product(String Nom_p, String Marque_p, double Prix_p, int Quantite_p, String filename) {
        this.Nom_p = Nom_p;
        this.Marque_p = Marque_p;
        this.Prix_p = Prix_p;
        this.Quantite_p = Quantite_p;
        this.filename = filename;
    }

    public Product(int id, String Nom_p, String Marque_p, int categorie_id, double Prix_p, int Quantite_p, String filename) {
        this.id = id;
        this.Nom_p = Nom_p;
        this.Marque_p = Marque_p;
        this.categorie_id = categorie_id;
        this.Prix_p = Prix_p;
        this.Quantite_p = Quantite_p;
        this.filename = filename;
    }

    public Product(String Nom_p, String Marque_p, int categorie_id, int Quantite_p, String filename) {
        this.Nom_p = Nom_p;
        this.Marque_p = Marque_p;
        this.categorie_id = categorie_id;
        this.Quantite_p = Quantite_p;
        this.filename = filename;
    }

    public Product(String Nom_p, String Marque_p, int categorie_id, double Prix_p, int Quantite_p) {
        this.Nom_p = Nom_p;
        this.Marque_p = Marque_p;
        this.categorie_id = categorie_id;
        this.Prix_p = Prix_p;
        this.Quantite_p = Quantite_p;
    }

    public Product(int id, String Nom_p, String Marque_p, int categorie_id, double Prix_p) {
        this.id = id;
        this.Nom_p = Nom_p;
        this.Marque_p = Marque_p;
        this.categorie_id = categorie_id;
        this.Prix_p = Prix_p;
    }

    public Product(String Nom_p, String Marque_p, double Prix_p) {
        this.Nom_p = Nom_p;
        this.Marque_p = Marque_p;
        this.Prix_p = Prix_p;
    }

    public Product(String Nom_p, String Marque_p, int categorie_id, double Prix_p) {
        this.Nom_p = Nom_p;
        this.Marque_p = Marque_p;
        this.categorie_id = categorie_id;
        this.Prix_p = Prix_p;
    }

    public Product(String Nom_p, String Marque_p, int categorie_id, double Prix_p, int Quantite_p, String filename) {
        this.Nom_p = Nom_p;
        this.Marque_p = Marque_p;
        this.categorie_id = categorie_id;
        this.Prix_p = Prix_p;
        this.Quantite_p = Quantite_p;
        this.filename = filename;
    }
    
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_p() {
        return Nom_p;
    }

    public void setNom_p(String Nom_p) {
        this.Nom_p = Nom_p;
    }

    public String getMarque_p() {
        return Marque_p;
    }

    public void setMarque_p(String Marque_p) {
        this.Marque_p = Marque_p;
    }

    public int getCategorie_id() {
        return categorie_id;
    }

    public void setCategorie_id(int categorie_id) {
        this.categorie_id = categorie_id;
    }

    public double getPrix_p() {
        return Prix_p;
    }

    public void setPrix_p(double Prix_p) {
        this.Prix_p = Prix_p;
    }

    public int getQuantite_p() {
        return Quantite_p;
    }

    public void setQuantite_p(int Quantite_p) {
        this.Quantite_p = Quantite_p;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    
    
    
    
    
    
    
    public Product(String a, String b, String c, String d, String e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    


    

   


    }




