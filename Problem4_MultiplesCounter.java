import java.util.Scanner;

public class Problem4_MultiplesCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers separated by space: ");
        String[] input = sc.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        System.out.println("Output:");
        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : numbers) {
                if (num % i == 0) count++;
            }
            System.out.println(i + ": " + count);
        }
        sc.close();
    }
}
