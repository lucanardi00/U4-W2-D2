package Es2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumCasInversi {

    public static List creaListaNumInversi(List lista) {
        List nuovaLista = new ArrayList<>(lista);

        List listaInvertita = new ArrayList<>(lista);
        Collections.reverse(listaInvertita);

        nuovaLista.addAll(listaInvertita);

        return nuovaLista;
    }

    public static void main(String[] args) {
        int n = 10;
        List<Integer> listaOriginale = NumCasOrdinati.generaNumCasOrdinati(n);

        System.out.println("Lista originale ordinata di numeri casuali: " + listaOriginale);

        List<Integer> listaNumInverso = creaListaNumInversi(listaOriginale);

        System.out.println("Lista con elementi seguiti dall'inverso: " + listaNumInverso);
    }
}

