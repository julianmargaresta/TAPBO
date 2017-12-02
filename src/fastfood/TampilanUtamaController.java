/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author M12RjUL14n
 */
public class TampilanUtamaController implements Initializable {

    @FXML
    private JFXCheckBox M1;
    @FXML
    private JFXCheckBox M2;
    @FXML
    private JFXCheckBox M3;
    @FXML
    private JFXCheckBox M4;
    @FXML
    private JFXCheckBox M5;
    @FXML
    private JFXCheckBox M6;
    @FXML
    private JFXCheckBox M7;
    @FXML
    private JFXCheckBox M8;
    @FXML
    private JFXCheckBox M9;
    @FXML
    private JFXCheckBox M10;
    @FXML
    private Label HargaMakanan;
    @FXML
    private Label HargaMakanan1;
    @FXML
    private Label HargaMakanan2;
    @FXML
    private Label HargaMakanan3;
    @FXML
    private Label HargaMakanan4;
    @FXML
    private TextField jumlah1;
    @FXML
    private TextField jumlah2;
    @FXML
    private TextField jumlah3;
    @FXML
    private TextField jumlah4;
    @FXML
    private TextField jumlah15;
    @FXML
    private Label HargaMakanan6;
    @FXML
    private Label HargaMakanan7;
    @FXML
    private Label HargaMakanan8;
    @FXML
    private Label HargaMakanan9;
    @FXML
    private Label HargaMakanan10;
    @FXML
    private TextField jumlah6;
    @FXML
    private TextField jumlah7;
    @FXML
    private TextField jumlah8;
    @FXML
    private TextField jumlah9;
    @FXML
    private TextField jumlah10;
    @FXML
    private JFXTextField Total;
    @FXML
    private TextArea HasilPesanan;
    @FXML
    private Button ButtonHapus;
    @FXML
    private Button Pesan;
    @FXML
    private Button Bayar;
    @FXML
    private Label me1;
    @FXML
    private Label me2;
    @FXML
    private Label me3;
    @FXML
    private Label me4;
    @FXML
    private Label me5;
    @FXML
    private Label me6;
    @FXML
    private Label me7;
    @FXML
    private Label me8;
    @FXML
    private Label me9;
    @FXML
    private Label me10;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void NasiGoreng(ActionEvent event) {
    }

    @FXML
    private void BebekGoreng(ActionEvent event) {
    }

    @FXML
    private void AyamGoreng(ActionEvent event) {
    }

    @FXML
    private void BelutGoreng(ActionEvent event) {
    }

    @FXML
    private void MieGoreng(ActionEvent event) {
    }

    @FXML
    private void Esteh(ActionEvent event) {
    }

    @FXML
    private void Esjeruk(ActionEvent event) {
    }

    @FXML
    private void EsSodaGembira(ActionEvent event) {
    }

    @FXML
    private void Joshua(ActionEvent event) {
    }

    @FXML
    private void EsBuah(ActionEvent event) {
    }
    int total1 , total2, total3, total4, total5, total6, total7, total8, total9, total10;
    int totalbayar;
    String tampilbayar;
    String menu;
    int harga;
    int jumlahmakan , jumlahminum;
    int uang , kembalian;
    int menu1,menu2,menu3,menu4,menu5,menu6,menu7,menu8,menu9,menu10;   
    
    
    @FXML
    private void Hapus(ActionEvent event) {
        HasilPesanan.setText("");
        Total.setText("");
        jumlah1.setText("");
        jumlah2.setText("");
        jumlah3.setText("");
        jumlah4.setText("");
        jumlah15.setText("");
        jumlah6.setText("");
        jumlah7.setText("");
        jumlah8.setText("");
        jumlah9.setText("");
        jumlah10.setText("");
        M1.setSelected(false);
        M2.setSelected(false);
        M3.setSelected(false);
        M4.setSelected(false);
        M5.setSelected(false);
        M6.setSelected(false);
        M7.setSelected(false);
        M8.setSelected(false);
        M9.setSelected(false);
        M10.setSelected(false);
    }

    @FXML
    private void Pesen(ActionEvent event) {
      menu1 = Integer.parseInt(jumlah1.getText());
      menu2 = Integer.parseInt(jumlah2.getText());
      menu3 = Integer.parseInt(jumlah3.getText());
      menu4 = Integer.parseInt(jumlah4.getText());
      menu5 = Integer.parseInt(jumlah15.getText());
      menu6 = Integer.parseInt(jumlah6.getText());
      menu7 = Integer.parseInt(jumlah7.getText());
      menu8 = Integer.parseInt(jumlah8.getText());
      menu9 = Integer.parseInt(jumlah9.getText());
      menu10 = Integer.parseInt(jumlah10.getText());
      HasilPesanan.setText("Menu Yang Anda Pesan : \nNasi Goreng \t\t: \t"+menu1+
                           "\nBebek Goreng \t\t: \t"+menu2+
                           "\nAyam Goreng \t\t: \t"+menu3+
                           "\nBelut Goreng \t\t: \t"+menu4+
                           "\nMie Goreng \t\t: \t"+menu5+
                           "\nEs Teh \t\t\t: \t"+menu6+
                           "\nEs jeruk \t\t\t: \t"+menu7+
                           "\nEs Soda Gembira \t: \t"+menu8+
                           "\nJoshua \t\t\t: \t"+menu9+
                           "\nEs buah \t\t\t: \t"+menu10);
    }

    @FXML
    private void Mbayar(ActionEvent event) {
        if(M1.isSelected()){
            harga = 10000;
            menu += M1.getText();
            jumlahmakan = Integer.parseInt(jumlah1.getText());
            total1 = jumlahmakan*harga;
            System.out.println(total1);
        }
        if(M2.isSelected()){
            harga = 15000;
            menu += M2.getText();
            jumlahmakan = Integer.parseInt(jumlah2.getText());
            total2 = jumlahmakan*harga;
            System.out.println(total2);
    }
    if(M3.isSelected()){
            harga = 12000;
            menu += M3.getText();
            jumlahmakan = Integer.parseInt(jumlah3.getText());
            total3 = jumlahmakan*harga;
            System.out.println(total3);
    }
    if(M4.isSelected()){
            harga = 10000;
            menu += M4.getText();
            jumlahmakan = Integer.parseInt(jumlah4.getText());
            total4 = jumlahmakan*harga;
            System.out.println(total4);
    }
    if(M5.isSelected()){
            harga = 9000;
            menu += M5.getText();
            jumlahmakan = Integer.parseInt(jumlah15.getText());
            total5 = jumlahmakan*harga;
            System.out.println(total5);
    }
    if(M6.isSelected()){
            harga = 3000;
            menu += M6.getText();
            jumlahmakan = Integer.parseInt(jumlah6.getText());
            total6 = jumlahmakan*harga;
            System.out.println(total6);
    }
    if(M7.isSelected()){
            harga = 4000;
            menu += M4.getText();
            jumlahmakan = Integer.parseInt(jumlah7.getText());
            total7 = jumlahmakan*harga;
            System.out.println(total7);
    }
    if(M8.isSelected()){
            harga = 7000;
            menu += M8.getText();
            jumlahmakan = Integer.parseInt(jumlah8.getText());
            total8 = jumlahmakan*harga;
            System.out.println(total8);
    }
    if(M9.isSelected()){
            harga = 5000;
            menu += M9.getText();
            jumlahmakan = Integer.parseInt(jumlah9.getText());
            total9 = jumlahmakan*harga;
            System.out.println(total9);
    }
    if(M10.isSelected()){
            harga = 8000;
            menu += M4.getText();
            jumlahmakan = Integer.parseInt(jumlah10.getText());
            total10 = jumlahmakan*harga;
            System.out.println(total10);
    }
    uang = Integer.parseInt(Total.getText());
    totalbayar = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9 +total10;
    tampilbayar = String.valueOf(totalbayar);
    kembalian = uang - totalbayar;
    HasilPesanan.setText("Total Harga Makanan \t: " + tampilbayar+"\nKembalian Anda \t\t: "+kembalian); 
    totalbayar = 0;
    
    }
    

}    