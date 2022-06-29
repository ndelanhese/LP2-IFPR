package ParenthesisBalanceI;

import java.util.*;

public class ParenthesisBalanceI {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        while (leia.hasNext()) {

            String equacao = leia.next();

            String[] equacaoCortada = equacao.replaceAll("[0-9]", "").replaceAll("[aA-zZ]", "").replaceAll("[*--+/]", "").split("");

            Stack<String> pilhaDeParenteses = new Stack<>();
            
            int a = 0, b = 0;

            for (int i = 0; i < equacaoCortada.length; i++) {

                if (equacaoCortada[0].equals(")")) {
                    i = equacaoCortada.length - 1;
                }

                if (equacaoCortada[i].equals("(")) {

                    pilhaDeParenteses.push("(");
                } else {
                    if (equacaoCortada[i].equals(")")) {
                        
                        if (!pilhaDeParenteses.pop().equals("(")) {
                             i = equacaoCortada.length - 1;
                        }
                        
                    }
                }
                pilhaDeParenteses.pop();
            }

            if (a == b) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        }
    }

}
