import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

public class PhoneNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        DecimalFormat decimalFormat = new DecimalFormat("000");

        int areaCode = random.nextInt(778);
        int exchange = random.nextInt(743);
        int subscriber = random.nextInt(1000);

        System.out.println(decimalFormat.format(areaCode) + "-" + decimalFormat.format(exchange) + "-" + decimalFormat.format(subscriber));
    }
}
