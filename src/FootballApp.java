import java.util.Scanner;

public class FootballApp {
    public static void main(String[] args) {
        Scanner pari = new Scanner(System.in);
        FootballApp bet = new FootballApp();
        System.out.print("Enter a first team score>");
        int teamFirstScore = pari.nextInt();
        System.out.print("Enter a second team score>");
        int teamSecondScore = pari.nextInt();
        System.out.print("Enter a user bet for first team>");
        int userFirstScore = pari.nextInt();
        System.out.print("Enter a user bet for second team>");
        int userSecondScore = pari.nextInt();
        System.out.println(bet.scoreMatch(teamFirstScore, teamSecondScore, userFirstScore, userSecondScore));
    }

    public int scoreMatch(int teamFirstScore, int teamSecondScore, int userFirstScore, int userSecondScore) {
        return (teamFirstScore == userFirstScore && teamSecondScore == userSecondScore) ? 2 :
                ((teamFirstScore > teamSecondScore && userFirstScore > userSecondScore) ||
                        (teamFirstScore < teamSecondScore && userFirstScore < userSecondScore)) ||
                        (teamFirstScore == teamSecondScore && userFirstScore == userSecondScore) ? 1 : 0;

    }
}
