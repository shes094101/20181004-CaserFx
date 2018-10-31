package encryption;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class Caser {

    public TextField in;
    public TextField out;
    public PasswordField key;
    public MenuItem caser;
    public RadioButton enc;
    public RadioButton dec;
    public Button enter;
    public Button clear;
    public Button exit;
    public MenuButton choose;

    public int x = 0;
    public int keys;
    public char []ch;
    public String ans ="";

    public void caser(){
        choose.setText("Caser");
    }


    public void enc(){ //----加密
        x=0;
    }

    public void dec(){ //----解密
        x=1;
    }

    public void enter(){
        switch (x){
            case 0:
                ch = new char[in.getText().length()];
                ch = in.getText().toCharArray();
                keys = Integer.parseInt(key.getText());
                for (int i=0;i<ch.length;i++){
                    ans += ((char)(ch[i]+keys));
                }
                out.setText(ans); 
                ans="";
//            case 1:
//                ch = new char[in.getText().length()];
//                ch = in.getText().toCharArray();
//                keys = Integer.parseInt(key.getText());
//                for (int i=0;i<ch.length;i++){
//                    ans += ((char)(ch[i]-keys));
//                }
//                out.setText(ans);
//                ans="";
        }
    }

    public void clear() {
        if (in != null) {
            in.setText("");
            out.setText("");
        }
    }

    public void exit(ActionEvent event){
        Stage stage =(Stage) exit.getScene().getWindow();
        stage.close();
    }
}
