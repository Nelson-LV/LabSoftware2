package co.unicauca.figures;

import co.unicauca.figures.domain.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nelson López y Luisa Fernandez
 */
public class Figures {

    public static void main(String[] args) {
        Figure fig1 = new Circle(1);               
        Figure fig2 = new Square(2.3);
        Figure fig3 = new Triangle(3, 4, 5);        
        
        List<Figure> figures = new ArrayList<>();
        figures.add(fig1);
        figures.add(fig2);
        figures.add(fig3);        
        
        for(Figure fig : figures){            
            if (fig instanceof Circle) {
                System.out.println("Figure: Circle");
            } else if (fig instanceof Square) {
                System.out.println("Figure: Square");
            } else if (fig instanceof Triangle) {
                System.out.println("Figure: Triangle");
            }
            
            System.out.println("Area: " + fig.calculateArea());
            System.out.println("Perimeter: " + fig.calculatePerimeter());
        }        
    }
}
