public class DiamondApplication {
    public static void main(String[] args) {
        int star = 18;
        drawDiamand(star);
    }

    public static void drawDiamand(int star) {
        for (int i = 1; i <= star; i++) {
            for (int j = star; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < star; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = star; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
