package Task;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Password должен содержать не менее 8 символов: латинские буквы, цифры и {}[](),.;&?!_-+
public class PasswordSource {
    public static String input() throws WrongLoginException {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        Pattern pattern = Pattern.compile("([A-Za-z1234567890{}\\[\\](),.;&?!\\_\\-+]+)");
        Matcher matcher = pattern.matcher(password);

        if ((password.length() < 8) || !matcher.matches()) {
            throw new WrongLoginException();
        }
        return password;
    }
}
