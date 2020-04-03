import java.util.*;

public class IntToRomanConverter {

    private static final Map<Integer, String> unitSymbols = new HashMap<Integer, String>() {
        {
            put(1, "I");
            put(5, "V");
            put(10, "X");
            put(50, "L");
            put(100, "C");
            put(500, "D");
            put(1000, "M");
        }
    };

    private static final List<Integer> unitSizes = Arrays.asList(
            1000, 500, 100, 50, 10, 5, 1
    );

    private static String convertRecursive(int input) {
        String answer = "";

        for (int currentUnitSizesIndex = 0; currentUnitSizesIndex < unitSizes.size(); currentUnitSizesIndex++) {
            Integer unitSize = unitSizes.get(currentUnitSizesIndex);

            while (input >= unitSize) {
                answer += unitSymbols.get(unitSize);
                input -= unitSize;
            }
        }

        return answer;
    }

    public static String convert(int input) throws InvalidInputException {
        String answer = "";

        while (input > 0) {

        }
        
        return answer;
    }
}
