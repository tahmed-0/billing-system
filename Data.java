import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Data {

    private String iproductName;
    private double iprice;
    private  int iquantity;
    private double idiscount;
    private String ibrandName;
    private String icustomerName;
    private int iphoneNumber;
    private String iassociatesName;


    //Overloaded Constructor

    public Data(String iproductName, double iprice, int iquantity, double idiscount, String ibrandName, String icustomerName, int iphoneNumber, String iassociatesName) {
        this.iproductName = iproductName;
        this.iprice = iprice;
        this.iquantity = iquantity;
        this.idiscount = idiscount;
        this.ibrandName = ibrandName;
        this.icustomerName = icustomerName;
        this.iphoneNumber = iphoneNumber;
        this.iassociatesName = iassociatesName;
    }

    public Data() {

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




}
