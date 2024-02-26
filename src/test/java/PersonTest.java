
import org.example.LeapYear;
import org.example.Person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void isAbouutShouldReturnTrueIfAgeeIsGreaterThanOrEquals18() {
        Person p = new Person("toufik", "Amouri",50);
        Assertions.assertTrue(p.isAdult());
    }

    @Test
    public void isAbouutShouldReturnTrueIfAgeeIsLessThanOrEquals18() {
        Person p = new Person("toufik", "Amouri",12);
        Assertions.assertFalse(p.isAdult());
    }

    @Test
    public void fullNameTrueTest()
    {
        Person p = new Person("toufik","amouri",15);
        Assertions.assertEquals(p.getFullName(),"toufik amouri");
    }

}

