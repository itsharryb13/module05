module org.example.module05 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.module05 to javafx.fxml;
    exports org.example.module05;
}