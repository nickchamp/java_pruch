package Distance;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by nickolay on 25.05.17.
 */
public class PointTest {
    @Test
    public void testDistance() {
        Point t1 = new Point(7, 10);
        Point t2 = new Point(7, 19);

        Assert.assertEquals((t1.distance(t2)), 9.0);
    }
}
