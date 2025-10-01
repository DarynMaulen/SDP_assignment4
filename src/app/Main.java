package app;

import abstraction.refined.Circle;
import abstraction.Shape;
import abstraction.refined.Square;
import implementation.Renderer;
import implementation.concrete.RasterRenderer;
import implementation.concrete.VectorRenderer;

// Application entry point that composes shapes with different renderers
// and demonstrates the Bridge pattern by calling draw() on each shape.
public class Main {
    public static void main(String[] args) {
        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();

        Shape circleWithVector = new Circle(5,10,10,vector);
        Shape squareWithVector = new Square(5,10,10,vector);

        Shape circleWithRaster = new Circle(8,5,5,raster);
        Shape squareWithRaster = new Square(7,10,10,raster);

        circleWithVector.draw();
        squareWithVector.draw();
        circleWithRaster.draw();
        squareWithRaster.draw();
    }
}