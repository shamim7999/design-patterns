package org.dsi.strategypattern.strategies;

public class XYZDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("XYZ Drive Strategy");
    }
}
