package org.arias.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.arias.application.App;
import org.arias.utils.Paths;

public class ControllerClass1 {


    @FXML
    void cambiarEscena(ActionEvent event) {
        App.app.setScene(Paths.SCENA2);
    }
}
