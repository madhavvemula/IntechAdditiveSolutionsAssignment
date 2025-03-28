package LargestPrime;

public class LargestPrimeInPiAlternative {
    public static void main(String[] args) {

        String pi = "3141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117067";

        int largestPrime = LargestPrimeInPi(pi);

        if (largestPrime != -1) {
            System.out.println("Largest 5-digit prime in first 100 digits of Pi: " + largestPrime);
        } else {
            System.out.println("No 5-digit prime found.");
        }
    }

    // Main logic function
    public static int LargestPrimeInPi(String pi) {
        int maxPri = -1;

        for (int i = 0; i <= pi.length() - 5; i++) {
            int num = Integer.parseInt(pi.substring(i, i + 5));
            if (isPrime(num) && num > maxPri) {
                maxPri = num;
            }
        }
        return maxPri;
    }

    // Prime check function
    public static boolean isPrime(int k) {
        if (k < 2) return false;
        if (k == 2 || k == 3) return true;
        if (k % 2 == 0 || k% 3 == 0) return false;
        for (int i = 5; i * i <= k; i += 6) {
            if (k % i == 0 || k % (i + 2) == 0) return false;
        }
        return true;
    }
}


