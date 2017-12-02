/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author M12RjUL14n
 */
public class RegisterController implements Initializable {
    
    ObservableList<String> list1= FXCollections.observableArrayList("Laki-Laki", "Perempuan");
    
    @FXML
    private ImageView GB1;
    @FXML
    private Label label;
    @FXML
    private ImageView GB2;
    @FXML
    private JFXTextField Username;
    @FXML
    private JFXTextField Password;
    @FXML
    private JFXButton Submit;
    @FXML
    private JFXTextField Password1;
    @FXML
    private JFXTextField Try;
    @FXML
    private TextArea TA;
    @FXML
    private Button Login;
    @FXML
    private Text Text;
    private Connection conn = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    @FXML
    private JFXComboBox<String> gender;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        conn = koneksi.konek.koneksi();
        gender.setItems(list1);
    }    

    @FXML
    private void Username(ActionEvent event) {
    }

    @FXML
    private void Password(ActionEvent event) {
    }

    @FXML
    private void Submit(ActionEvent event)throws SQLException {
        String user = Username.getText();
        String pass = Password.getText();
        String no = Try.getText();
        String email = Password1.getText();
        String sql = "INSERT INTO `register`(`username`, `password`, `telfon`, `email`) VALUES (?,?,?,?)";
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, user);
            stmt.setString(2, pass);
            stmt.setString(3, no);
            stmt.setString(4, email);
            int i = stmt.executeUpdate();
            if (i == 1){
                JOptionPane.showMessageDialog(null, "Berhasil");
                try {
                    // Hide this current window (if this is what you want)
                    ((Node)(event.getSource())).getScene().getWindow().hide();

                    // Load the new fxml
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("Login.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());

                    // Create new stage (window), then set the new Scene
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("TomboLuwe");
                    stage.show();

                } catch (IOException e) {
                    System.out.println("Failed to create new Window." + e);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Berhasil");
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @FXML
    private void Email(ActionEvent event) {
    }

    @FXML
    private void Try(ActionEvent event) {
    }

    @FXML
    private void Login(ActionEvent event) {
    }
    
}
