package com.example.task2_goi;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private Button btn_complete;

    @FXML
    private Button btn_done;

    @FXML
    private Button btn_next;

    @FXML
    private Button btn_rest;

    @FXML
    private Label q1;
    @FXML
    private Label q2;

    @FXML
    private Label q3;

    @FXML
    private Label q4;

    @FXML
    private Label q5;

    @FXML
    private Label q6;

    @FXML
    private Label q7;
    @FXML
    private Label q8;
    @FXML
    private Label q9;
    @FXML
    private Label q10;

    @FXML
    void Complete(ActionEvent event) {

    }
    @FXML
    void Next(ActionEvent event) {

    }

    @FXML
    void Rest(ActionEvent event) {
    }
    @FXML
    void Done(ActionEvent event)  {
        q1.setText(getChoice(null));
        System.out.println(getChoice(null));

        if (getChoice(null) == null){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setContentText("Please choose your phone type");
        alert.showAndWait();}

    }
    String getChoice(ActionEvent event) {
        return comboBox.getValue();
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBox.setItems(FXCollections.observableArrayList("Apple","Samsung","Huawei", "Poco"));
        comboBox.setOnAction(this::getChoice);
    }
}