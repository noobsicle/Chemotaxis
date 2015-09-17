import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

 //declare bacteria variables here   
 int bacX, bacY, bacColor;
 public void setup()   
 {    
 	background(255);
 	size(500,500); 
 	//initialize bacteria variables here   
	bacX = 250;
	bacY = 250;
	Bacteria bob = new Bacteria();
 }   
 public void draw()   
 {    
 	//move and show the bacteria   
 }  
 class Bacteria    
 {     
 	//lots of java!  
 	Bacteria()
 	{
 		fill(0,127,118);
 		noStroke();
 		ellipse(bacX, bacY, 18,18);
 	}
 	public void move()
 	{

 	}
 	public void show()
 	{

 	}
 	
 }    
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
