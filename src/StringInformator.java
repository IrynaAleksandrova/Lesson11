public class StringInformator {

    public static void getLetterSequence(String str) throws ABCException {
        if (str.contains("ABC") || str.contains("abc")) {
            System.out.println(str.contains("ABC") || str.contains("abc"));
        } else throw new ABCException();
    }

    public static void getStartDigitSequence(String str) throws NumericException {
        if (str.startsWith("555")) {
            System.out.println(str.startsWith("555"));
        } else throw new NumericException();
    }

    public static void getEndsDigitSequence(String str) throws SubsequenceException {
        if (str.endsWith("1a2b")) {
            System.out.println(str.endsWith("1a2b"));
        } else throw new SubsequenceException();

    }
}
