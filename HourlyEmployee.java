package oop_project;

// sub class

public class HourlyEmployee extends employee implements displayable {
    
    private double hour_rate;
    private int no_of_hours;

    public double getHour_rate() {
        return hour_rate;
    }

    public void setHour_rate(double hour_rate) {
        this.hour_rate = hour_rate;
    }

    public int getNo_of_hours() {
        return no_of_hours;
    }

    public void setNo_of_hours(int no_of_hours) {
        this.no_of_hours = no_of_hours;
    }

    public HourlyEmployee() {
    }

    public HourlyEmployee(double hour_rate, int no_of_hours, String name, int ssn, String address, gender sex) {
        super(name, ssn, address, sex);
        this.hour_rate = hour_rate;
        this.no_of_hours = no_of_hours;
    }
    
    
    @Override 
    public double earning(){
        return hour_rate * no_of_hours;
    }
    
        @Override
    public String toString() {
        return "HourlyEmployee{" + "hour_rate=" + hour_rate + ", no_of_hours=" + no_of_hours + '}';
    }
    
    @Override 
    public void displayAlldetails(){
        System.out.println(super.toString());
        System.out.println(toString());
    }


    @Override
    public void displayearning(){
    System.out.println("your total earning is " + earning());
    }
    
    
    
}
