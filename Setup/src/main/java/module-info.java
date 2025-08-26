module com.example.setup {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.setup to javafx.fxml;
    exports com.example.setup;
}