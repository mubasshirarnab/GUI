package DialougeWindow;

import javax.swing.*;

public class ConfirmDialog {
    public static void main(String[] args) {
       int answer = JOptionPane.showConfirmDialog(null, "Do you want to Quit the Game?", "Quit", JOptionPane.YES_NO_OPTION);

       if (answer == JOptionPane.YES_OPTION){
           System.exit(0);
       }
       else {
           JOptionPane.showMessageDialog(null, "Restart the Game.");
       }
    }
}
