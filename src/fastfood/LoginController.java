/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author M12RjUL14n
 */
public class LoginController implements Initializable {

    @FXML
    private Label status;
    @FXML
    private JFXTextField Usrname;
    @FXML
    private JFXPasswordField Pssword;
    @FXML
    private JFXButton Btn1;
    @FXML
    private JFXButton Btn2;
    
    private Connection conn = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        conn = koneksi.konek.koneksi();
    }    

    @FXML
    private void Login(ActionEvent event) throws SQLException {
        String user = Usrname.getText();
        String pass = Pssword.getText();
        String sql = "select * from register where username = ? && password = ?";
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, user);
            stmt.setString(2, pass);
            rs = stmt.executeQuery();
            while(rs.next()){
                try {
                    JOptionPane.showMessageDialog(null, "Wellcome");
                    // Hide this current window (if this is what you want)
                    ((Node)(event.getSource())).getScene().getWindow().hide();

                    // Load the new fxml
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("TampilanUtama2.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());

                    // Create new stage (window), then set the new Scene
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("Fastfood");
                    stage.show();

                } catch (IOException e) {
                    System.out.println("Failed to create new Window." + e);
                }
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }

    @FXML
    private void Daftar(ActionEvent event) throws IOException {
         ((Node)(event.getSource())).getScene().getWindow().hide();

                    // Load the new fxml
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("Register.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());

                    // Create new stage (window), then set the new Scene
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("");
                    stage.show();
    }

}
