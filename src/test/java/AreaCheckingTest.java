import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

public class AreaCheckingTest {

    @BeforeClass
    public static void printInitMessage() {
        System.out.println("Start testing ...");
    }

    @Test
    public void checkInRectangle() {
        Assert.assertTrue(DataChecking.checkRectangle(-1, -2, 3));
        Assert.assertTrue(DataChecking.checkRectangle(0, -2, 3));
    }

    @Test
    public void checkOutOfRectangle() {
        Assert.assertFalse(DataChecking.checkRectangle(1, -2, 3));
        Assert.assertFalse(DataChecking.checkRectangle(0, 2, 3));
    }

    @Test
    public void checkInTriangle() {
        Assert.assertTrue(DataChecking.checkTriangle(1, 1, 3));
        Assert.assertTrue(DataChecking.checkTriangle(0, 2, 3));
    }

    @Test
    public void checkOutOfTriangle() {
        Assert.assertFalse(DataChecking.checkTriangle(1, -2, 3));
        Assert.assertFalse(DataChecking.checkTriangle(0, 3.01, 3));
    }

    @Test
    public void checkInCircle() {
        Assert.assertTrue(DataChecking.checkCircle(1, -1, 3));
        Assert.assertTrue(DataChecking.checkCircle(0, -3, 3));
    }

    @Test
    public void checkOutOfCircle() {
        Assert.assertFalse(DataChecking.checkCircle(1, 2, 3));
        Assert.assertFalse(DataChecking.checkCircle(-1, 2, 3));
    }

    @Test
    public void checkInArea() {
        Assert.assertEquals("да", DataChecking.checkAll(-1, -2, 3));
        Assert.assertEquals("да", DataChecking.checkAll(0, -2, 3));
    }


    @Test
    public void checkOutOfArea() {
        Assert.assertEquals("нет", DataChecking.checkAll(4, -2, 3));
        Assert.assertEquals("нет", DataChecking.checkAll(0, 3.01, 3));
    }

}
