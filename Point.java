/**
 * The Point class represents a point in 2D space. This is a second sentence.
 *
 * @author samoh
 * @version 1.0
 */















public class Point {

    /**
     * x represents the x coordinate of an (x,y) coordinate in 2D space. This is a second sentence.
     */
    private int x;
    private int y;

    /**
     * Explicit value constructor for Point. Accepts whats needed for 2D space (2 <code>int</code>s).
     * @param x
     * @param y
     *
     */

    public Point(){
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
