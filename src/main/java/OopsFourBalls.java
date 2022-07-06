import processing.core.PApplet;

import java.util.ArrayList;


public class OopsFourBalls extends PApplet {
    private final int WIDTH = 640;
    private final int HEIGHT = 480;
    private final int noOfBalls = 4;
    private ArrayList<Ball> ballArrayObjects;

    public static void main(String[] args) {
        PApplet.main("OopsFourBalls", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }


    @Override
    public void setup() {
        ballArrayObjects = new ArrayList<>();
        for (int unit = 1; unit <= noOfBalls; unit++)
            ballArrayObjects.add(new Ball(unit));
    }


    //    @Override
    public void draw() {
        for (int index = 0; index < noOfBalls; index++) {
            ballArrayObjects.get(index).drawCircle(this);
        }
    }


}
