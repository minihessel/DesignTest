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
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Eskil Hesselroth
 */
public class FXMLDocumentController1 implements Initializable {

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
    AnchorPane anchorPaneTables;

    @FXML
    AnchorPane anchorPaneVisualize;

    @FXML
    SplitPane splitPane;

    @FXML
    TabPane tabPane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void setMainApp(FXMLDocumentController1 fxmlDocumentController) {
        this.tabPane = tabPane;

    }

}
