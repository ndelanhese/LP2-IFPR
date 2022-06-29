package ParenthesisBalanceI;

import java.util.*;

public class ParenthesisBalanceI {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        while (leia.hasNext()) {
            
            String equacao = leia.next();
            
            String[] equacaoCortada = equacao.replaceAll("[0-9]", "").replaceAll("[aA-zZ]", "").replaceAll("[*--+/]", "").split("");
            
            Stack<String> pilhaDeParentesesAberto = new Stack<>();
            
            boolean verifica = false;
            int count = 0;
            for (int i = 0; i < equacaoCortada.length; i++) {
                
                if (equacaoCortada[0].equals(")")) {
                    verifica = false;
                    break;
                }
                
                if (equacaoCortada[i].equals("(")) {
                    
                    pilhaDeParentesesAberto.push("(");
                    count++;
                } else {
                    
                   
                    
                    if (pilhaDeParentesesAberto.isEmpty()) {
                        verifica = false;
                        break;
                    } else {
                        pilhaDeParentesesAberto.remove(pilhaDeParentesesAberto.size()-1);
                        verifica=true;
                    }
                    
                }
                
            }
            
            if (verifica && count == (equacaoCortada.length /2)) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        }
    }
    
}
