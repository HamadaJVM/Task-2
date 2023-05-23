module com.example.task2_goi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task2_goi to javafx.fxml;
    exports com.example.task2_goi;
}