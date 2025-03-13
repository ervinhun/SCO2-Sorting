module dk.easv.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.demo to javafx.fxml;
    exports dk.easv.demo;
}