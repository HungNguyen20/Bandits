public class Agent_method {
    private final int numAction;
    //TODO: modify class if needed, agent only calls getAction function


    protected Agent_method(int nAction) {
        this.numAction = nAction;
    }

    protected int getAction(double pastReward, int pastActionId) {
        if (pastActionId >= 0) {
            int yourAction;
            //TODO: return a number between 0 and nAction as the id of desiring action
            
            
            
            
            
            
            
            
            assert yourAction >= 0 && yourAction < nAction : "False action taken";
            return yourAction;   
        }
        return 0;
    }
}
