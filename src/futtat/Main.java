package futtat;

import butorgyar.Butor;
import butorgyar.Butorlap;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Butor butor = new Butor();
        Random random = new Random();

        for (int i = 0; i < random.nextInt(100); i++) {
            butor.lapHozzaad(new Butorlap(random.nextDouble(0, 101), random.nextDouble(0, 101), random.nextBoolean()));
        }

        System.out.println(butor);
    }
}
