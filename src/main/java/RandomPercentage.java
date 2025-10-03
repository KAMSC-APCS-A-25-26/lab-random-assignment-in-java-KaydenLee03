import java.text.DecimalFormat;
import java.util.Random;

public class RandomPercentage {
    public static void main(String[] args) {
        Random random1 = new Random();
        Random random2 = new Random(2);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        double percent1 = random1.nextDouble()*100;
        double percent2 = random2.nextDouble()*100;

        System.out.println("Unseeded Random: " + decimalFormat.format(percent1) + "%");
        System.out.println("Seeded Random: " + decimalFormat.format(percent2) + "%");
    }
}