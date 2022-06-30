package goingtomarket;

import java.util.*;

public class GoingtoMarket {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int idasMercado = leia.nextInt();
        ArrayList<Double> valorTotal = new ArrayList<>();

        for (int i = 0; i < idasMercado; i++) {
            int produtosDisponiveis = leia.nextInt();

            ArrayList<String> produtos = new ArrayList<>();
            ArrayList<Double> precos = new ArrayList<>();

            for (int j = 0; j < produtosDisponiveis; j++) {
                produtos.add(leia.next());
                precos.add(leia.nextDouble());

            }

            int quantidadeCompra = leia.nextInt();

            ArrayList<String> produtosCompra = new ArrayList<>();
            ArrayList<Integer> quantiadeCompraNumero = new ArrayList<>();

            for (int j = 0; j < quantidadeCompra; j++) {
                produtosCompra.add(leia.next());
                quantiadeCompraNumero.add(leia.nextInt());

            }
            double a = 0;
            for (int j = 0; j < quantidadeCompra; j++) {
                boolean teste = true;
                int posicao = 0;
                while (teste) {

                    if (produtos.get(posicao).equals(produtosCompra.get(j))) {

                        teste = false;
                    } else {
                        posicao++;
                    }
                }

                a += (quantiadeCompraNumero.get(j) * precos.get(posicao));

            }
            valorTotal.add(a);

        }

        for (int i = 0; i < idasMercado; i++) {
            System.out.println("R$ " + String.format("%.2f", valorTotal.get(i)));

        }

    }

}
