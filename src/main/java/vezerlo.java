public class vezerlo {
    public vezerlo() {
        System.out.println("vezerlo.vezerlo");
        int[] tomb = {1, 2, 4, 5, 43, 6, 8, 10};
        int eredmeny;

        eredmeny = osszegzesTetele(tomb);

    }

    private int osszegzesTetele(int[] tomb) {
        int vissza = 0;
        for (int Item: tomb) {
            vissza += Item;
        }
        return vissza;
    }
}
