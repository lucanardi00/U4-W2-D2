package Es2;

import java.util.List;

public class PariDispari {

    public static void pariDispari(List lista, boolean pari) {
        for (int i = 0; i < lista.size(); i++) {
            if (pari && i % 2 == 0) {
                System.out.println("Posizione " + i + ": " + lista.get(i));
            } else if (!pari && i % 2 != 0) {
                System.out.println("Posizione " + i + ": " + lista.get(i));
            }
        }
    }

    public static void main(String[] args) {
        int n = 10;
        List<Integer> listaOriginale = NumCasOrdinati.generaNumCasOrdinati(n);

        System.out.println(listaOriginale);

        System.out.println("Valori nelle posizioni pari:");
        pariDispari(listaOriginale, true);

        System.out.println("Valori nelle posizioni dispari:");
        pariDispari(listaOriginale, false);
    }
}

