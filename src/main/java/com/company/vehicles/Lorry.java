package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private double loadCapacity;

    public Lorry(String model, String carClass, double weight, Driver driver, Engine engine, double loadCapacity) {
        super(model, carClass, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    public String toString(Lorry lorry) {
        return "Lorry{" + " Model = " + lorry.getModel() + ", Car Class = " + lorry.getCarClass() + ", Weight = " + lorry.getWeight() + ", Driver = " + lorry.getDriver() + ", Engine = " + lorry.getEngine() +
                ", loadCapacity = " + loadCapacity +
                '}';
    }
}
