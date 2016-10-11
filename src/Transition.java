public class Transition {
    private State currentState;
    private Alphabet alphabet;
    private State nextState;

    public Transition(State currentState, Alphabet alphabet, State nextState) {
        this.currentState = currentState;
        this.alphabet = alphabet;
        this.nextState = nextState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public Alphabet getAlphabet() {
        return alphabet;
    }

    public State getNextState() {
        return nextState;
    }

}
