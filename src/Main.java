import com.FilipUrbanek406.CarrotSeller;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        CarrotSeller carrotSeller1 = new CarrotSeller();
        CarrotSeller carrotSeller2 = new CarrotSeller();

        carrotSeller1.setName("Karel Novák");
        carrotSeller1.setDateOfBirth(LocalDate.of(1990, 10,10));
        carrotSeller1.setSignedContracts(100);
        carrotSeller1.setWeightOfTuns(12);
        carrotSeller1.setCity("Praha");
        carrotSeller1.setSPZ("2A4 2896");
        carrotSeller1.setFuelConsumption(7.5);

        carrotSeller2.setName("Petr Dvořák ");
        carrotSeller2.setDateOfBirth(LocalDate.of(1998, 9,11));
        carrotSeller2.setSignedContracts(50);
        carrotSeller2.setWeightOfTuns(6);
        carrotSeller2.setCity("Brno");
        carrotSeller2.setSPZ("2B4 5246");
        carrotSeller2.setFuelConsumption(6.7);

        System.out.println("Jméno prvního prodejce " + carrotSeller1.getName());
        System.out.println("Jméno druhého prodejce " + carrotSeller2.getName());

    }
}