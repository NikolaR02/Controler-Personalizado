module com.example.controlespersonalisados {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.controlespersonalisados to javafx.fxml;
    exports com.example.controlespersonalisados;
}