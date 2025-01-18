package Task;
// Login должен содержать не менее 20 символов: латинскиx букв прописных и строчных, цифр и символов @ . _ -


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginSource {
    public static String input() throws WrongLoginException {
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        Pattern pattern = Pattern.compile("[A-Za-z1234567890@._-]+");
        Matcher matcher = pattern.matcher(login);
        if (login.equals("exit")) {
            System.out.println("Программа завершена, выход...");
            System.exit(0);
        }
        if ((login.length() < 20) || !matcher.matches()) {
            throw new WrongLoginException();
        }
        return login;
    }
}
