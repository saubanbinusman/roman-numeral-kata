import org.junit.Assert;
import org.junit.Test;

public class testClass {

    @Test
    public void testNegativeInput() {
        
    }

    @Test
    public void test1() {
        int input = 1;

        String romanEquivalent = IntToRomanConverter.convert(input);
        String expected = "I";

        Assert.assertEquals(expected, romanEquivalent);
    }

    @Test
    public void test2() {
        int input = 2;

        String romanEquivalent = IntToRomanConverter.convert(input);
        String expected = "II";

        Assert.assertEquals(expected, romanEquivalent);
    }

    @Test
    public void test3() {
        int input = 4;

        String romanEquivalent = IntToRomanConverter.convert(input);
        String expected = "IV";

        Assert.assertEquals(expected, romanEquivalent);
    }
}
