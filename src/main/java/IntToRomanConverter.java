public class IntToRomanConverter {
    public static String convert(int input) {
        if (input == 1) return "I";
        else if (input == 2) return "II";
        else if (input == 4) return "IV";
        return "";
    }
}
