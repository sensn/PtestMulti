package com.company;

import processing.core.PApplet;

class ProjectorSketch extends PApplet {
    public void settings() {
        fullScreen(2);
        // size(displayWidth>>1, displayHeight>>1, JAVA2D);
        smooth(4);

        println("Inner's sketchPath: \t\"" + sketchPath("") + "\"");
        println("Inner's dataPath: \t\"" + dataPath("") + "\"\n");
    }

    public void setup() {
       // removeExitEvent(getSurface());

        frameRate(1);
        // stroke(#FFFF00);
        strokeWeight(5);
    }

    public void draw() {
        // background((color) random(#000000));
        line(width, 0, 0, height);

        saveFrame( dataPath("screen-####.jpg") );
    }

    @ Override
    public void exit() {
    }
}
