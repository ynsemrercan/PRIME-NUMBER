import java.util.Scanner;
public class PrimeNumber {

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " asal bir sayıdır.");
        } else {
            System.out.println(number + " asal bir sayı değildir.");
        }
    }

    }
