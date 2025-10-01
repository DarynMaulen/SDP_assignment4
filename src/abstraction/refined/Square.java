package abstraction.refined;

import abstraction.Shape;
import implementation.Renderer;

// Concrete abstraction that stores square geometry and delegates rendering to the injected Renderer.
public class Square extends Shape {
    private final int side,x,y;
    public Square(int side, int x, int y, Renderer renderer) {
        super(renderer);
        this.side = side;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        renderer.drawSquare(side,x,y);
    }
}
