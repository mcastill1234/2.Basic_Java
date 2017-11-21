import java.util.Calendar;
import java.util.Locale;


public class TestFormat {
    public static void main(String[] args) {
        long n = 461012;
        System.out.format("%d%n", n);  // --> "461012"
        System.out.format("%08d%n", n);  // --> "00461012"

    }
}
