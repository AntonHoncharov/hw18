package homeworkEighteenTest;

import homeworkEighteen.RomanToInteger;
import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {

    RomanToInteger romanToInteger = new RomanToInteger();

    String inputOne = "III";
    String inputTwo = "LVIII";
    String inputThree = "MCMXCIV";

    @Test
    public void testRomanToInteger() {

        Assert.assertEquals(3, romanToInteger.romanToInt(inputOne));
        Assert.assertEquals(58, romanToInteger.romanToInt(inputTwo));
        Assert.assertEquals(1994, romanToInteger.romanToInt(inputThree));
    }
}

