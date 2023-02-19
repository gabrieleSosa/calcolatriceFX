module com.example.esercitazionecalcolatricefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.esercitazionecalcolatricefx to javafx.fxml;
    exports com.example.esercitazionecalcolatricefx;
}