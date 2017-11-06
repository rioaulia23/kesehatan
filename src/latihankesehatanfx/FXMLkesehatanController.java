/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihankesehatanfx;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SuperJeje
 */
public class FXMLkesehatanController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private RadioButton P;
    @FXML
    private RadioButton L;
    @FXML
    private JFXTextField nama;
    @FXML
    private JFXTextField tinggi;
    @FXML
    private JFXTextField bb;
    @FXML
    private Button proses;
    @FXML
    private Button hapus;
    @FXML
    private TextField beratIdeal;
    @FXML
    private TextArea ta1;
    @FXML
    private TextArea ta2;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        if(!(nama.getText().equals("") || tinggi.getText().equals("") || bb.getText().equals("") || L.isSelected() || P.isSelected()) ){
            JOptionPane.showMessageDialog(null, "Harap Lengkapi Data Anda");
        }else{
        int ideal = 0;
        String ta22 = "";
        String ta11 = "";
        String Nama = nama.getText();
        int Tinggi = Integer.parseInt(tinggi.getText());
        int berat = Integer.parseInt(bb.getText());
        
        if(L.isSelected()){
            ideal = Tinggi - 110;
            if(ideal == berat){
                ta11 = "ideal";
                ta22 = "Saran : \nOKE Pertahankan itu !";
            }
            else if(ideal > berat){
                ta11 = "Underweight";
                ta22 = "Saran = \n1.Makanlah makanan yang banyak mengandung gizi dan protein\n2.Tingkatkan berat badan anda!";
            }
            else if(ideal < berat){
                ta11 = "Overweight";
                ta22 = "Saran = \n1.Makanlah makanan yang banyak mengandung serat\n2.Rajinlah dalam berolahraga\n3.Turunkan berat badan anda!";
            }
            
        }
        else if(P.isSelected()){
            ideal = Tinggi - 100;
            if(ideal == berat ){
                ta11 = "ideal";
                ta22 = "Saran = \nOKE Pertahankan itu!";
            }
            else if (ideal > berat){
                ta11 = "Underweight";
                ta22 = "Saran = \n1.Makanlah makanan yang banyak mengandung gizi dan protein\n2.Tingkatkan berat badan anda!";
            }
            else if(ideal < berat){
            ta11 = "Overweight";
                ta22 = "Saran = \n1.Makanlah makanan yang banyak mengandung serat\n2.Rajinlah dalam berolahraga\n3.Turunkan berat badan anda!";
            }
        }
            beratIdeal.setText(""+ideal);
            ta1.setText("Nama : "+Nama+"\nBerat Badan :"+berat+"\nTinggi Badan : "+Tinggi+"\nAnalisa : "+ta11);
            ta2.setText(ta22);
        }
    }
    @FXML
    void hapus(ActionEvent event) {
        nama.setText("");
        tinggi.setText("");
        bb.setText("");
        beratIdeal.setText("");
        L.setSelected(false);
        P.setSelected(false);
        ta1.setText("");
        ta2.setText("");
    }
}
    

   

