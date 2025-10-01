package abstraction.refined;

import abstraction.Shape;
import implementation.Renderer;

// Concrete abstraction that stores circle geometry and delegates rendering to the injected Renderer
public class Circle extends Shape {
    private final int radius,x,y;
    public Circle(int radius, int x, int y, Renderer renderer) {
        super(renderer);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        renderer.drawCircle(radius,x,y);
    }
}
