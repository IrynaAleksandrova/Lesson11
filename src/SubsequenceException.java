public class SubsequenceException extends Exception {

    public SubsequenceException() {
        super("The document doesn't end with the sequence 1a2b");
    }
}
