public class NumericException extends Exception {
    @Override
    public String getMessage() {
        return "The document doesn't start with sequence 555";
    }
}
