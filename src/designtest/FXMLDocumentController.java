/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designtest;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Eskil Hesselroth
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    Button visualizeButton;

    @FXML
    Button newConnectionButton;

    @FXML
    Button combineButton;
    final Tooltip tooltip = new Tooltip();
    
    @FXML
    AnchorPane visualizeAnchorPane;
   
    @FXML
    AnchorPane connectToDatabaseAnchorPane;
    
    @FXML SplitPane splitPane;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");

    }
    
    @FXML
    private void visualizeButton(ActionEvent event) {
    visualizeAnchorPane.setVisible(true);
        connectToDatabaseAnchorPane.setVisible(false);

    }
     @FXML
    private void newConnectionButton(ActionEvent event) {
    visualizeAnchorPane.setVisible(false);
        connectToDatabaseAnchorPane.setVisible(true);

    }
    
     @FXML
    private void combineButton(ActionEvent event) {
    visualizeAnchorPane.setVisible(false);
        connectToDatabaseAnchorPane.setVisible(true);

    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
