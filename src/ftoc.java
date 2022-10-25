import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ftoc extends JFrame {

    private JPanel JPanel1;

    private JLabel JLable1;
    private JButton cToFButton;
    private JButton fToCButton;
    private JLabel Celcjusze;
    private JLabel farenhajty;
    private JTextField textField1;
    private JTextField textField2;

    public static void main(String[] args) {
        ftoc SwingExample = new ftoc();
        SwingExample.setVisible(true);


    }
public ftoc(){
        super("f to c");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    cToFButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String cText = textField1.getText();
            double c = Double.parseDouble(String.valueOf(cText));
        double f = (c* 9/5)+32;
        textField2.setText(String.valueOf(f));
        }

    });
    fToCButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String fText = textField2.getText();
            double f = Double.parseDouble(fText);
            double c = (f-32) * 5/9;
            textField1.setText(String.valueOf(c));
        }
    });
    textField1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           
        }
    });
}
}
