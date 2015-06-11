import java.util.Random;

/**
 * Created by ADMIN on 08.06.2015.
 */
public class MyClass {

    public int method() {

        int sum = 0;
        Random random = new Random();

        for (int i = 0; i < random.nextInt(999999) ; i++) {
            sum += i;
        }

        if (sum > 0) {
            throw new ArithmeticException("ArithmeticException");
        }

        return sum;
    }

}
