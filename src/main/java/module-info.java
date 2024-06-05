module org.example.hri {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.hri to javafx.fxml;
    exports org.example.hri;
}