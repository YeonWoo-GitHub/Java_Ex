package dependencyEx;

public class dependencyExMain {

    public static void main(String[] args) {

        Pen pen = new Pen();
        Paper paper = new Paper(pen);

        paper.draw();
    }
}
