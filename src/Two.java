import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;

public class Two {
    private  JTextField textField1 ;
    private  JTextField textField2;
    private  JTextField textField4;
    private  JTextField textField5;
    JPanel Home;
    private JButton clearButton;
    private JLabel s1;
    private JButton answerButton;
    private JLabel s2;
    private JTextArea textArea1;
    private JTextArea textArea2;


    public Two() {
        textArea1.setText("Step 1 :");
        textArea2.setText("Step 1 :");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("0") ;
                textField2.setText("0") ;
                textField4.setText("0") ;
                textField5.setText("0") ;
                textArea1.setText("Step 1 :");
                textArea2.setText("Step 2 :");

            }
        });
        answerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float t1 = parseInt(textField1.getText());
                float t2 = parseInt(textField2.getText());
                float t3 = parseInt(textField4.getText());
                float t4 = parseInt(textField5.getText());

                textArea1.setText("Step 1 : ("+t1+") ("+t4+")\n       + ("+t2+") ("+t3+")");
                textArea2.setText("Step 2 : "+(t1*t4)+" + "+(t2*t3));
            }
        });
    }

}
