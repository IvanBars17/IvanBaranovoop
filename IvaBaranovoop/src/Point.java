public class Point{
    public double x, y;

    public String toSvg(){
        StringBuilder result = new StringBuilder()
                .append("<svg height=\"100\" width=\"100\"xmlns=\"http://www.w3.org/2000/svg\">\n" +
                        "  <circle r=\"45\" cx=\"")
                .append(this.x).append("\" cy= \"").append(this.y).append("\" fill=\"red\" stroke=\"green\" stroke-width=\"3\" />\n" +
                        "</svg>");
        return result.toString();
    }

    public void translate(double dx, double dy){
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    public Point translated(double dx, double dy){
        Point result = new Point();
        result.x = this.x + dx;
        result.y = this.y +dy;
        return result;
    }
}
