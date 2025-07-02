package oop_project;

//sub class
public class BasePlusCommissionEmployee extends commissionEmployee {
     double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
     
    @Override 
    public double earning(){
        return base + super.earning();
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" + "base=" + base + '}';
    }
    
    @Override 
    public void displayAlldetails(){
        super.displayAlldetails();
        System.out.println(toString());
    }
    @Override 
    public void displayearning(){
        System.out.println("total earning is" + earning());
    }
}
