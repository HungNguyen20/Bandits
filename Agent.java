package Bandits;

public class Agent {
    private final int nAction;
    private final Agent_method method;

    public Agent (Envir env) {
        this.nAction = env.getnAction();
        this.method = new Agent_method(nAction);
    }

    public int run() {
        return method.getAction();
    }
}
