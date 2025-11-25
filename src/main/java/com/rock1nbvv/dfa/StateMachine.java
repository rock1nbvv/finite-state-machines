package com.rock1nbvv.dfa;

public interface StateMachine<S, I> {
    S transition(S state, I input);

    boolean isAccepting(S state);

    S start();
}
