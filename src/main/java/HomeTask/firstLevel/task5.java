package HomeTask.firstLevel;

import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {

        int[] array = {1, 5, 4, 8, 9, 4};
        Arrays.sort(array);

        System.out.println("Массив, отсортированный по возрастанию: ");
        for (int num : array) {
            System.out.println(num + " ");
        }
        System.out.println("Массив отсортирован по убыванию ");
        for (int i = array.length - 1; i > 0; i--) {
            System.out.println(" " + array[i]);
        }
    }
}
