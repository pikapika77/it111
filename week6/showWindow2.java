import javax.swing.*;
import java.awt.*;

public class showWindow2 {

    public static void main(String[] args)
    {
        JFrame window = new JFrame();
        window.setTitle("A Simple Window");
        JLabel label1 = new JLabel("My First Big Label!!");
       JLabel label2 = new JLabel("My Second Big Label!");
       JTextField text1 = new JTextField(30);
       JTextField text2 = new JTextField(30);
       Font myFont = new Font("Arial", Font.PLAIN, 24);
       Font myFont2 = new Font("Arial", Font.BOLD, 16);
       label1.setFont(myFont);
       label2.setFont(myFont2);
        window.setLayout(new FlowLayout());
        window.add(label1);
        window.add(text1);
        window.add(label2);
        window.add(text2);
        window.setSize(400, 500);
        window.setLocation(500, 200);
        window.getContentPane().setBackground(Color.red);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
