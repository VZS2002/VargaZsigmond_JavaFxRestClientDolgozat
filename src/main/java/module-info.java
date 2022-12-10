module hu.petrik.restclient.vargazsigmond_javafxrestclientdolgozat {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens hu.petrik.restclient.vargazsigmond_javafxrestclientdolgozat to javafx.fxml;
    exports hu.petrik.restclient.vargazsigmond_javafxrestclientdolgozat;
}