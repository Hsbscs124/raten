module com.example.raten {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.raten to javafx.fxml;
    exports com.example.raten;
}