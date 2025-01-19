package Task;

import org.example.NumberEq0Exception;
import org.example.NumberSource;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User user = new User("UserName21062006@7899", "PassWordOf[]User", Role.USER);
        User admin = new User("AdminNaming210332006@7899", "PassWordOf{}Admin", Role.ADMIN);

        User[] users = {user, admin};
        String login = "";
        String password = "";
        boolean inputMismatch = true;

        while (inputMismatch) {
            try {
                System.out.print("Введите логин: ");
                login = LoginSource.input();
                System.out.print("Введите пароль: ");
                password = PasswordSource.input();
                inputMismatch = false;
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
            } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
            }
        }
        Role currentRole = null;
        int n = 0;
        while (n < users.length) {
            User currentUser = users[n];
            if (userCheck(currentUser, login, password) == Role.ADMIN) {
                currentRole = Role.ADMIN;
            }
            if (userCheck(currentUser, login, password) == Role.USER) {
                currentRole = Role.USER;

            }
            n++;
        }
        if (currentRole == Role.ADMIN) {
            System.out.println("1. File \n" +
                    "2. Create new User \n" +
                    "3. exit");
        } else if (currentRole == Role.USER) {
            System.out.println("1. File \n" +
                    "2. Get play list \n" +
                    "3. exit");
        } else if (currentRole == null) {
            System.out.println("1. exit");
        }


        Scanner scanner = new Scanner(System.in);
        String messege = scanner.nextLine();
        if (messege.equals("exit")) {
            System.out.println("Программа завершена, выход...");
            System.exit(0);

        }


    }
    public static Role userCheck (User user, String login, String password){
        if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
            return user.getRole();
        }
        return null;

    }

}
