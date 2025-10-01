package implementation.concrete;

import implementation.Renderer;

// Concrete renderer that simulates raster-style drawing.
// Prints a message describing pixel-based rendering.
public class RasterRenderer implements Renderer {
    @Override
    public void drawCircle(int radius,int x , int y) {
        System.out.println("Drawing circle as raster at " + x + "," + y);
    }
    @Override
    public void drawSquare(int side,int x ,int y) {
        System.out.println("Drawing square as raster at " + x + "," + y);
    }
}
