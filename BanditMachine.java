package Bandits;

import java.io.FileWriter;
import java.io.IOException;

public class BanditMachine {
    public BanditMachine() {
        Envir env = new Envir(10);
        Agent test = new Agent(env);
        FileWriter output;

        double score = 0;
        int round = 0;
        int maxRound = 10000;

        try {
            output = new FileWriter("DetailResults.csv", false);
            output.write("Round\tAction\tReward\tScore\n");

            while (round < maxRound) {
                int actionId = test.run();
                double reward = env.getReward(actionId);
                round ++;
                score = score + 1.0/round * (reward - score);
                output.write(String.format("%d\t%d\t%f\t%f\n", round, actionId, reward, score));
                System.out.println(String.format("%d\t%d\t%f", round, actionId, reward));
            }

            output.close();
        } catch (IOException e) {
            System.out.println("Error in opening file, please contact source provider: Hung.nn184118@sis.hust.edu.vn");
            e.printStackTrace();
            System.exit(-1);
        }

        System.out.println(String.format("Finish! Your total score: %f", score));
    }
}
