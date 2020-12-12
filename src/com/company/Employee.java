package com.company;

public class Employee extends Person {

    private String company;

    public Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String work(){
        return "Manager";
    }

    @Override
    public String toString() {
        return "(" + super.getName() + ", " + super.getAge() + ", " + company + ")";
    }
}
