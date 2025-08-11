package co.unicauca.figures.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nelson López y Luisa Fernandez
 */
public class SquareTest {
    
    public SquareTest() {
    }
    
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        Square instance = new Square(1);
        double expResult = 4;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testCalculatePerimeter2() {
        System.out.println("calculatePerimeter2");
        Square instance = new Square(0.00001);
        double expResult = 0.00001*4;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testCalculatePerimeter3() {
        System.out.println("calculatePerimeter3");
        Square instance = new Square(1000000);
        double expResult = 4*1000000;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }

    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        Square instance = new Square(1);
        double expResult = 1;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testCalculateArea2() {
        System.out.println("calculateArea2");
        Square instance = new Square(0.00001);
        double expResult = 0.00001*0.00001;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testCalculateArea3() {
        System.out.println("calculateArea3");
        Square instance = new Square(10000);
        double expResult = 10000*10000;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
    }
    
}
