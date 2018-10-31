package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.util.Random;

public class Keyboard {
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn0;
    public Button re;
    public Button exit;
    public PasswordField pdf;
    public Random rd =new Random();
    public String ranDom[]  =new String [10];

    public void btn (ActionEvent event) {
        Button button = (Button)event.getSource();
        pdf.setText(pdf.getText() + button.getText());
    }

    protected void passworld_field (PasswordField passwordField) {
        this.pdf = passwordField;
    }

    public void re(){
        inkey();
    }

    public void random(){
        for (int i=0 ; i<10 ; i++ ){
            ranDom[i]=(Integer.toString(rd.nextInt(10)));
            for (int j=0 ; j<i ;j++){
                if (ranDom[i].equals(ranDom[j])){
                    ranDom[i]=(Integer.toString(rd.nextInt(10)));
                    j=-1;
                }
            }
        }
    }
    public void inkey(){
        random();
        btn0.setText(ranDom[0]);
        btn1.setText(ranDom[1]);
        btn2.setText(ranDom[2]);
        btn3.setText(ranDom[3]);
        btn4.setText(ranDom[4]);
        btn5.setText(ranDom[5]);
        btn6.setText(ranDom[6]);
        btn7.setText(ranDom[7]);
        btn8.setText(ranDom[8]);
        btn9.setText(ranDom[9]);
    }
    public void initialize(){
        inkey();
    }

    public void exit(ActionEvent event){
        Stage stage =(Stage) exit.getScene().getWindow();
        stage.close();
    }
}
