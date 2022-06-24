package EvenandOdd;

import java.util.*;

public class EvenandOdd {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int qtdNumeros = leia.nextInt();

        ArrayList<Integer> numerosPar = new ArrayList<>();
        ArrayList<Integer> numerosImPar = new ArrayList<>();

        for (int i = 0; i < qtdNumeros; i++) {
            int a = leia.nextInt();

            int conta = a % 2;
            if (conta == 0) {
                numerosPar.add(a);
            } else {
                numerosImPar.add(a);
            }
        }
        Collections.sort(numerosPar);
        Collections.sort(numerosImPar, Collections.reverseOrder());

        for (int i = 0; i < numerosPar.size(); i++) {
            
                System.out.println(numerosPar.get(i));
            
        }
        for (int i = 0; i < numerosImPar.size(); i++) {
            
                System.out.println(numerosImPar.get(i));
            
        }
        

    }

}
