import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class bill extends Data {


    //hi

    //Variables


    public bill() {
        super();
        action();

        createComponents();
        createUI();

        createTime();



    }

    public void createUI() {
        frame.setSize(750,680);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(246, 243,238));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public void createComponents() {
        title.setText("Billing System");
        title.setFont(fontTitle);
        title.setBounds(280, 30, 500,25);
        frame.add(title);

        //UserInputs

        productName.setBounds(175, 93, 200,25);
        productName.setFont(fontMain);
        frame.add(productName);

        price.setBounds(175, 150, 130, 25);
        price.setFont(fontMain);
        frame.add(price);

        quantity.setBounds(320, 150, 130,25);
        quantity.setFont(fontMain);
        frame.add(quantity);

        discount.setBounds(465, 150, 130,25);
        discount.setFont(fontMain);
        frame.add(discount);

        brandName.setBounds(175, 215, 200,25);
        brandName.setFont(fontMain);
        frame.add(brandName);

        customerName.setBounds(175, 272, 200,25);
        customerName.setFont(fontMain);
        frame.add(customerName);

        customerPhone.setBounds(175, 329, 300,25);
        customerPhone.setFont(fontMain);
        frame.add(customerPhone);

        retailName.setBounds(175, 386, 300,25);
        retailName.setFont(fontMain);
        frame.add(retailName);




        //TextFields

        t1.setBounds(170,120,400,30);
        frame.add(t1);

        t2.setBounds(170, 180, 115, 30);
        frame.add(t2);

        t3.setBounds(315, 180, 115, 30);
        frame.add(t3);

        t4.setBounds(460, 180, 115, 30);
        frame.add(t4);

        t5.setBounds(170,240,400,30);
        frame.add(t5);

        t6.setBounds(170,300,400,30);
        frame.add(t6);

        t7.setBounds(170,355,400,30);
        frame.add(t7);

        t8.setBounds(170,410,400,30);
        frame.add(t8);

        totalValues.setBounds(20,450,700,25);


        //Buttons


        submit.setBounds(220, 465, 115, 25);
        submit.setFont(fontMain);
        frame.add(submit);

        cancel.setBounds(390, 465, 115, 25);
        cancel.setFont(fontMain);
        frame.add(cancel);









    }

    public void action() {

        submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                secondUI i = new secondUI();
                frame.dispose();

            }
        });
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                t7.setText("");
                t8.setText("");




            }
        });
    }

    public void createTime() {

        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dateFormat = new SimpleDateFormat("MM dd, yyyy");

        timeLabel.setBounds(20,20,200,25);
        dateLabel.setBounds(20,50,200,25);

        dateLabel.setFont(fontMain);
        timeLabel.setFont(fontMain);

        frame.add(timeLabel);
        frame.add(dateLabel);

        while (true) {
            timeSet = timeFormat.format(Calendar.getInstance().getTime());
            dateSet = dateFormat.format(Calendar.getInstance().getTime());

            timeLabel.setText(timeSet);
            dateLabel.setText(dateSet);


            try {
                Thread.sleep(1000);
            } catch (InterruptedException i) {
                System.out.println(i.getMessage());
            }

        }

    }



    public void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

}
