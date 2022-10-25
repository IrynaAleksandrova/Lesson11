public class ABCException extends Exception {
    @Override
    public String getMessage() {
        return "The document doesn't contain the ABC sequence";
    }
}
