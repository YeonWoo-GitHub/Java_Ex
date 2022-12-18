package dependencyEx;

public class Paper {

    private final Pen pen;

    public Paper(Pen pen) {
        this.pen = pen;
    }

    public void draw() {
        pen.draw();
    }
}
