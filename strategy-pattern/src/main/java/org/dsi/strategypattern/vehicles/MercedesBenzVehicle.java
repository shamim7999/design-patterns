package org.dsi.strategypattern.vehicles;

import org.dsi.strategypattern.strategies.SportsDriveStrategy;

public class MercedesBenzVehicle extends Vehicle{
    public MercedesBenzVehicle() {
        super(new SportsDriveStrategy());
    }
}
