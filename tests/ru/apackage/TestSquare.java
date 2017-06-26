package ru.apackage;

import static org.junit.Assert.*;

import org.junit.Test;
import ru.socialquantum.testtasks.Square;
import ru.socialquantum.testtasks.SquareFactory;

/**
 * Created by Andrii Grygoruk on 25.06.2017.
 */
public class TestSquare {
    final double DELTA = 1e-5;

    @Test
    public void verifySideLength(){
        Square square = SquareFactory.newSquare(5.11);
        assertEquals("Expected value is not equal to actual", 5.11, square.sideLength(), DELTA);
    }

    @Test
    public void verifySquareOfSquarePositive(){
        Square square = SquareFactory.newSquare(0.5);
        assertEquals("Expected value is not equal to actual", 0.25, square.square(), DELTA);
    }

    @Test
    public void verifySquareOfSquareZero(){
        Square square = SquareFactory.newSquare(0.0);
        assertEquals("Expected value is not equal to actual", 0.0, square.square(), DELTA);
    }

    @Test
    public void verifySquaresAreEqualPositive(){
        Square square1 = SquareFactory.newSquare(9.99);
        Square square2 = SquareFactory.newSquare(9.99);
        assertTrue("Squares aren't equal", square1.equalsSquare(square2));
    }

}
