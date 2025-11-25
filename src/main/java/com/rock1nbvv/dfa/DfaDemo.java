package com.rock1nbvv.dfa;

public class DfaDemo {
    public static void main(String[] args) {
        int modulus = 10;
        StateMachine<Integer, Integer> machine = new DivisibleByXDfa(modulus);

        Integer finalState = DivisibleByXDfaRunner.run(machine, "101101");

        boolean isDivisible = machine.isAccepting(finalState);

        System.out.println("Final state: " + finalState);
        System.out.println("Divisible by " + modulus + ": " + isDivisible);
    }
}
