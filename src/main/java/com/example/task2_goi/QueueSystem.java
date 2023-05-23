package com.example.task2_goi;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class QueueSystem extends Application {
    private int customerCount = 0;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Queue System");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        Label customerLabel = new Label("Customers waiting:");
        GridPane.setConstraints(customerLabel, 0, 0);

        Label customerCountLabel = new Label("0");
        GridPane.setConstraints(customerCountLabel, 1, 0);

        Button addCustomerButton = new Button("Add Customer");
        GridPane.setConstraints(addCustomerButton, 0, 1);

        Button removeCustomerButton = new Button("Remove Customer");
        GridPane.setConstraints(removeCustomerButton, 1, 1);

        grid.getChildren().addAll(customerLabel, customerCountLabel, addCustomerButton, removeCustomerButton);

        addCustomerButton.setOnAction(e -> {
            customerCount++;
            customerCountLabel.setText(Integer.toString(customerCount));
        });

        removeCustomerButton.setOnAction(e -> {
            if (customerCount > 0) {
                customerCount--;
                customerCountLabel.setText(Integer.toString(customerCount));
            }
        });

        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
