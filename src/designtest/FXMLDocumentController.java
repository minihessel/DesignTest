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
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

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
    AnchorPane anchorPaneTables;

    @FXML
    AnchorPane anchorPaneVisualize;

    @FXML
    SplitPane splitPane;

    @FXML
    TabPane tabPane;
    @FXML
    AnchorPane anchorPane;
        @FXML
    VBox vBox;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        TreeItem<String> rootItem = new TreeItem<String>("Inbox");
        rootItem.setExpanded(true);
        for (int i = 1; i < 6; i++) {
            TreeItem<String> item = new TreeItem<String>("Message" + i);
            rootItem.getChildren().add(item);
        }
        TreeView<String> tree = new TreeView<String>(rootItem);
        vBox.getChildren().add(tree);

        TreeItem<String> rootItem2 = new TreeItem<String>("Inbox1");
        rootItem.setExpanded(true);
        for (int i = 1; i < 6; i++) {
            TreeItem<String> item = new TreeItem<String>("Message" + i);
            rootItem.getChildren().add(item);
        }
        TreeView<String> tree2 = new TreeView<String>(rootItem2);
        vBox.getChildren().add(tree2);
        
                TreeItem<String> rootItem3 = new TreeItem<String>("Inbox1");
        rootItem.setExpanded(true);
        for (int i = 1; i < 6; i++) {
            TreeItem<String> item = new TreeItem<String>("Message" + i);
            rootItem.getChildren().add(item);
        }
        TreeView<String> tree3 = new TreeView<String>(rootItem3);
        vBox.getChildren().add(tree3);

    }

    @FXML
    private void visualizeButton(ActionEvent event) {
        anchorPaneVisualize.setVisible(true);
        anchorPaneTables.setVisible(false);

    }

    @FXML
    private void handleDataButton(ActionEvent event) {
        anchorPaneVisualize.setVisible(false);
        anchorPaneTables.setVisible(true);
    }

    @FXML
    private void newConnectionButton(ActionEvent event) {

    }

    @FXML
    private void barChartButton(ActionEvent event) {

    }

    @FXML
    private void pieChartButton(ActionEvent event) {

    }

    @FXML
    private void lineChartButton(ActionEvent event) {

    }

    @FXML
    private void combineButton(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Tab tab = new Tab();

        Image nodeImage = new Image(
                getClass().getResourceAsStream("dataTable.png"));

        tab.setGraphic(new ImageView(nodeImage));
        tab.setText("asd");
        tabPane.getTabs().add(tab);
    }

}
