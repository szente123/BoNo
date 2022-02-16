public class main {
    public static void main(String[] args) {
        int[] tomb = {1, 2, 4, 5, 43, 6, 8, 10};
        int eredmeny;

        eredmeny = osszegzesTetele(tomb);

    }
    private static int osszegzesTetele(int[] tomb) {
        int vissza = 0;
        for (int Item: tomb) {
            vissza += Item;
        }
        return vissza;
    }

}
