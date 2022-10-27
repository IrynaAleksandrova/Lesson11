public class ABCException extends Exception {

    public ABCException() {
        super("The document doesn't contain the ABC sequence");
    }
}
