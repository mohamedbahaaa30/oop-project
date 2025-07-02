package oop_project;

//super class
enum gender {male , female};

public abstract class employee {
    String name ;
    int ssn ;
    String address;
    gender sex ;
    
    public void SetName(String name ){
        this.name =name ;
    }
    public String getName(){
        return name ;
    }
    public void setSsn(int ssn){
        this.ssn=ssn;
    }
    public int getSsn(){
        return ssn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public gender getSex() {
        return sex;
    }

    public void setSex(gender sex) {
        this.sex = sex;
    }

    public employee() {
    }
    
    public employee(String name, int ssn, String address, gender sex) {
        this.name = name;
        this.ssn = ssn;
        this.address = address;
        this.sex = sex;
    }
    public abstract double earning();

    @Override
    public String toString() {
        return "employee{" + "name=" + name + ", ssn=" + ssn + ", address=" + address + ", sex=" + sex + '}';
    }
    




}

