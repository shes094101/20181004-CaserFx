package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MainFrame {
    public MenuItem encryption;

    public void encryption(){
        try {
            Parent root4 = FXMLLoader.load(getClass().getResource("/encryption/Caser.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root4, 500, 600));
            stage.setTitle("Caser");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
