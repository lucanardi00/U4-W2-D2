package Es2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class NumCasOrdinati {

    public static List<Integer> generaNumCasOrdinati(int n) {
        Random random = new Random();
        List<Integer> numeriCasuali = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int numeroCasuale = random.nextInt(101);
            numeriCasuali.add(numeroCasuale);
        }

        Collections.sort(numeriCasuali);

        return numeriCasuali;
    }

    public static void main(String[] args) {
        int n = 10;
        List<Integer> numeriCasualiOrdinati = generaNumCasOrdinati(n);

        System.out.println(numeriCasualiOrdinati);
    }
}