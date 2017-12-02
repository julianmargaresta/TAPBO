/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author M12RjUL14n
 */
public class TampilanUtama2Controller implements Initializable {

    @FXML
    private JFXCheckBox M1;
    @FXML
    private JFXCheckBox M2;
    @FXML
    private JFXCheckBox M3;
    @FXML
    private JFXCheckBox M4;
    @FXML
    private JFXTextField Jumlah1;
    @FXML
    private JFXTextField Jumlah2;
    @FXML
    private JFXTextField Jumlah3;
    @FXML
    private JFXTextField Jumlah4;
    @FXML
    private JFXCheckBox M5;
    @FXML
    private JFXCheckBox M6;
    @FXML
    private JFXCheckBox M7;
    @FXML
    private JFXCheckBox M8;
    @FXML
    private JFXTextField Jumlah5;
    @FXML
    private JFXTextField Jumlah6;
    @FXML
    private JFXTextField Jumlah7;
    @FXML
    private JFXTextField Jumlah8;
    private TextArea Hasil;
    @FXML
    private JFXTextField name;
    @FXML
    private JFXTextField bayar;
    @FXML
    private JFXButton Cetak;
    @FXML
    private JFXButton Hapus;
    @FXML
    private JFXTextArea TotalHasil;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }   
    String menu="";
    int jumlahmakan;
    int harga;
    int total1,total2,total3,total4,total5,total6,total7,total8;
    String daftar,nama;
    int jumlah,kembalian;
    int totalsemua;
    @FXML
    private void hasil(ActionEvent event) {
        if(M1.isSelected()){
            harga = 55000;
            menu += M1.getText()+"\t"+Integer.parseInt(Jumlah1.getText())+"\n";
            jumlahmakan = Integer.parseInt(Jumlah1.getText());
            total1 = harga*jumlahmakan;
        }
         if(M2.isSelected()){
            harga = 60000;
            menu += M2.getText()+"\t\t"+Integer.parseInt(Jumlah2.getText())+"\n";
            jumlahmakan = Integer.parseInt(Jumlah2.getText());
            total2 = harga*jumlahmakan;
        }
          if(M3.isSelected()){
            harga = 80000;
            menu += M3.getText()+"\t\t\t\t"+Integer.parseInt(Jumlah3.getText())+"\n";
            jumlahmakan = Integer.parseInt(Jumlah3.getText());
            total3 = harga*jumlahmakan;
        }
           if(M4.isSelected()){
            harga = 40000;
            menu += M4.getText()+"\t\t\t"+Integer.parseInt(Jumlah4.getText())+"\n";
            jumlahmakan = Integer.parseInt(Jumlah4.getText());
            total4 = harga*jumlahmakan;
        }
            if(M5.isSelected()){
            harga = 15000;
            menu += M5.getText()+"\t\t\t"+Integer.parseInt(Jumlah5.getText())+"\n";
            jumlahmakan = Integer.parseInt(Jumlah5.getText());
            total5 = harga*jumlahmakan;
        }
             if(M6.isSelected()){
            harga = 20000;
            menu += M6.getText()+"\t\t\t\t"+Integer.parseInt(Jumlah6.getText())+"\n";
            jumlahmakan = Integer.parseInt(Jumlah6.getText());
            total6 = harga*jumlahmakan;
        }
            if(M7.isSelected()){
            harga = 17000;
            menu += M7.getText()+"\t\t\t"+Integer.parseInt(Jumlah7.getText())+"\n";
            jumlahmakan = Integer.parseInt(Jumlah7.getText());
            total7 = harga*jumlahmakan;
        }
            if(M8.isSelected()){
            harga = 25000;
            menu += M8.getText()+"\t\t\t"+Integer.parseInt(Jumlah8.getText());
            jumlahmakan = Integer.parseInt(Jumlah8.getText());
            total8 = harga*jumlahmakan;
        }
         totalsemua = total1+total2+total3+total4+total5+total6+total7+total8;
        jumlah = Integer.parseInt(bayar.getText());
        kembalian = jumlah-totalsemua;
        nama = name.getText();
        TotalHasil.setText("Atas Nama \t\t: "+nama
                            +"\nMenu yang Dipesan : \n"+menu
                            +"\nTotal Harga Makanan : "+totalsemua
                            +"\nUang Kembalian Anda : "+kembalian);
        menu=" ";
        jumlah = 0;
        nama = " ";
    }

    @FXML
    private void hapus(ActionEvent event) {
        name.setText("");
        bayar.setText("");
        TotalHasil.setText("");
        Jumlah1.setText("");
        Jumlah2.setText("");
        Jumlah3.setText("");
        Jumlah4.setText("");
        Jumlah5.setText("");
        Jumlah6.setText("");
        Jumlah7.setText("");
        Jumlah8.setText("");
        M1.setSelected(false);
        M2.setSelected(false);
        M3.setSelected(false);
        M4.setSelected(false);
        M5.setSelected(false);
        M6.setSelected(false);
        M7.setSelected(false);
        M8.setSelected(false);
    }
    
}
