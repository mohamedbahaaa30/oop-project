/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package oop_project;
import java.util.ArrayList ;

public class Department {
    int dno;
    String dname ;
    ArrayList<employee> emplist;

    public Department() {
    }

    public Department(int dno, String dname) {
        this.dno = dno;
        this.dname = dname;
        emplist = new ArrayList<employee>() ;
    }

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
    public void add_employee(employee e){
        emplist.add(e);
    }
        public void remove_employee(int i){
        emplist.remove(i);
    }
    public int getEmployeeCount(){
        return emplist.size();
    }
    public void print_basic_data(){
        for(int i =0 ; i<emplist.size() ; i++){
            System.out.println(emplist.get(i).name +" "+emplist.get(i).ssn);
        }
    }
    public void print_all_details(){
        for(int i =0 ;i<emplist.size();i++){
        if (emplist.get(i) instanceof salariedEmployee){
        ((salariedEmployee)emplist.get(i)).displayAlldetails();
        }
        else if (emplist.get(i) instanceof commissionEmployee){
        ((commissionEmployee)emplist.get(i)).displayAlldetails();
        }
        else if (emplist.get(i) instanceof BasePlusCommissionEmployee){
        ((BasePlusCommissionEmployee)emplist.get(i)).displayAlldetails();
        }
        else if (emplist.get(i) instanceof HourlyEmployee){
        ((HourlyEmployee)emplist.get(i)).displayAlldetails();
        }
    }
    }      
    
    
    
    
} 
