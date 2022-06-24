package CantineQueue;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class CantineQueue {
    
    public static void main(String[] args) {
        int count = 0;
        Scanner leia = new Scanner(System.in);
        
        int testes = leia.nextInt();
        
        ArrayList<Integer> notas = new ArrayList<>();
        ArrayList<Integer> notasUm = new ArrayList<>();
        ArrayList<Integer> resultados = new ArrayList<>();
        
        for (int j = 0; j < testes; j++) {
            int alunos = leia.nextInt();
            
            for (int i = 0; i < alunos; i++) {
                int a = leia.nextInt();
                notas.add(a);
                notasUm.add(a);
            }
            
            Collections.sort(notas, Collections.reverseOrder());
            
            for (int i = 0; i < notas.size(); i++) {
                if (notas.get(i) == notasUm.get(i)) {
                    count++;
                }
            }
            
            resultados.add(count);
            count = 0;
            notas.clear();
            notasUm.clear();
            
        }
        
        for (int i = 0; i < resultados.size(); i++) {
            System.out.println(resultados.get(i));
        }
        
    }
    
}
