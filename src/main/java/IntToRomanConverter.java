import java.util.*;

public class IntToRomanConverter {

    private static final Map<Integer, String> unitSymbols = new HashMap<Integer, String>() {
        {
            put(1, "I");
            put(4, "IV");
            put(5, "V");
            put(9, "IX");
            put(10, "X");
            put(40, "XL");
            put(50, "L");
            put(90, "XC");
            put(100, "C");
            put(400, "CD");
            put(500, "D");
            put(900, "CM");
            put(1000, "M");
        }
    };

    private static final List<Integer> unitSizes = Arrays.asList(
            1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    );

    private static String convertRecursive(int input) throws InvalidInputException {
        if (input < 0) {
            throw new InvalidInputException();
        }

        String result = "";

        for (Integer unitSize : unitSizes) {
            if (input >= unitSize) {
                result = unitSymbols.get(unitSize) + convertRecursive(input - unitSize);
                break;
            }
        }

        return result;
    }

    public static String convert(int input) throws InvalidInputException {
        return convertRecursive(input);
    }
}
