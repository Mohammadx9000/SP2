package com.company;

public abstract class AFuelCar extends ACar {
    int kmPerLitre;
    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPerLitre = kmPerLitre;
    }
    abstract String getFuelType(); // should return “Gasoline” or “Diesel”
    int getKmPerLitre() { // should return how many kilometres the car can drive on 1 litre of fuel
    return kmPerLitre;
    }

}
