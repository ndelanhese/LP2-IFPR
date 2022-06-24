package ParenthesisBalanceI;

import java.util.Scanner;

public class ParenthesisBalanceI {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String equacao = leia.next();

        String[] equacaoCortada = equacao.replaceAll("[0-9]", "").replaceAll("[aA-zZ]", "").replaceAll("[*--+/]", "").split("");

        int a = 0, b = 0;

        for (int i = 0; i < equacaoCortada.length; i++) {
            
            if(equacaoCortada[0].equals(")")){
                i = equacaoCortada.length - 1;
            }
                        
            if (equacaoCortada[i].equals("(")) {
               
                a++;
            } else {
                if (equacaoCortada[i].equals(")")) {
                    b++;
                }
            }
        }
        
        if (a == b) {
            System.out.println("correct");
        }else{
            System.out.println("incorrect");
        }

    }

}
