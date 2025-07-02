package oop_project;

//sub class
public class commissionEmployee extends employee implements displayable{
    private double gross_sales ;
    private double commission_rate;

    public double getGross_rate() {
        return gross_sales;
    }

    public void setCross_rate(double gross_sales) {
        this.gross_sales = gross_sales;
    }

    public double getCommission_rate() {
        return commission_rate;
    }

    public void setCommission_rate(double commission_rate) {
        this.commission_rate = commission_rate;
    }

    public commissionEmployee() {
    }

    public commissionEmployee(double gross_sales, double commission_rate, String name, int ssn, String address, gender sex) {
        super(name, ssn, address, sex);
        this.gross_sales = gross_sales;
        this.commission_rate = commission_rate;
    }
    
    @Override 
    public double earning(){
        return gross_sales * commission_rate ;
    }

    @Override
    public String toString() {
        return "commissionEmployee{" + "gross_sales=" + gross_sales + ", commission_rate=" + commission_rate + '}';
    }
    
    @Override 
    public void displayAlldetails(){
        System.out.println(super.toString());
        System.out.println(toString());
    }
    
    @Override
    public void displayearning(){
        System.out.println("total earning is" + earning());
    }
    
    
}
