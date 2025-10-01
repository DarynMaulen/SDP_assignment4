package implementation;

// Implementor interface defining low-level drawing operations
// (drawCircle and drawSquare) used by shape abstractions.
public interface Renderer {
    void drawCircle(int radius,int x ,int y);
    void drawSquare(int side,int x ,int y);
}
