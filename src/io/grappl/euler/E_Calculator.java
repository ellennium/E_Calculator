package io.grappl.euler;

/**
 * Computes the value of the mathematical constant 'e", also known as Euler's number.
 */
public class E_Calculator {

    /**
     * Returns the factorial of the parameter 'number'.
     * @param number the number to be factorialized
     * @return the factorial of the parameter
     */
     long factorialize(long number) {
        long toReturn = number;

        while(number > 1) {
            number--;
            toReturn *= number;
        }

        return toReturn;
    }

    /**
     * Computes the constant e to a desire precision.
     * The higher the precision, the more accurate the answer, to a point.
     * @param precision the precision of the calculation
     * @return an approximation of e
     */
    public double compute_e(int precision) {
        int iteration = 1;
        double e_value = 1;

        while(iteration < precision) {
            e_value += 1d/factorialize(iteration);
            iteration++;
        }

        System.out.println(e_value);
        return e_value;
    }
}
