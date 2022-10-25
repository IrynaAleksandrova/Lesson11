public class SubsequenceException extends Exception {
    @Override
    public String getMessage() {
        return "The document doesn't end with the sequence 1a2b";
    }
}
