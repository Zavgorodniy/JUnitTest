import org.junit.Test;

/**
 * Created by ADMIN on 08.06.2015.
 */
public class MyClassTest {

    MyClass object = new MyClass();

    @Test(timeout = 3000)
    public void myMethodTest() {
        try {
            object.method();
        } catch (ArithmeticException e) {
        }
    }

    @Test(expected = ArithmeticException.class)
    public void exceptionTest() {
        object.method();
    }

}
