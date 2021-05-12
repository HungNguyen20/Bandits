package Bandits;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Envir {
    private final double FAULT = -100;
    private final int nAction;
    private final List<Action> actionList = new ArrayList<>();

    public int getnAction(){
        return this.nAction;
    }

    public Envir(int nAction) {
        this.nAction = nAction;
        Random random = new Random(250);
        for (int i = 0; i < nAction; i++) {
            Action act = new Action(i, 10 + 5*random.nextGaussian(), 3 + random.nextGaussian());
            actionList.add(act);
        }
    }

    public double getReward(int actionId) {
        if (actionId < 0 || actionId >= nAction) {
            System.out.println("Invalid action taken!");
            return FAULT;
        }
        Action act = this.actionList.get(actionId);
        return act.activate();
    }
}
