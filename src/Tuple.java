import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;

@EqualsAndHashCode
@ToString
public class Tuple {
    private ArrayList<State> states;
    private ArrayList<Alphabet> alphabet_set;
    private TransitionFunction transitionFunction;
    private State state;
    private ArrayList<State> finalStates;

    public Tuple(ArrayList<State> states, ArrayList<Alphabet> alphabet_set, TransitionFunction transitionFunction, State state, ArrayList<State> finalStates) {
        this.states = states;
        this.alphabet_set = alphabet_set;
        this.transitionFunction = transitionFunction;
        this.state = state;
        this.finalStates = finalStates;
    }

    public State getInitialState() {
        return state;
    }

    public TransitionFunction getTransitionFunction() {
        return transitionFunction;
    }

    public ArrayList<State> getFinalStates() {
        return finalStates;
    }
}
