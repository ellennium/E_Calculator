public class E_Calculator {

    public long factorialize(long number) {
        long toReturn = number;

        while(number > 1) {
            number--;
            toReturn *= number;
        }

        return toReturn;
    }
}
