package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class View1Controller {
    
    @FXML private StackPane stackPane;
    
    public void switchRoot() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("view2.fxml"));
        stackPane.getScene().setRoot(root);
    }
}
