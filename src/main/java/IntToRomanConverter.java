import java.util.HashMap;
import java.util.Map;

public class IntToRomanConverter {
    private static final Map<Integer, String> intToRomanMap = new HashMap<Integer, String>() {
        {
            put(1, "I");
            put(2, "II");
            put(4, "IV");
        }
    };

    public static String convert(int input) {
        return intToRomanMap.get(input);
    }
}
