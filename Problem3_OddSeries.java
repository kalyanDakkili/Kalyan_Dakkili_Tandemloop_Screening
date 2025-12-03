import java.util.Scanner;

public class Problem3_OddSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int seriesLength = (n % 2 == 0) ? n - 1 : n;

        System.out.print("Output: ");
        for (int i = 0; i < seriesLength; i++) {
            System.out.print((2 * i + 1));
            if (i != seriesLength - 1) System.out.print(", ");
        }
        System.out.println();
        sc.close();
    }
}
