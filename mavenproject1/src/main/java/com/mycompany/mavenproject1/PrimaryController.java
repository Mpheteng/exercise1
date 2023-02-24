package com.mycompany.mavenproject1;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML
    private Label LABEL_ID;

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
int n=0;
    @FXML
    private void INCREASE_BUTTON_HANDLER(ActionEvent event) {
      
        LABEL_ID.setText(String.valueOf(++n));
    }

    @FXML
    private void DECREASE_BUTTON_HANDLER(ActionEvent event) {
        LABEL_ID.setText(String.valueOf(--n));
    }
}
