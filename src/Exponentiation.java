import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        System.out.print("Enter num, exp ");
        Scanner scanner = new Scanner(System.in);
        String num, exp;

        num = scanner.next();
        exp = scanner.next();


        int res=1;
        for (int i=0; i<Integer.parseInt(exp); i++) {
            res = res * Integer.parseInt(num);
        }
        System.out.println(res);

    }
}
