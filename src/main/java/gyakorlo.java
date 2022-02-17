public class gyakorlo {
    int [] tomb = {1,2,5,11,22,7};
    int eredmeny = 0;
    public gyakorlo() {

        //int [] tomb = new int[10];
        //int meret = tomb.length;

        /*for (int i = 0; i < 10; i++) {
            tomb[i] = i+1;
        }*/
        for (int i = 0; i < tomb.length; i++) {
            //System.out.println("tomb = " + tomb[i]);
            eredmeny = eredmeny + tomb[i];
        }
        System.out.println("eredmeny = " + eredmeny);
        osszegzesTetele();
    }

    private void osszegzesTetele() {
        eredmeny = 0;

        for (int i = 0; i < tomb.length; i++) {
            //System.out.println("tomb = " + tomb[i]);
            eredmeny = eredmeny + tomb[i];
        }
        System.out.println("eredmeny = " + eredmeny);

    }

}
