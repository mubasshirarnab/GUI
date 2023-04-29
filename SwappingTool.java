import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwappingTool extends JFrame {
    public SwappingTool(){
        this.setTitle("Swap");
        this.setSize(400,200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTextField textField1 = new JTextField(10);
        textField1.setBounds(50,10,80,40);
        JTextField textField2 = new JTextField(10);
        textField2.setBounds(140,10,80,40);

        JButton swap = new JButton("Swap");
        swap.setBounds(95,60, 80,40);

        swap.addActionListener(new ButtonActionListener(textField1,textField2));

        this.setLayout(null);
        this.add(textField1);
        this.add(textField2);
        this.add(swap);
        this.setVisible(true);
    }
}

class ButtonActionListener implements ActionListener {
    JTextField textField1, textField2;

    public ButtonActionListener(JTextField textField1, JTextField textField2){
        this.textField1 = textField1;
        this.textField2 = textField2;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String temp = textField1.getText();
        if (e.getActionCommand().equals("Swap")){
            textField1.setText(textField2.getText());
            textField2.setText(temp);
        }
    }
}

class Test {
    public static void main(String[] args) {
        SwappingTool swappingTool = new SwappingTool();
    }
}
