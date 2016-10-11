import java.util.ArrayList;

public class TransitionFunction {
    private ArrayList<Transition> transitions;

    public TransitionFunction(ArrayList<Transition> transitions) {
        this.transitions = transitions;
    }
    public State getNextState(State currentState,Alphabet alphabet){
        for (Transition transition : transitions) {
            if (transition.getCurrentState().equals(currentState) && transition.getAlphabet().equals(alphabet))
                return transition.getNextState();
        }
        return null;
    }
}
