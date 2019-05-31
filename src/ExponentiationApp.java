import java.util.Scanner;

public class ExponentiationApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ExponentiationApp math = new ExponentiationApp();
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Enter an exponention:");
        int exponention = scanner.nextInt();
        System.out.println(math.operation(number, exponention));
    }

    public int operation(int number, int exponention) {
        int result = 1;
        for (int i = 0; i < exponention; i++) {
            result *= number;
        }
        return result;

    }
}
