public class main {
    public static void main(String[] args) {
        vezerlo start = new vezerlo();
        int[] tomb = {1,2,5,8,11,33};
        int eredmény;

        eredmény = osszegzésTetel(tomb);

    }

    private static int osszegzésTetel(int[] tomb) {
        int vissza =0;
        for (int Item:tomb) {
            vissza += Item;

        }
        return vissza;
    }

}
