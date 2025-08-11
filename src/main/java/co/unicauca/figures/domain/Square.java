package co.unicauca.figures.domain;

/**
 *
 * @author Nelson López y Luisa Fernandez
 */
public class Square implements Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return side*4;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }
    
}
