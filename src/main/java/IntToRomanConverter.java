import java.util.HashMap;
import java.util.Map;

public class IntToRomanConverter {
    private static final Map<Integer, String> intToRomanMap = new HashMap<Integer, String>() {
        {
            put(1, "I");
            put(2, "II");
            put(3, "III");
            put(4, "IV");
            put(9, "IX");
        }
    };

    public static String convert(int input) throws InvalidInputException {
        if (intToRomanMap.containsKey(input)) {
            return intToRomanMap.get(input);
        } else {
            throw new InvalidInputException();
        }
    }
}
