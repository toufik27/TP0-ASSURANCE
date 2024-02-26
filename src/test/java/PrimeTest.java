

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.Prime;
public class PrimeTest {
    //  5 class  quivvalence de methode
    //  n<2
    //  n div i
    //  n=2  ou n=3
    @Test
    void TestPrimeNumberAvecNInferieurA2()
    {
        Assertions.assertFalse(Prime.isPrime(0));
        Assertions.assertFalse(Prime.isPrime(1));
        Assertions.assertFalse(Prime.isPrime(-5));
    }

    @Test
    void TestPrimeNumberAvecNSuperieruA3EtPremier()
    {
        Assertions.assertTrue(Prime.isPrime(13));
    }
    @Test
    void TestPrimeNumberAvecNSuperieruA3EtNonPremier()
    {
        Assertions.assertFalse(Prime.isPrime(12));
    }


    @Test
    void TestPrimeNumberAvecN_Egal2_Ou_Egal3()
    {
        Assertions.assertTrue(Prime.isPrime(2));
        Assertions.assertTrue(Prime.isPrime(3));
    }


}
