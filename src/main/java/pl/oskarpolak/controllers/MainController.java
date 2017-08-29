package pl.oskarpolak.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXSpinner;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable{

    @FXML
    JFXButton buttonLogin;

    @FXML
    JFXTextField textLogin;

    @FXML
    JFXPasswordField textPassword;

    public void initialize(URL location, ResourceBundle resources) {
        loginButtionAction();
    }

    private void loginButtionAction() {
        buttonLogin.setOnMouseClicked(e -> {
            //akcja logowania
        });
    }
}
