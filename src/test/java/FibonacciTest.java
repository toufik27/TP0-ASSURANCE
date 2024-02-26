
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.Fibonacci;
public class FibonacciTest {
    // 4 class equivalence de la methode  fibonacci
    //        n < 0
    //        n=0
    //        n=1
    //        n > 1
    @Test
    void TestFibonachiReturnAvecNNegative()
    {
        Assertions.assertThrows(Exception.class,()->Fibonacci.fibonacci(-9));
    }
    @Test
    void TestFibonachiReturnAvecNNull()
    {
        Assertions.assertEquals(0,Fibonacci.fibonacci(0));
    }
    @Test
    void TestFibonachiReturnAvecNEgal1()
    {
        Assertions.assertEquals(1,Fibonacci.fibonacci(1));
    }
    @Test
    void TestFibonachiReturnAvecNSupperieruA1()
    {
        Assertions.assertEquals(1,Fibonacci.fibonacci(2));
    }



}
