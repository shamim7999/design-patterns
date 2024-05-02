package org.dsi.strategypattern.vehicles;

import org.dsi.strategypattern.strategies.SportsDriveStrategy;

public class GixxerVehicle extends Vehicle {
    public GixxerVehicle() {
        super(new SportsDriveStrategy());
    }
}
