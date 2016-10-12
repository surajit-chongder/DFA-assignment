public class Transition {
    private State currentState;
    private Alphabet alphabet;
    private State nextState;

    public Transition(State currentState, Alphabet alphabet, State nextState) {
        this.currentState = currentState;
        this.alphabet = alphabet;
        this.nextState = nextState;
    }

    public State getNextState() {
        return nextState;
    }

    public boolean isSameCurrentStateAndAlphabet(State currentState, Alphabet alphabet) {
        return this.currentState.equals(currentState) && this.alphabet.equals(alphabet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transition that = (Transition) o;

        if (currentState != null ? !currentState.equals(that.currentState) : that.currentState != null) return false;
        if (alphabet != null ? !alphabet.equals(that.alphabet) : that.alphabet != null) return false;
        return nextState != null ? nextState.equals(that.nextState) : that.nextState == null;

    }

    @Override
    public int hashCode() {
        int result = currentState != null ? currentState.hashCode() : 0;
        result = 31 * result + (alphabet != null ? alphabet.hashCode() : 0);
        result = 31 * result + (nextState != null ? nextState.hashCode() : 0);
        return result;
    }
}
