import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main{
    JFrame f;
    JLabel displayLabel, nameLabel;
    JButton b1, b2, b3;
    int elapsedTime = 0;
    int seconds = 0;
    int minutes = 0;
    int hours = 0;

    Main(){
//add comment again and again
        f =  new JFrame();
        f.setTitle("Stop watch");
        f.setBounds(500,350,500,300);
        f.setLayout(null);
        f.setVisible(true);
        displayLabel = new JLabel();
        displayLabel.setBackground(Color.BLUE);
        displayLabel.setBounds(68, 20, 350,50);
        displayLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0)));
        displayLabel.setFont(new Font("Monospaced", Font.BOLD, 22));
        displayLabel.setHorizontalAlignment(JLabel.CENTER);
        displayLabel.setOpaque(true);
        f.add(displayLabel);
        nameLabel = new JLabel("Timer");
        nameLabel.setBounds(200, 180, 350,50);
        nameLabel.setFont(new Font("Century", Font.BOLD, 30));
        f.add(nameLabel);
        b1 = new JButton("Start");
        b1.setBounds(90, 100, 100, 50);
        b1.setFont(new Font("Monospaced", Font.BOLD, 22));
        b2 = new JButton("Stop");
        b2.setBounds(190, 100, 100, 50);
        b2.setFont(new Font("Monospaced", Font.BOLD, 22));
        b3 = new JButton("Reset");
        b3.setBounds(290, 100, 100, 50);
        b3.setFont(new Font("Monospaced", Font.BOLD, 22));
        f.add(b1);
        f.add(b2);
        f.add(b3);
        ImageIcon image = new ImageIcon("D:\\clock.png");
        f.setIconImage(image.getImage());



    }

    public static void main(String[] args) {
        new Main();
    }
}