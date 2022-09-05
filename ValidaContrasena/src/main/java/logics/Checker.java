package logics;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class Checker {

    public Checker() {
    }

    public boolean lengthChecker(String chain) {
        if (chain.length() >= 8) {
            System.out.println("Right length");
            return true;
        } else {
            System.out.println("wrong length");
            return false;
        }
    }

    public int digitChecker(String chain) {
        char[] c = new char[chain.length()];
        int countDigit = 0;
        for (int i = 0; i < chain.length(); i++) {
            c[i] = chain.charAt(i);
            if (isDigit(c[i])) {
                countDigit++;
                System.out.println("digits: " + countDigit);
            }
        }
        System.out.println("Digit class: " + countDigit);
        return countDigit;
    }

    public int upperChecker(String chain) {
        char[] c = new char[chain.length()];
        int countUpper = 0;
        for (int i = 0; i < chain.length(); i++) {
            c[i] = chain.charAt(i);
            if (isUpperCase(c[i])) {
                countUpper++;
                System.out.println("uppers: " + countUpper);
            }
        }
        return countUpper;
    }
    
    public int lowerChecker(String chain) {
        char[] c = new char[chain.length()];
        int countLower = 0;
        for (int i = 0; i < chain.length(); i++) {
            c[i] = chain.charAt(i);
            if (isLowerCase(c[i])) {
                countLower++;
                System.out.println("uppers: " + countLower);
            }
        }
        return countLower;
    }
}
