package DialougeWindow;

import javax.swing.*;

public class InputandShowMessageDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, name + " Welcome to Java Swing");
    }
}
