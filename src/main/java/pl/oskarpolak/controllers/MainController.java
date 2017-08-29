package pl.oskarpolak.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXSpinner;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import pl.oskarpolak.Utils;
import pl.oskarpolak.models.dao.UserDao;
import pl.oskarpolak.models.dao.impl.UserDaoImpl;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable{

    @FXML
    JFXButton buttonLogin;

    @FXML
    JFXTextField textLogin;

    @FXML
    JFXPasswordField textPassword;

    private UserDao userDao = new UserDaoImpl();

    public void initialize(URL location, ResourceBundle resources) {
        loginButtionAction();
    }

    private void loginButtionAction() {
        buttonLogin.setOnMouseClicked(e -> {
              if(userDao.checkLogin(textLogin.getText(), textPassword.getText())){
                  Utils.openSimpleDialog("Logowanie", "Logowanie przebiegło pomyślnie");
              }else{
                  Utils.openSimpleDialog("Logowanie", "Nieprawidłowy login lub hasło");
              }
        });
    }
}
