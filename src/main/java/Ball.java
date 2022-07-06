import processing.core.PApplet;

class Ball extends PApplet {

    private final int DIAMETER = 10;
    private final int HEIGHT = 480;
    private int xAxis = 0;

    private final int unitPerFrame;

    Ball(int unitPerFrame) {
        this.unitPerFrame = unitPerFrame;
    }


    public void drawCircle(PApplet pApplet) {
        pApplet.ellipse(xAxis, (float) (unitPerFrame * HEIGHT) / 5, DIAMETER, DIAMETER);
        xAxis += unitPerFrame;
    }
}