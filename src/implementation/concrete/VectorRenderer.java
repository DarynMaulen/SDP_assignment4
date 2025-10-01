package implementation.concrete;

import implementation.Renderer;

// Concrete renderer that simulates vector-style drawing.
// Prints a message describing vector-based rendering.
public class VectorRenderer implements Renderer {
    @Override
    public void drawCircle( int radius, int x, int y) {
        System.out.println("Drawing circle as vector at " + x + "," + y);
    }
    @Override
    public void drawSquare(int side, int x,int y ) {
        System.out.println("Drawing square as vector at " + x + "," + y);
    }
}
