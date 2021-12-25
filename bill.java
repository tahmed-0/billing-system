import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class bill {



    //Variables

    private String iproductName;
    private double iprice;
    private  int iquantity;
    private double idiscount;
    private String ibrandName;
    private String icustomerName;
    private int iphoneNumber;
    private String iassociatesName;
    

    //Overloaded Constructor

    public bill(String iproductName, double iprice, int iquantity, double idiscount, String ibrandName, String icustomerName, int iphoneNumber, String iassociatesName) {
        this.iproductName = iproductName;
        this.iprice = iprice;
        this.iquantity = iquantity;
        this.idiscount = idiscount;
        this.ibrandName = ibrandName;
        this.icustomerName = icustomerName;
        this.iphoneNumber = iphoneNumber;
        this.iassociatesName = iassociatesName;
    }


    // Getter and setter

    public String getIproductName() {
        return iproductName;
    }

    public void setIproductName(String iproductName) {
        this.iproductName = iproductName;
    }

    public double getIprice() {
        return iprice;
    }

    public void setIprice(double iprice) {
        this.iprice = iprice;
    }

    public int getIquantity() {
        return iquantity;
    }

    public void setIquantity(int iquantity) {
        this.iquantity = iquantity;
    }

    public double getIdiscount() {
        return idiscount;
    }

    public void setIdiscount(double idiscount) {
        this.idiscount = idiscount;
    }

    public String getIbrandName() {
        return ibrandName;
    }

    public void setIbrandName(String ibrandName) {
        this.ibrandName = ibrandName;
    }

    public String getIcustomerName() {
        return icustomerName;
    }

    public void setIcustomerName(String icustomerName) {
        this.icustomerName = icustomerName;
    }

    public int getIphoneNumber() {
        return iphoneNumber;
    }

    public void setIphoneNumber(int iphoneNumber) {
        this.iphoneNumber = iphoneNumber;
    }

    public String getIassociatesName() {
        return iassociatesName;
    }

    public void setIassociatesName(String iassociatesName) {
        this.iassociatesName = iassociatesName;
    }


    //Date

    SimpleDateFormat dateFormat;
    String dateSet;

    //time

    Calendar calendar;

    SimpleDateFormat timeFormat;

    String timeSet;

    //Labels
     JLabel productName = new JLabel("Product Name");
     JLabel brandName = new JLabel("Brand Name");
     JLabel price = new JLabel("Price");
     JLabel discount = new JLabel("Discount");
     JLabel quantity = new JLabel("Quantity");
     JLabel customerPhone = new JLabel("Customer Phone Number");
     JLabel customerName = new JLabel("Customer Name");
     JLabel retailName = new JLabel("Associate Name");
     JLabel totalValues = new JLabel();

     JTextField t1 = new JTextField();
     JTextField t2 = new JTextField();
     JTextField t3 = new JTextField();
     JTextField t4 = new JTextField();
     JTextField t5 = new JTextField();
     JTextField t6 = new JTextField();
     JTextField t7 = new JTextField();
     JTextField t8 = new JTextField();

     JButton submit = new JButton("Submit");
     JButton cancel = new JButton("Cancel");


     JLabel timeLabel = new JLabel();
     JLabel dateLabel = new JLabel();

     JLabel title = new JLabel();

     Font fontTitle = new Font("monospaced", Font.PLAIN, 24);
     Font fontMain = new Font("monospaced", Font.PLAIN, 16);



    JButton showData = new JButton("Show Data");

    JFrame frame = new JFrame();


    public bill() {
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
            public String toString() {
                return iproductName + " hi w" + iprice + " " + icustomerName;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
               iproductName = t1.getText();
               iprice = Double.parseDouble(t2.getText());
               iproductName = t3.getText();

               totalValues.setText(toString());
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
