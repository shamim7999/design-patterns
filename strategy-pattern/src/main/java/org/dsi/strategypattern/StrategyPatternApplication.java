package org.dsi.strategypattern;


import org.dsi.strategypattern.vehicles.GixxerVehicle;
import org.dsi.strategypattern.vehicles.MercedesBenzVehicle;
import org.dsi.strategypattern.vehicles.OffRoadVehicle;
import org.dsi.strategypattern.vehicles.Vehicle;

public class StrategyPatternApplication {

    public static void main(String[] args) {
        System.out.println("Strategy Pattern Implementation");

        Vehicle vehicle = new OffRoadVehicle();
        vehicle.drive();

        vehicle = new MercedesBenzVehicle();
        vehicle.drive();

        vehicle = new GixxerVehicle();
        vehicle.drive();
    }
}
