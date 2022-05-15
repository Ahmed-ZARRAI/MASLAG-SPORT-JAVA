/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import Entité.Product;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.util.List;



/**
 *
 * @author skander
 */
public class ServicePDFp {
    public void liste_ProduitPDF() throws FileNotFoundException, DocumentException, SQLException {

        ProduitService rs = new ProduitService();
        String message = "Voici la liste des Produits \n\n";
        String file_name = "src/PDF/liste_produit.pdf";
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(file_name));
        document.open();
        Paragraph para = new Paragraph(message);
        document.add(para);
        List<Product> pr = rs.AffichierProduitt();
        PdfPTable tablee = new PdfPTable(4);

        PdfPCell cl = new PdfPCell(new Phrase("Nom_Produit"));
        tablee.addCell(cl);
        PdfPCell c2 = new PdfPCell(new Phrase("Marque_Produit"));
        tablee.addCell(c2);
        PdfPCell c3 = new PdfPCell(new Phrase("quantite"));
        tablee.addCell(c3);
        PdfPCell c4 = new PdfPCell(new Phrase("Prix_Produit"));
        tablee.addCell(c4);
        tablee.setHeaderRows(1);
        document.add(tablee);

        int i = 0;
        for (i = 0; i < pr.size(); i++) {
            tablee.addCell("" + pr.get(i).getNom_p());
            tablee.addCell("" + pr.get(i).getMarque_p());
             tablee.addCell("" + pr.get(i).getQuantite_p());
            tablee.addCell("" + pr.get(i).getPrix_p());

        }
        document.add(tablee);

        document.close();

    }
     
    
}
