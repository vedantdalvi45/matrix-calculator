import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.MessageDigest;

public class Main {
    private JPanel Home;
    private JPanel d2;
    private JPanel d3;
    private JLabel l1;
    private JLabel l2;
    private JLabel t1;

    public Main() {
        l1.setIcon(new ImageIcon("src/two.png" ));
        l2.setIcon(new ImageIcon("src/three.png" ));


        l1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JFrame f = new JFrame();
                f.setContentPane(new Two().Home);
                f.setSize(280,450);
                f.setVisible(true);
            }
        });

        l2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setContentPane(new Main().Home);
        f.setSize(280,450);
        f.setResizable(false);
        f.setVisible(true);
    }
}
