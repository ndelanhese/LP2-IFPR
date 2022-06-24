package AlbumCopa.AlbumCopa;

    import java.util.TreeSet;
   
    import java.util.Scanner;

public class AlbumCopa {

    public static void main(String[] args) {

        int tamanhoALbum = 0;
        int quantidadeFIguras = 0;
        
        TreeSet<Integer> listaFiguras = new TreeSet<>();

        Scanner leia = new Scanner(System.in);

        tamanhoALbum = leia.nextInt();
        quantidadeFIguras = leia.nextInt();

        for (int i = 0; i < quantidadeFIguras; i++) {
            listaFiguras.add(leia.nextInt());
        }
        
        System.out.println(tamanhoALbum - listaFiguras.size());

    }

}
