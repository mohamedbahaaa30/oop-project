
package oop_project;


public class Oop_project {


    public static void main(String[] args) {
        Department d1 =new Department(1,"information system");
        salariedEmployee s1=new salariedEmployee(2000,500,50,"ahmed",1200,"riyadh",gender.male);
             d1.add_employee(s1);
        
        HourlyEmployee h1 =new HourlyEmployee(100, 6,"mohamed", 1200, "cairo", gender.male);
            d1.add_employee(h1);
            
        commissionEmployee c1 =new commissionEmployee(15000, 0.25, "ali", 8970, "jaddaah", gender.male);
            d1.add_employee(c1);
            
        System.out.println(d1.getEmployeeCount());
        d1.print_all_details();
        
    }
    
}
