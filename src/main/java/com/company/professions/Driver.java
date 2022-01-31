package com.company.professions;

public class Driver extends Person {
    private String FIO;
    private int drivingExperience;

    public Driver(int age, String FIO, int drivingExperience) {
        super(age);
        this.FIO = FIO;
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "{" +
                "FIO='" + FIO + '\'' +
                ", drivingExperience=" + drivingExperience +  ", Age = " + this.getAge() +
                '}';
    }
}
