import jdk.dynalink.beans.StaticClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.Stack;

public class StackTest {
    private static Stack s;
    // les class equivalence d'un methode push
    //    1-   teste de bas de push
    //    2-   teste pour le table est plein possed 10 element
    @BeforeEach
    void SutUp()
    {
          s = new Stack();
    }
    @Test
    void PushShouldAddElementToTheTopOfTheStack()
    {
       s.push(8);
        Assertions.assertEquals(s.size(),1);
       Assertions.assertEquals(s.peek(),8);
    }
    @Test
    void PushShouldExpandArrayIfStackIsFull()
    {
        for (int  i = 0 ; i<10 ;i++)
        {
            s.push(45);
        }
        Assertions.assertEquals(10,s.size());
        s.push(99);
        Assertions.assertEquals(11,s.size());
        Assertions.assertEquals(s.peek(),99);
    }

    // les class equivalence d'un methode pop
    //    1-   teste de bas de pop
    //    2-   teste pop tell que stack vide  return execption assertthrows(class of  exeption , codition given exeption )
    //    assertthrows (IllegalStateException.class

    @Test
    void PopTellQueStackNonVide()
    {
        s.push(4);
        Assertions.assertEquals(4,s.pop());
        Assertions.assertEquals(0,s.size());
    }
    @Test
    void  PopTellQueStackVide()
    {
        Assertions.assertThrows(IllegalStateException.class,()->s.pop() );
    }






    ///   // les class equivalence d'un methode peek
    //    //    1-   teste de bas de peek
    //    //    2-   teste pop tell que stack vide     return assertthrowds
    @Test
    void peekTellQueStackNonVide()
    {
        s.push(4);
        Assertions.assertEquals(4,s.peek());
    }
    @Test
    void  peekTellQueStackVide()
    {
        Assertions.assertThrows(IllegalStateException.class,()->s.peek() );
    }



    ///   // les class equivalence d'un methode isempty
    //    //    1-   teste true return
    //    //    2-   teste false    return assertthrowds
    @Test
    void TestIsemptyTellQueStackVide()
    {
        Assertions.assertTrue(s.isEmpty());
    }


    @Test
    void TestIsEmptyTellQueStackNonVide()
    {
        s.push(5);
        Assertions.assertFalse(s.isEmpty());
    }




    ///   // les class equivalence d'un methode size()
    //    //    1-  une seul class type de return entier  equals
    //    //
    @Test
    void TestSizeStack()
    {
        for (int i=0;i<4;i++)
        {
            s.push(i);
            Assertions.assertEquals(i+1,s.size());
        }
    }
}
