package abstraction;

import implementation.Renderer;

// Abstract base class for shapes in the Bridge pattern;
// Holds a reference to a Renderer and defines the draw() contract.
public abstract class Shape {
    protected final Renderer renderer;
    protected Shape(Renderer renderer) {
        this.renderer = renderer;
    }
    public abstract void draw();
}
