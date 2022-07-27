import processing.core.PApplet;

public class TryProcessing extends PApplet{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    Circle c1, c2, c3, c4;

    public static void main(String[] args) {
        PApplet.main("TryProcessing" , args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        c1 = new Circle(0, HEIGHT / 5, 1);
        c2 = new Circle(0,  HEIGHT * 2 / 5, 2);
        c3 = new Circle(0,  HEIGHT * 3 / 5, 3);
        c4 = new Circle(0,  HEIGHT * 4 / 5, 4);
    }

    @Override
    public void draw() {
        drawCircle(c1);
        drawCircle(c2);
        drawCircle(c3);
        drawCircle(c4);
    }
    void drawCircle(Circle circle) {
        ellipse(circle.positionX, circle.positionY, circle.DIAMETER, circle.DIAMETER);
        circle.positionX += circle.speed;
    }

    private void printWhite() {
        background(255);
    }
}

class Circle extends PApplet{
    int positionX;
    int positionY;
    int speed;

    public static final int DIAMETER = 10;

    public Circle(int positionX, int positionY, int speed) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.speed = speed;
    }
}
