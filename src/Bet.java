import java.util.Scanner;

public class Bet {
    public static void main(String[] args) {
        Scanner pari = new Scanner (System.in);
        int team1, team2, res1, res2;
        int score=0;
        System.out.print("Enter a first team bet>");
        team1 = pari.nextInt();
        System.out.print("Enter a second team bet>");
        team2 = pari.nextInt();
        System.out.print("Enter a first team result>");
        res1 = pari.nextInt();
        System.out.print("Enter a second team result>");
        res2 = pari.nextInt();

        if (team1==res1&&team2==res2) {
            score=2;
        }
        else if ((team1>team2&&res1>res2)||(team1<team2&&res1<res2)) {
            score=1;
        }
        else {
            score=0;
        }

        System.out.println(score);
    }
}