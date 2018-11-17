import org.junit.Test;
import scientific.MathUtils;

import static org.junit.Assert.assertEquals;

public class MathUtilsTest {

    @Test
    public void greatestCommonDivisorCorrectForSameNumber() {
        int greatestCommonDivisor = MathUtils.greatestCommonDivisor(13,13);
        assertEquals(13,greatestCommonDivisor);
    }

    @Test
    public void greatestCommonDivisorCorrectForPositiveNumbers() {
        int greatestCommonDivisor = MathUtils.greatestCommonDivisor(5,15);
        assertEquals(5,greatestCommonDivisor);
    }

    @Test
    public void greatestCommonDivisorCorrectFor0Value() {
        int greatestCommonDivisor = MathUtils.greatestCommonDivisor(0,5);
        assertEquals(5,greatestCommonDivisor);
    }

    @Test
    public void greatestCommonDivisorCorrectForNegativeNumbers() {
        int greatestCommonDivisor = MathUtils.greatestCommonDivisor(-15,5);
        assertEquals(5,greatestCommonDivisor);
    }

    @Test
    public void lowestCommonMultipleCorrectForSameNumber() {
        int lowestCommonMultiple = MathUtils.lowestCommonMultiple(2,2);
        assertEquals(2,lowestCommonMultiple);
    }

    @Test
    public void lowestCommonMultipleCorrectForPositiveNumbers() {
        int lowestCommonMultiple = MathUtils.lowestCommonMultiple(2,4);
        assertEquals(4,lowestCommonMultiple);
    }

    @Test
    public void lowestCommonMultipleCorrectForNegativeNumbers() {
        int lowestCommonMultiple = MathUtils.lowestCommonMultiple(-2,-4);
        assertEquals(4,lowestCommonMultiple);
    }

    @Test
    public void lowestCommonMultipleCorrectFor0Value() {
        int lowestCommonMultiple = MathUtils.lowestCommonMultiple(0,4);
        assertEquals(0,lowestCommonMultiple);
    }

}