public class Ellipse extends Shape {

    private Point center;
    private float rx, ry;

    public Ellipse(Point center, float rx, float ry, Style style) {
        this.center = center;
        this.rx = rx;
        this.ry = ry;
        this.style = style;
    }

    @Override
    public String toSvg() {
        return "";
    }
}
