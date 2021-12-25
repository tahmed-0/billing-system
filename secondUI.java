import javax.swing.*;
import java.awt.*;

public class secondUI extends Data {

    JLabel label = new JLabel();

    public secondUI() {

        createUITwo();

    }

    public void createUITwo() {
        JFrame frame = new JFrame("Second");
        frame.setSize(400,400);
        frame.getContentPane().setBackground(Color.yellow);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        label.setBounds(20,20,500, 500);


        frame.setVisible(true);

    }
}
