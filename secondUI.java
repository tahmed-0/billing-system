import javax.swing.*;
import java.awt.*;

public class secondUI extends Data {

    JLabel label = new JLabel();

    JButton home = new JButton("Home");
    JFrame secondFrame = new JFrame("Second");

    public secondUI() {
        createComp();
        createUITwo();

        createAction();

    }

    public void createUITwo() {

        secondFrame.setSize(400,400);
        secondFrame.getContentPane().setBackground(Color.blue.brighter());
        secondFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        secondFrame.setLayout(null);

        secondFrame.setResizable(false);
        label.setBounds(20,20,200, 200);
        label.setText("Hello World");


        secondFrame.setVisible(true);

    }

    public void createComp() {
         home.setBounds(20, 20, 115, 25);
        // home.setFont(fontMain);
         secondFrame.add(home);
    }

    public void createAction() {

    }
}
