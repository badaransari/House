package com.mycompany.house_assignment;


import java.awt.PageAttributes;

import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.TriangleMesh;

import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
     
        Label label = new Label("Hello, JavaFX ");
        Rectangle sky = new Rectangle (0, 0, 800, 350); 
        //xfirstpointstart
        //yfirstpointstart
        //width
        //height
        
        sky.setFill(Color.DEEPSKYBLUE);
        
                Rectangle ground = new Rectangle (0, 350, 800, 350); 
                        ground.setFill(Color.GREEN);


        
        Rectangle brown = new Rectangle (120, 150, 500, 450); 
                        brown.setFill(Color.BROWN);
                        
        Polygon roof = new Polygon(90.0,150.0,650.0,150.0,370.0,0);
              roof.setFill(Color.WHITE);
              
         Rectangle underRoof = new Rectangle (120, 150, 500, 30); 
                        underRoof.setFill(Color.WHITE);
                        underRoof.setStroke(Color.BLACK);
                        
               // Rectangle in between the pillars
       
         Rectangle rec = new Rectangle (335, 200, 72, 50); 
                        rec.setFill(Color.GRAY);
                        rec.setStroke(Color.BLACK);
                        
        //left door
        
          Rectangle leftDoor = new Rectangle (215, 312, 64, 200); 
                        leftDoor.setFill(Color.WHITE);
                        leftDoor.setStroke(Color.BLACK);
                        
         //rightdoor
          Rectangle rightDoor = new Rectangle (463, 312, 64, 200); 
                        rightDoor.setFill(Color.WHITE);
                        rightDoor.setStroke(Color.BLACK);
                        
                        
            //maindoor
             //rightdoor
          Rectangle mainDoor = new Rectangle (341, 280, 64, 250); 
                        mainDoor.setFill(Color.WHITE);
                        mainDoor.setStroke(Color.BLACK);
                        
                        
                        
        Rectangle lastRec = new Rectangle (120,500,500,10); 
                        lastRec.setFill(Color.LIGHTGREY);
                        lastRec.setStroke(Color.BLACK);
        
                        
      //opendoor
      
      
        Group gp = new Group(label, sky, ground, brown,roof, underRoof,rec,leftDoor,rightDoor,mainDoor,lastRec);
        
        for (int i=0; i<4; i++)
        {
            Rectangle pillar = new Rectangle(165 + (i * 124),180,40,320);
            pillar.setFill(Color.WHITE);
            pillar.setStroke(Color.BLACK);
            gp.getChildren().add(pillar);
        }
        
        //creating an array for stairs
        int size = 11;
       
        Rectangle stairs[] = new Rectangle[size];
        for (int i=0; i<size;i++)
        {
            stairs[i] = new Rectangle(240-(i%11)*18,500+(i%11)*10,250+(i%11)*35,10);
            stairs[i].setFill(Color.LIGHTGRAY);
            stairs[i].setStroke(Color.BLACK);
            gp.getChildren().add(stairs[i]);
        }
        //for windows
        
       int num_of_windows = 10;
       Rectangle Windows1[] = new Rectangle[num_of_windows];
       for (int i=0; i<num_of_windows; i++){
           Windows1[i] = new Rectangle(228 +(i%2)*23,418-(i%5)*22,10,17);
           gp.getChildren().add(Windows1[i]);
       }
       
       Rectangle Windows2[] = new Rectangle[num_of_windows];
       for (int i=0; i<num_of_windows; i++){
           Windows2[i] = new Rectangle(356 +(i%2)*23,418-(i%5)*22,10,17);
           gp.getChildren().add(Windows2[i]);
       }
       
       Rectangle Windows3[] = new Rectangle[num_of_windows];
       for (int i=0; i<num_of_windows; i++){
           Windows3[i] = new Rectangle(478 +(i%2)*23,418-(i%5)*22,10,17);
           gp.getChildren().add(Windows3[i]);
       }
       int num_of_circles = 2;
       
       Circle circlesOnPillar1[] = new Circle [num_of_circles];
       for (int i=0; i<num_of_circles; i++){
           circlesOnPillar1[i]= new Circle(160 +(i%2)*46, 189,14);
            circlesOnPillar1[i].setFill(Color.WHITE);
            circlesOnPillar1[i].setStroke(Color.BLACK);
           gp.getChildren().add(circlesOnPillar1[i]);
           
           
       }
       
        Circle circlesOnPillar2[] = new Circle [num_of_circles];
       for (int i=0; i<num_of_circles; i++){
           circlesOnPillar2[i]= new Circle(285 +(i%2)*46, 189,14);
            circlesOnPillar2[i].setFill(Color.WHITE);
            circlesOnPillar2[i].setStroke(Color.BLACK);
           gp.getChildren().add(circlesOnPillar2[i]);
           
           
       }
       
        Circle circlesOnPillar3[] = new Circle [num_of_circles];
       for (int i=0; i<num_of_circles; i++){
           circlesOnPillar3[i]= new Circle(415 +(i%2)*46, 189,14);
            circlesOnPillar3[i].setFill(Color.WHITE);
            circlesOnPillar3[i].setStroke(Color.BLACK);
           gp.getChildren().add(circlesOnPillar3[i]);
           
           
       }
       
        Circle circlesOnPillar4[] = new Circle [num_of_circles];
       for (int i=0; i<num_of_circles; i++){
           circlesOnPillar4[i]= new Circle(538 +(i%2)*46, 189,14);
            circlesOnPillar4[i].setFill(Color.WHITE);
            circlesOnPillar4[i].setStroke(Color.BLACK);
           gp.getChildren().add(circlesOnPillar4[i]);
           
           
       }
       
       
      
       for (int i=0; i<4; i++)
        {
            Rectangle slacks = new Rectangle(155 + (i * 124),480,60,20);
            slacks.setFill(Color.WHITE);
            slacks.setStroke(Color.BLACK);
            gp.getChildren().add(slacks);
        }
       int counter=0;
       
      if (counter == 3)
      
        {
            
            Rectangle openDoor = new Rectangle(478,418,20,20);
            openDoor.setFill(Color.BLACK);
            gp.getChildren().add(openDoor);
            
        }
      
       
           
       
        
        
        Scene scene = new Scene(gp, 740, 680);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}