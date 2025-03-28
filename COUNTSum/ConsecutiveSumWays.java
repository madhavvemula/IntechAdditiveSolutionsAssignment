package COUNTSum;

import java.util.Scanner;

public class ConsecutiveSumWays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int c = 0;

        // this is the formula
        for (int k = 2; k * (k - 1) / 2 < n; k++) {
            int num= n - k * (k - 1) / 2;
            if (num % k == 0) {
                int l = num / k;
                if (l> 0) {
                    c++;
                    System.out.println("Way " + c + ": Starts from " + l + " of length " + k);
                }
            }
        }

        System.out.println("Total ways: " + c);
        sc.close();
    }
}

