import org.junit.Assert;
import org.junit.Test;

public class testClass {

    @Test(expected = InvalidInputException.class)
    public void testNegativeInput() throws InvalidInputException {
        int input = -1;
        IntToRomanConverter.convert(input);
    }

    @Test
    public void test1() throws InvalidInputException {
        int input = 1;

        String romanEquivalent = IntToRomanConverter.convert(input);
        String expected = "I";

        Assert.assertEquals(expected, romanEquivalent);
    }

    @Test
    public void test2() throws InvalidInputException {
        int input = 2;

        String romanEquivalent = IntToRomanConverter.convert(input);
        String expected = "II";

        Assert.assertEquals(expected, romanEquivalent);
    }

    @Test
    public void test3() throws InvalidInputException {
        int input = 3;

        String romanEquivalent = IntToRomanConverter.convert(input);
        String expected = "III";

        Assert.assertEquals(expected, romanEquivalent);
    }

    @Test
    public void test4() throws InvalidInputException {
        int input = 4;

        String romanEquivalent = IntToRomanConverter.convert(input);
        String expected = "IV";

        Assert.assertEquals(expected, romanEquivalent);
    }

    @Test
    public void test9() throws InvalidInputException {
        int input = 9;

        String romanEquivalent = IntToRomanConverter.convert(input);
        String expected = "IX";

        Assert.assertEquals(expected, romanEquivalent);
    }
}
