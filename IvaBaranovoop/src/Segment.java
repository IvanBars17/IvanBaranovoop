public class Segment{
    public Point a, b;

    public double length(){
        double first = Math.pow(this.b.x - this.a.x, 2);
        double second = Math.pow(this.b.y - this.a.y, 2);
        return Math.sqrt(first+second);
    }
}
