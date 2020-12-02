package practice;

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape r = new Rectangle();

        Shape [] shapes = {c, r};

        for (Shape s: shapes) {
            s.draw();
        }
    }
}
