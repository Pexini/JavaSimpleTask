package HomeTask.firstLevel;

import java.util.Scanner;

public class fird {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println(" Factorial invalid ");
        } else {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;

            }
            System.out.println("factorial " + factorial);
        }

    }
}
