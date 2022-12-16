import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben Sie Ihr Alter ein: ");
        var alter = Integer.parseInt(eingabe);

        if(alter < 18){
            JOptionPane.showMessageDialog(null,"Sie sind noch nicht volljährig!");
        }else{
            JOptionPane.showMessageDialog(null, "Glückwunsch! Sie sind volljährig!");
        }
    }
}