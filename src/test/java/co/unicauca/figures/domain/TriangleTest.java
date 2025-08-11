package co.unicauca.figures.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nelson López y Luisa Fernandez
 */
public class TriangleTest {
    
    public TriangleTest() {
    }
    
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        Triangle instance = new Triangle(1,1,1);
        double expResult = 3;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }

    @Test
    public void testCalculatePerimeter2() {
        System.out.println("calculatePerimeter2");
        Triangle instance = new Triangle(100,50,70);
        double expResult = 100+50+70;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testCalculatePerimeter3() {
        System.out.println("calculatePerimeter3");
        Triangle instance = new Triangle(5000,4000,3000);
        double expResult = 5000+4000+3000;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }

    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        Triangle instance = new Triangle(1,1,1);
        double s = instance.calculatePerimeter()/2;
        double expResult = Math.sqrt(s * (s - 1) * (s - 1) * (s - 1));
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testCalculateArea2() {
        System.out.println("calculateArea2");
        Triangle instance = new Triangle(100,50,70);
        double s = instance.calculatePerimeter()/2;
        double expResult = Math.sqrt(s * (s - 100) * (s - 50) * (s - 70));
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testCalculateArea3() {
        System.out.println("calculateArea3");
        Triangle instance = new Triangle(5000,4000,3000);
        double s = instance.calculatePerimeter()/2;
        double expResult = Math.sqrt(s * (s - 5000) * (s - 4000) * (s - 3000));
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
    }
    
}
