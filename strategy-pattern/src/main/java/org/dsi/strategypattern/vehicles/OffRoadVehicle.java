package org.dsi.strategypattern.vehicles;

import org.dsi.strategypattern.strategies.NormalDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new NormalDriveStrategy());
    }
}
