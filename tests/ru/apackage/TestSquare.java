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
    public void checkSideLengthPositive(){
        Square square = SquareFactory.newSquare(5.11);
        assertEquals("Expected value is not equal to actual", 5.11, square.sideLength(), DELTA);
    }

    @Test
    public void checkSideLengthZero(){
        Square square = SquareFactory.newSquare(0);
        assertEquals("Expected value is not equal to actual", 0, square.sideLength(), DELTA);
    }

    /*
     In my opinion, test expected result should be some Exception, if provided sideLength is negative. Nevertheless, it should be specified in specification
     */
    @Test(expected = Exception.class)
    public void checkSideLengthNegative(){
        Square square = SquareFactory.newSquare(-15.99);
        square.sideLength();
    }

    @Test
    public void checkSquareOfSquarePositive(){
        Square square = SquareFactory.newSquare(0.5);
        assertEquals("Expected value is not equal to actual", 0.25, square.square(), DELTA);
    }

    @Test
    public void checkSquareOfSquareZero(){
        Square square = SquareFactory.newSquare(0.0);
        assertEquals("Expected value is not equal to actual", 0.0, square.square(), DELTA);
    }

    /*
     In my opinion, test expected result should be some Exception, if provided sideLength is negative. Nevertheless, it should be specified in specification
     */
    @Test(expected = Exception.class)
    public void checkSquareOfSquareNegative(){
        Square square = SquareFactory.newSquare(-25.5);
        square.square();
    }

    @Test
    public void checkSquaresAreEqualPositive(){
        Square square1 = SquareFactory.newSquare(9.9);
        Square square2 = SquareFactory.newSquare(9.9);
        assertTrue("Squares aren't equal", square1.equalsSquare(square2));
    }

    @Test
    public void checkSquaresAreEqualZero(){
        Square square1 = SquareFactory.newSquare(0.0);
        Square square2 = SquareFactory.newSquare(0.0);
        assertTrue("Squares aren't equal", square1.equalsSquare(square2));
    }

    /*
     In my opinion, test expected result should be some Exception, if provided sideLength is negative. Nevertheless, it should be specified in specification
     */
    @Test(expected = Exception.class)
    public void checkSquaresAreEqualNegative(){
        Square square1 = SquareFactory.newSquare(-0.1);
        Square square2 = SquareFactory.newSquare(-0.1);
        square1.equalsSquare(square2);
    }
}
