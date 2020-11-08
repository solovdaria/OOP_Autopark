import org.junit.Assert;
import org.junit.Test;

public class Tests {
    Autopark aut = new Autopark();
    @Test
    public void countTests()
    {
        int costRes1 = aut.countCost();
        Assert.assertEquals(0, costRes1);

        aut.menu(3, 2);
        aut.menu(3, 5);


        int costRes2 = aut.countCost();
        Assert.assertEquals(10, costRes2);
    }

    @Test
    public void findSpeedTests()
    {
        String strRes1 = aut.findSpeed(10, 400);
        Assert.assertEquals("", strRes1);

        aut.menu(3, 1);

        String strRes2 = aut.findSpeed(10, 400);
        Assert.assertEquals("Cabriolet ", strRes2);

        aut.menu(3, 2);
        aut.menu(3, 5);

        String strRes3 = aut.findSpeed(10, 400);
        Assert.assertEquals("Cabriolet Minivan Universal ", strRes3);

        String strRes4 = aut.findSpeed(170, 400);
        Assert.assertEquals("Cabriolet Minivan ", strRes4);
    }

    @Test
    public void sortTests()
    {
        String sortRes1 = aut.sort();
        Assert.assertEquals("", sortRes1);

        aut.menu(3, 2);
        aut.menu(3, 5);

        String sortRes2 = aut.sort();
        Assert.assertEquals("Minivan Universal Cabriolet ", sortRes2);
    }
}
