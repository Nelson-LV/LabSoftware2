package co.unicauca.figures.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nelson López y Luisa Fernandez
 */
public class CircleTest {
    
    public CircleTest() {
    }
    
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        Circle instance = new Circle(1);
        double expResult = Math.PI*2;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testCalculatePerimeter2() {
        System.out.println("calculatePerimeter2");
        Circle instance2 = new Circle(0.00001);
        double expResult2 = Math.PI*2*0.00001;
        double result2 = instance2.calculatePerimeter();
        assertEquals(expResult2, result2, 0.01);
    }
    
    @Test
    public void testCalculatePerimeter3() {
        System.out.println("calculatePerimeter3");
        Circle instance2 = new Circle(1000000);
        double expResult2 = Math.PI*2*1000000;
        double result2 = instance2.calculatePerimeter();
        assertEquals(expResult2, result2, 0.01);
    }

    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        Circle instance = new Circle(1);
        double expResult = Math.PI;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);        
    }
    
    @Test
    public void testCalculateArea2() {
        System.out.println("calculateArea2");
        Circle instance = new Circle(0.00001);
        double expResult = Math.PI*0.00001*0.00001;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);        
    }
    
    @Test
    public void testCalculateArea3() {
        System.out.println("calculateArea3");
        Circle instance = new Circle(1000000);
        double expResult = Math.PI*1000000*1000000;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);       
    }
    
}
