public class Oblig1 {


    int []a = {1,2,3,4,5,6,7,8,9};


    public int FinnTall(int b) {

        for (int i = 1; i < a.length; i++) {

            int maks_value = a[i];

            if (a[i] > maks_value)
                maks_value = a[i];


        }
        return maks_value;
    }





