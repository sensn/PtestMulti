package com.company;

import controlP5.ControlP5;
import processing.core.PApplet;   //Download processing add
import processing.core.PSurface;

public class Main extends PApplet{

    int angle = 0;
    private PApplet sketch;

    ProjectorSketch projector;
    ControlP5 cp5;
    public float boxValue = 23;

    //Size for main
    int w=1280; //non fullscreen width
    int h=720; //non fullscreen height
    boolean fullscreen=false; //fullscreen

   public void settings() {
        size(300, 300, JAVA2D);
     //   fullScreen(1);
        smooth(4);


        println("Main's  sketchPath: \t\"" + sketchPath("") + "\"");
        println("Main's  dataPath: \t\"" + dataPath("") + "\"\n");


     //  projector = new ProjectorSketch(this);
    }

   public void setup() {
        noLoop();
        frameRate(60);
        stroke(-1);
        strokeWeight((float) 1.5);
       surface.setResizable(true);
       cp5 = new ControlP5(this);
        runSketch( new String[] {
                        "--display=1",
                        "--location=" + (displayWidth>>2) + ',' + (displayHeight>>3),
                        "--sketch-path=" + sketchPath(""),
                        "" }
                , projector = new ProjectorSketch() );
        //projector.getSurface().setVisible(false);   //set window visible
    }

   public void draw() {
        background(0);
        line(0, 0, width, height);
    }

   public void mousePressed() {
        projector.getSurface().setVisible(true);
    }

    static final void removeExitEvent(final PSurface surf) {
        final java.awt.Window win
                = ((processing.awt.PSurfaceAWT.SmoothCanvas) surf.getNative()).getFrame();

        for (final java.awt.event.WindowListener evt : win.getWindowListeners())
            win.removeWindowListener(evt);
    }



    public static void main(String[] args) {
	// write your code here
        //String[] appletArgs = new String[] { "Main" };
        String[] processingArgs = {"Main"};
        Main mySketch = new Main();


        PApplet.runSketch(processingArgs, mySketch);
    }




}
