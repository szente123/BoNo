public class vezerlo {
    public vezerlo() {
        int [] tomb = {1,2,3,5,11,22};
        int szam;
        szam = 0;

        //szam = osszegzesTetele(tomb);
        //System.out.println("szam = " + szam);
        szam = megszamlalasTetele(tomb,5);
        for (int i = 0; i < tomb.length; i++)
            if (tomb[i] > 5);
            szam++;
        System.out.println("tomb = " + tomb);
        {

        }

    }

    public int megszamlalasTetele(int[] tomb, int adat) {
        return 0;

    }

    public int osszegzesTetele(int[] tomb) {
        int eredmeny = 0;
        for (int i = 0; i < tomb.length; i++) {
            eredmeny = eredmeny + tomb[i];

        }

        return eredmeny;
    }
}
