package com.FilipUrbanek406;

import java.time.LocalDate;

public class CarrotSeller {
    private String name;
    private LocalDate dateOfBirth;
    private int signedContracts;
    private int weightOfTuns;
    private String city;
    private String SPZ;
    private double fuelConsumption;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSignedContracts() {
        return signedContracts;
    }

    public void setSignedContracts(int signedContracts) {
        this.signedContracts = signedContracts;
    }

    public int getWeightOfTuns() {
        return weightOfTuns;
    }

    public void setWeightOfTuns(int weightOfTuns) {
        this.weightOfTuns = weightOfTuns;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSPZ() {
        return SPZ;
    }

    public void setSPZ(String SPZ) {
        this.SPZ = SPZ;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
