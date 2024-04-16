package powerpackage;
import org.junit.jupiter.api.Test;

public class PowerTest {
    @Test
    public void oneRaisedToPowerOneIsOne() {
        assert PowerFinder.OF(1,1) == 1;
    }

    @Test
    public void twoRaisedToPowerOneIsTwo() {
        assert PowerFinder.OF(2,1) == 2;
    }

    @Test
    public void twoRaisedToPowerTwoIsFour() {
        assert PowerFinder.OF(2, 2) == 4;
    }

    @Test
    public void threeRaisedToPowerTwoIsSix() {
        assert PowerFinder.OF(3, 2) == 3*3;
    }
}