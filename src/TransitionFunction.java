import java.util.List;

public class TransitionFunction {
    private List<Transition> transitions;

    public TransitionFunction(List<Transition> transitions) {
        this.transitions = transitions;
    }

    public State getNextState(State state,Alphabet alphabet){
        for (Transition transition : transitions) {
            if (transition.isSameCurrentStateAndAlphabet(state,alphabet))
                return transition.getNextState();
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransitionFunction that = (TransitionFunction) o;

        return transitions != null ? transitions.equals(that.transitions) : that.transitions == null;

    }

    @Override
    public int hashCode() {
        return transitions != null ? transitions.hashCode() : 0;
    }

}
