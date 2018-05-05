package com.company.workers;

public abstract class Worker {
    private String educationLevel;
    private String PIB;
    private int experience;
    private String position;

    public Worker(String educationLevel, String PIB, int experience, String position) {
        this.educationLevel = educationLevel;
        this.PIB = PIB;
        this.experience = experience;
        this.position = position;
    }

    public abstract void print();

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getPIB() {
        return PIB;
    }

    public void setPIB(String PIB) {
        this.PIB = PIB;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
