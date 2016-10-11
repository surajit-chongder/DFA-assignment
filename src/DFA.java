import java.util.ArrayList;
import static java.util.Arrays.stream;

public class DFA {
    private Tuple tuple;

    public DFA(Tuple tuple) {
        this.tuple = tuple;
    }

    private String[] getAllAlphabets(String determinationString) {
        return determinationString.split("");
    }

    public boolean isInLanguage(String determinationString) {
        ArrayList<Alphabet> deteminationAlphabetSet = new ArrayList<>();
        stream(getAllAlphabets(determinationString)).forEach(alphabet -> deteminationAlphabetSet.add(new Alphabet(alphabet)));
        State currentState = tuple.getInitialState();;
        for (int index = 0; index < deteminationAlphabetSet.size(); index++) {
            Alphabet alphabet = deteminationAlphabetSet.get(index);
            currentState = tuple.getTransitionFunction().getNextState(currentState,alphabet);

        }
        return isFinalState(currentState);
    }

    private boolean isFinalState(State state) {
        return tuple.getFinalStates().contains(state);
    }
}
