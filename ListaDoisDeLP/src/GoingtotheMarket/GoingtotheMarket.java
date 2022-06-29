package GoingtotheMarket;

import java.util.*;

public class GoingtotheMarket {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int goToMarket = leia.nextInt();
        int countFruits = leia.nextInt();

        ArrayList<String> fruits = new ArrayList<>();

        for (int i = 0; i < countFruits; i++) {
            fruits.add(leia.next().replace(",", "."));
        }

        int countBuyFruits = leia.nextInt();
        ArrayList<String> fruitsToBuy = new ArrayList<>();

        for (int i = 0; i < countBuyFruits; i++) {
            fruitsToBuy.add(leia.next());
        }

    }

}
