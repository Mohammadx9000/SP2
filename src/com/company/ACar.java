package com.company;

public abstract class ACar implements Car {
    String registrationNumber;
    final String make;
    final String model;
    final int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getRegistrationNumber() { //The number on the number plate
        return registrationNumber;
    }

    @Override
    public String getMake() { // The make of the car e.g. Audi
        return make;
    }

    @Override
    public String getModel() { // The model of the car e.g. A6
        return model;
    }

    @Override
    public int getNumberOfDoors() { // The number of doors
        return numberOfDoors;
    }
}
