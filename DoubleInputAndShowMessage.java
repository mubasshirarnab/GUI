package DialougeWindow;

import javax.swing.*;

public class DoubleInputAndShowMessage {
    public static void main(String[] args) {
        String firstName = JOptionPane.showInputDialog(null,"Enter your first name: ", "Information", -1);
        String lastName = JOptionPane.showInputDialog(null,"Enter your last name", "Information", -1);

        String name = firstName + " " + lastName;

        JOptionPane.showMessageDialog(null,"Welcome " + name, "Information", -1);
    }
}
