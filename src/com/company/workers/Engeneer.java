package com.company.workers;

public class Engeneer extends Worker {
    private String category;
    private int level;
    private int workPlaceNumber;

    public Engeneer(String educationLevel, String PIB, int experience, String position, String category, int level, int workPlaceNumber) {
        super(educationLevel, PIB, experience, position);
        this.category = category;
        this.level = level;
        this.workPlaceNumber = workPlaceNumber;
    }

    public int getWorkPlaceNumber() {
        return workPlaceNumber;
    }

    public void setWorkPlaceNumber(int workPlaceNumber) {
        this.workPlaceNumber = workPlaceNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void print() {
        System.out.print(getPIB() + "  " + getEducationLevel() + " "
                + getExperience() + " " + getPosition() + " category: " + getCategory() + " level: " +
                getLevel() + " number of workplace: " + getWorkPlaceNumber());
    }
}
