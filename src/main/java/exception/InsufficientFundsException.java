package exception;

public class InsufficientFundsException extends Exception{
    private final String message;

    public InsufficientFundsException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
