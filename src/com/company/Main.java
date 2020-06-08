package com.company;

import processing.core.PApplet;   //Download processing add

public class Main extends PApplet{

    int angle = 0;
    private PApplet sketch;


    @Override
    public void settings() {
      //  size(500, 500);
       // size(640, 360);
        //size(displayWidth, displayHeight);
        fullScreen(0);
    }
    public void setup() {
        background(102);
        noStroke();
        fill(102);
    }

    public void draw(){
        //   background(64);
        //ellipse(mouseX, mouseY, 20, 20);

        // Draw only when mouse is pressed
        if (mousePressed == true) {
            angle += 5;
            float val = (float) (cos(radians(angle)) * 12.0);
            for (int a = 0; a < 360; a += 75) {
                float xoff = cos(radians(a)) * val;
                float yoff = sin(radians(a)) * val;
                fill(0);
                ellipse(mouseX + xoff, mouseY + yoff, val, val);
            }
            fill(255);
            ellipse(mouseX, mouseY, 2, 2);
        }

    }

    public void mousePressed(){
        background(64);
    }

    public static void main(String[] args) {
	// write your code here
        //String[] appletArgs = new String[] { "Main" };
        String[] processingArgs = {"Main","199","299","599"};
        Main mySketch = new Main();


        PApplet.runSketch(processingArgs, mySketch);
    }




}
