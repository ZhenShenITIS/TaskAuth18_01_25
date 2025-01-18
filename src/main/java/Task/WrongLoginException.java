package Task;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String message) {
        super(message);
    }
    public WrongLoginException() {
        super("Неверный формат ввода логина");
    }
}
