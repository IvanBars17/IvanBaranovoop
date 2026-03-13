public class Main{
    static void main(String[] args) {
        Point pt = new Point();
        pt.x = 3.0;
        pt.y = 5.0;
        Point newPoint = pt.translated(1,2);
        Segment seg = new Segment();
        seg.a = pt;
        seg.b = newPoint;
        System.out.println(seg.length());
    }
}

