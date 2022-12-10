module hu.petrik.restclient.vargazsigmond_javafxrestclientdolgozat {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    opens hu.petrik.restclient.vargazsigmond_javafxrestclientdolgozat to javafx.fxml, com.google.gson;
    exports hu.petrik.restclient.vargazsigmond_javafxrestclientdolgozat;
}