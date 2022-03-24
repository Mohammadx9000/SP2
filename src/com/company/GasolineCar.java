package com.company;

public class GasolineCar extends AFuelCar {

    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPetLiter) {
        super(registrationNumber, make, model, numberOfDoors, kmPetLiter);
    }

    @Override
    String getFuelType() {
        return "Gasoline";
    }

    @Override
    public int getRegistrationFee() {
        int registraionFee = 0;
        if(20 < kmPerLitre && kmPerLitre <= 50)
            registraionFee = 330;
        if(15 < kmPerLitre && kmPerLitre <= 20)
            registraionFee = 1050;
        if(10 < kmPerLitre && kmPerLitre <= 15)
            registraionFee = 2340;
        if(5 < kmPerLitre && kmPerLitre <= 10)
            registraionFee = 5500;
        if(kmPerLitre <= 5)
            registraionFee = 10470;
        return registraionFee;
    }
}
