package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class View2Controller {

    @FXML private Button button;
    @FXML private Button enable;
    @FXML private Button disable;

    public void enable(ActionEvent actionEvent) {
        button.setDisable(false);
    }

    public void disable(ActionEvent actionEvent) {
        button.setDisable(true);
    }
}
