import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {
    public Gui(){
        this.setSize(600,400);
        this.setVisible(true);

        JButton button1 = new JButton("1");
        button1.setBounds(10,20,50,40);
        JButton button2 = new JButton("2");
        button2.setBounds(55,20,50,40);
        JButton button3 = new JButton("3");
        button3.setBounds(10,65,50,40);
        JButton button4 = new JButton("4");
        button4.setBounds(55,65,50,40);

        JLabel label1 = new JLabel("");
        label1.setBounds(140, 30, 60,30);

        button1.addActionListener(new Button(label1));
        button4.addActionListener(new Button(label1));

        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(label1);
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class Button implements ActionListener {
    JLabel label1 ;
    public Button(JLabel label1){
        this.label1 = label1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("1")){
            label1.setText("image 1");
        }
        if (e.getActionCommand().equals("4")){
            label1.setText("image 2");
        }
    }
}

class Test2 {
    public static void main(String[] args) {
       Gui G = new Gui();
    }
}
