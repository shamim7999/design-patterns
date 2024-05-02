package org.dsi.strategypattern.strategies;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy");
    }
}
