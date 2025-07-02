package oop_project;


import oop_project.employee;
import oop_project.gender;
import oop_project.displayable;

// sub class 

public class salariedEmployee extends employee implements displayable {
    double salary ;
    double bouns ;
    double deductions;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public salariedEmployee() {
    }
    
    public salariedEmployee(double salary, double bouns, double deductions, String name, int ssn, String address, gender sex) {
        super(name, ssn, address, sex);
        this.salary = salary;
        this.bouns = bouns;
        this.deductions = deductions;
    }
    @Override 
    public double earning(){
        return salary+bouns-deductions ;
    }
    
    @Override
    public void displayAlldetails(){
        System.out.println(super.toString());
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return "salariedEmployee{" + "salary=" + salary + ", bouns=" + bouns + ", deductions=" + deductions + '}';
    }
    
    @Override
    public void displayearning(){
        System.out.println("total earning is" + earning());
    }
    
    
    
    
}
