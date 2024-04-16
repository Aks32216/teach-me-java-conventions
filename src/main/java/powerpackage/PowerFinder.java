package powerpackage;

public class PowerFinder {
    public static long OF(int base, int exponent) {
        int raisedPower=1;
        for (int i = 1; i <= exponent; i++) {
            raisedPower *= base;
        }
        return raisedPower;
    }
}
