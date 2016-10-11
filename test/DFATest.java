import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DFATest {
    private Tuple tuple;

    @Before
    public void setUp() throws Exception {
        State q1 = new State("q1");
        State q2 = new State("q2");
        Alphabet zero = new Alphabet("0");
        Alphabet one = new Alphabet("1");
        Transition transition1= new Transition(q1, one, q1);
        Transition transition2 = new Transition(q1, zero, q2);

        ArrayList<State> states = new ArrayList<>();
        states.add(q1);
        states.add(q2);

        ArrayList<Alphabet> alphabet_set = new ArrayList<>();
        alphabet_set.add(zero);
        alphabet_set.add(one);

        ArrayList<Transition> transitions = new ArrayList<>();
        transitions.add(transition1);
        transitions.add(transition2);

        TransitionFunction transitionFunction = new TransitionFunction(transitions);

        ArrayList<State> finalStates = new ArrayList<>();
        finalStates.add(q2);

        tuple = new Tuple(states,alphabet_set,transitionFunction,q1,finalStates);
    }

    @Test
    public void shouldReturnTrueWhenAStringInThatLanguage(){
        DFA dfa = new DFA(tuple);
        assertTrue(dfa.isInLanguage("0"));
    }

    @Test
    public void shouldReturnFalseWhenAStringNotInThatLanguage(){
        DFA dfa = new DFA(tuple);
        assertFalse(dfa.isInLanguage("1"));
    }
}