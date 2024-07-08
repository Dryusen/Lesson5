package app;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть суму доходу: ");
        double income = scanner.nextDouble();

        double tax = calculateTax(income);

        BigDecimal taxFormatted = new BigDecimal(tax).setScale(2, RoundingMode.HALF_UP);

        System.out.println("Сума податку: " + taxFormatted);
    }

    public static double calculateTax(double income) {
        double tax = 0;

        if (income <= 10000) {
            tax = income * 0.025;
        } else if (income <= 25000) {
            tax = income * 0.043;
        } else {
            tax = income * 0.067;
        }

        return tax;
    }
}
