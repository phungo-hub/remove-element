import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isExist = false;
        int index_del = -1;
        int[] array = {10, 4, 6 ,8, 6, 0, 0,0};

        Scanner scanner = new Scanner(System.in);
        System.out.println("input an element to remove: ");
        int input = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == input) {
                System.out.println("Index of " + input + " is: " + i);
                index_del = i;
            }
        }
        for (int i = index_del; i < array.length-1; i++) {
            array[i] = array[i+1];
        }

        System.out.println("new array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}