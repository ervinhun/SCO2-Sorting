module dk.easv.visualizealgorithm {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens dk.easv.visualizealgorithm to javafx.fxml;
    exports dk.easv.visualizealgorithm;
}