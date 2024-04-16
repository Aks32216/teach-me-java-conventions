package powerpackage;

public class PowerFinder {
    public static long OF(int base, int exponent) {
        int raisedPower=1;
        for (int i = 1; i <= exponent; i++) {
            raisedPower = multiply(raisedPower, base);        }
        return raisedPower;
    }

    private static int multiply(int number1,int number2) {
        return number1 * number2;
    }
}
