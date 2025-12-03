import java.util.Scanner;

public class Problem2_OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Output: ");
        for (int i = 0; i < n; i++) {
            System.out.print((2 * i + 1));
            if (i != n - 1) System.out.print(", ");
        }
        System.out.println();
        sc.close();
    }
}
