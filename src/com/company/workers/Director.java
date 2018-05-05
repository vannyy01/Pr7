package com.company.workers;

public class Director extends Worker {
    private String department;
    private String dateOfCharge;

    public Director(String educationLevel, String PIB, int experience, String position, String department, String dateOfCharge) {
        super(educationLevel, PIB, experience, position);
        this.department = department;
        this.dateOfCharge = dateOfCharge;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDateOfCharge() {
        return dateOfCharge;
    }

    public void setDateOfCharge(String dateOfCharge) {
        this.dateOfCharge = dateOfCharge;
    }

    public void print() {
        System.out.print(getPIB() + " " + getEducationLevel()
                + " " + getExperience() + " " + getPosition() + " department: "
                + getDepartment() + " date of charge: " + getDateOfCharge());
    }
}
