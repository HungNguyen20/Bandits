package Bandits;

import java.util.Random;

public class Action {
    private final int id;
    private final double trueValue;
    private final double ranging;

    public Action(int id, double trueValue, double ranging) {
        this.id = id;
        this.trueValue = trueValue;
        this.ranging = ranging;
    }

    public double activate() {
        Random random = new Random();
        return trueValue + random.nextGaussian()*ranging;
    }
}
