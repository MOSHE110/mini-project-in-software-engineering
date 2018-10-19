package primitives_tests;
import primitives.Coordinate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static groovy.util.GroovyTestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

public class CoordinateTest {
    private Coordinate c1,c2,c3,c4;

    @BeforeEach
    void setUp()
    {
        c1 = new Coordinate();
        c2 = new Coordinate(5);
        c3 = new Coordinate(10);
        c4 = new Coordinate(-3);
    }

    @Test
    void getPositionTest()
    {
        assertAll(
                () -> assertEquals(0, c1.get_Coordinate_Value()),
                () -> assertEquals(5, c2.get_Coordinate_Value()),
                () -> assertEquals(10, c3.get_Coordinate_Value()),
                () -> assertEquals(-3, c4.get_Coordinate_Value())
        );
    }

    @Test
    void setCoordinatePositionTest()
    {
        c1.setCoordinateValu_(3);
        c2.setCoordinateValu_(4);

        assertAll(
                () -> assertEquals(3, c1.get_Coordinate_Value()),
                () -> assertEquals(4, c2.get_Coordinate_Value())
        );
    }

    @Test
    void compareToTest()
    {
        assertTrue(c2.compareTo(c3) < 0);
    }

    @Test
    void staticAddTest()
    {
        Coordinate r1 = Coordinate.add(c1,c2);
        Coordinate r2 = Coordinate.add(c2,c4);
        Coordinate r3 = Coordinate.add(c2,c3);

        Coordinate e1 = new Coordinate(5);
        Coordinate e2 = new Coordinate(2);
        Coordinate e3 = new Coordinate(15);
        assertAll(
                () -> assertTrue(r1.compareTo(e1) == 0),
                () -> assertTrue(r2.compareTo(e2) == 0),
                () -> assertTrue(r3.compareTo(e3) == 0)
        );
    }

    @Test
    void staticSubtractTest()
    {
        Coordinate r1 = Coordinate.subtract(c1,c2);
        Coordinate r2 = Coordinate.subtract(c2,c4);
        Coordinate r3 = Coordinate.subtract(c2,c3);

        Coordinate e1 = new Coordinate(-5);
        Coordinate e2 = new Coordinate(8);
        Coordinate e3 = new Coordinate(-5);
        assertAll(
                () -> assertTrue(r1.compareTo(e1) == 0),
                () -> assertTrue(r2.compareTo(e2) == 0),
                () -> assertTrue(r3.compareTo(e3) == 0)
        );
    }

}
