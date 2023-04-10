package Offline3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame {
    public Counter() {
        this.setTitle("Counter");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton up = new JButton("UP");
        up.setBounds(130,60,100,45);

        JButton down = new JButton("Down");
        down.setBounds(240,60,100,45);

        JButton reset = new JButton("Reset");
        reset.setBounds(350,60,100,45);


        JTextField text = new JTextField("1");
        text.setBounds(240,10,100,45);

        up.addActionListener(new UpButtonActionListener(text));
        down.addActionListener(new DownButtonActionListener(text));
        reset.addActionListener(new ResetButtonActionListener(text));

        this.setLayout(null);
        this.add(up);
        this.add(down);
        this.add(reset);
        this.add(text);
        this.setVisible(true);
    }

}

class UpButtonActionListener implements ActionListener {
    JTextField text;
    public UpButtonActionListener(JTextField text){
        this.text =  text;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int numInTextField = 0;
        try {
             numInTextField = Integer.parseInt(text.getText());
        }
        catch (NumberFormatException E){
            System.out.println("Invalid String. Please enter valid number");
        }

        if (e.getActionCommand().equals("UP")){
            text.setText(String.valueOf(numInTextField + 1));
            if (numInTextField == 7){
                text.setText(String.valueOf(0));
            }
        }
    }
}

class DownButtonActionListener implements ActionListener{
    JTextField text;
    public DownButtonActionListener(JTextField text) {
        this.text = text;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int numInTextField = 0;
        try {
            numInTextField = Integer.parseInt(text.getText());
        }
        catch (NumberFormatException E){
            System.out.println("Invalid String. Please enter valid number");
        }
        if (e.getActionCommand().equals("Down")){
            text.setText(String.valueOf(numInTextField - 1));
            if (numInTextField == 0){
                text.setText(String.valueOf(7));
            }
        }
    }
}

class ResetButtonActionListener implements ActionListener {
    JTextField text;
    public ResetButtonActionListener(JTextField text){
        this.text = text;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int numInTextField = 0;
        try {
            numInTextField = Integer.parseInt(text.getText());
        }
        catch(NumberFormatException E){
            System.out.println("Invalid String. Please enter valid number");
        }
        if (e.getActionCommand().equals("Reset")){
            text.setText(String.valueOf(0));
        }
    }
}

class Main {
    public static void main(String[] args) {
        Counter c = new Counter();
    }
}
