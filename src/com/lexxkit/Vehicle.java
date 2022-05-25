package com.lexxkit;

public abstract class Vehicle implements Service {
    private String modelName;
    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку " + (i + 1));
        }
    }

    @Override
    public abstract void check();
}
