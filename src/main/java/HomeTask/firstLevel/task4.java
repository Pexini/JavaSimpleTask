package HomeTask.firstLevel;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("введите число и я скажу простое оно или нет: ");

        int userNum = s.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(userNum); i++) {
            if (userNum % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(userNum + " Является числом " + (isPrime? " простым " : " Составным "));
    }
}
