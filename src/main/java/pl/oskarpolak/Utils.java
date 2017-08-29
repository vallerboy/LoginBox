package pl.oskarpolak;

import javafx.scene.control.Alert;

/**
 * Created by Lenovo on 29.08.2017.
 */
public class Utils {
    public static void openSimpleDialog(String title, String message){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.setHeaderText("");
        alert.show();
    }
}
