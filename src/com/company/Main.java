package com.company;

import processing.core.PApplet;   //Download processing add

public class Main extends PApplet{
    public void settings() {
        size(500, 500);
    }

    public void draw(){
        background(64);
        ellipse(mouseX, mouseY, 20, 20);
    }

    public static void main(String[] args) {
	// write your code here
        //String[] appletArgs = new String[] { "Main" };
        String[] processingArgs = {"Main"};
        Main mySketch = new Main();
        PApplet.runSketch(processingArgs, mySketch);
    }




}
