package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
    public String id="";
    public PasswordField textPassword;
    public TextField textField;
    public Alert alert = new Alert(Alert.AlertType.INFORMATION);

    public void keyboard1(){
        id=textField.getText();
        System.out.println(id);
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("keyboard.fxml"));
            Parent root2 = loader.load();
            Keyboard keyboard = loader.getController();
            keyboard.passworld_field(textPassword);
            Stage stage = new Stage();
            stage.setScene(new Scene(root2, 500, 600));
            stage.setTitle("RandomKeyBoard");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void login(){
        check();
    }
    public void exit1(){
        System.exit(0);
    }

    public void check(){
        if (textField.getText().equals("www")&&textPassword.getText().equals("23323456")){
            try {
                Parent root3 = FXMLLoader.load(getClass().getResource("mainFrame.fxml"));
                Stage stage = new Stage();
                stage.setScene(new Scene(root3, 500, 600));
                stage.setTitle("Main");
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            alert.setTitle("錯誤訊息"); //設定對話框視窗的標題列文字
            alert.setHeaderText("ID或密碼錯誤，請重試"); //設定對話框視窗裡的標頭文字。若設為空字串，則表示無標頭
            alert.setContentText("請按下「確定」按鈕。"); //設定對話框的訊息文字
            alert.showAndWait(); //顯示對話框，並等待對話框被關閉時才繼續執行之後的程式
        }
    }
}
