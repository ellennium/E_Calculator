package io.grappl.euler;

public class Tests {

    public static void main(String[] args) {
        E_Calculator e_calculator = new E_Calculator();

        System.out.println(e_calculator.factorialize(3) == 6);
        System.out.println(e_calculator.factorialize(4) == 24);
        System.out.println(e_calculator.factorialize(5) == 120);

    }
}
