package com.rock1nbvv.dfa;

public class DivisibleByXDfa implements StateMachine<Integer, Integer> {
    private final int modulus;

    public DivisibleByXDfa(int modulus) {
        this.modulus = modulus;
    }

    @Override
    public Integer transition(Integer state, Integer bit) {
        return ((state << 1) + bit) % modulus;
    }

    @Override
    public boolean isAccepting(Integer state) {
        return state == 0;
    }

    @Override
    public Integer start() {
        return 0;
    }
}
