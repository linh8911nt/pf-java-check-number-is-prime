import java.util.Scanner;

public class NumberIsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Prime number: ");
        for (int i = 0; i < 10000; i++){
            if (isPrime(i))
                System.out.print(" " + i);
        }

    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                return true;
            else
                return false;
        }
    }
}
