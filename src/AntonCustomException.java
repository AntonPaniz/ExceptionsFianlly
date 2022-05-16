public class AntonCustomException extends Exception{
    public AntonCustomException() {
    }

    public AntonCustomException(String message) {
        super(message);
    }

    public AntonCustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public AntonCustomException(Throwable cause) {
        super(cause);
    }

    public AntonCustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
