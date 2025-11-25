package com.rock1nbvv.dfa;

public class SimpleRepresentation {
    public static void main(String[] args) {
        System.out.println(divByX("101101", 5));
    }

    public static boolean divByX(String binary, int k) {
        int remainder = 0;
        for (char b : binary.toCharArray()) {
            if (b != '0' && b != '1') {
                throw new IllegalArgumentException("Not a binary string");
            }
            int curr = b == '1' ? 1 : 0;
            remainder = ((remainder << 1) + curr) % k;
        }

        return remainder == 0;
    }
}
