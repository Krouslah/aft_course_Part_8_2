package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private int maxSpeed;

    public SportCar(String model, String carClass, double weight, Driver driver, Engine engine, int maxSpeed) {
        super(model, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public String toString(SportCar sportCar) {
        return "SportCar{" + " Model = " + sportCar.getModel() + ", Car Class = " + sportCar.getCarClass() + ", Weight = " + sportCar.getWeight() + ", Driver = " + sportCar.getDriver() + ", Engine = " + sportCar.getEngine() +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
