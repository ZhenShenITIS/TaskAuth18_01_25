package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberSource {
    public static double input() throws NumberEq0Exception {
        Scanner scanner = new Scanner(System.in);
        double f = scanner.nextDouble();

        if ((int)f == 0) {
            throw new NumberEq0Exception();
        }
        return f;
    }
}
