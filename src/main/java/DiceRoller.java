import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        Random random1= new Random();
        Random random2 = new Random();
        Random random3 = new Random();
        Random random4 = new Random(4);

        int num1 = random1.nextInt(6) + 1;
        int num2  = random2.nextInt(6) + 1;
        int num3 = random3.nextInt(6) + 1;
        int num4 = random4.nextInt(6) + 1;

        System.out.println("Unseeded Die 1: " + num1);
        System.out.println("Unseeded Die 2: " + num2);
        System.out.println("Unseeded Die 3: " + num3);
        System.out.println("Seeded Die: " + num4);

    }
}
