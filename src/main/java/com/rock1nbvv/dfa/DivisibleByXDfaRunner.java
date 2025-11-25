package com.rock1nbvv.dfa;

public class DivisibleByXDfaRunner {
    public static <S> S run(StateMachine<S, Integer> machine, String binary) {
        S state = machine.start();
        for (char b : binary.toCharArray()) {
            if (b != '0' && b != '1') {
                throw new IllegalArgumentException("Not a binary string");
            }
            state = machine.transition(state, b == '1' ? 1 : 0);
        }
        return state;
    }
}
