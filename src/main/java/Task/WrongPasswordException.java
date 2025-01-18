package Task;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException() {
        super("Неверный формат ввода пароля");
    }
}
