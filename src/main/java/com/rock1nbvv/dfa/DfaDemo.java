package com.rock1nbvv.dfa;

public class DfaDemo {

    public static void main(String[] args) {
        StateMachine<Integer, Integer> dfa10 = new DivisibleByXDfa(10);

        Integer finalState = BinaryFsmRunner.run(dfa10, "101101");

        boolean isDivisible = dfa10.isAccepting(finalState);

        System.out.println("Final state: " + finalState);
        System.out.println("Divisible by 5: " + isDivisible);
    }
}
