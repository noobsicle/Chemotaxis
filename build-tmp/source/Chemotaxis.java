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

 public void setup()   
 {    
 	size(500,500);
 	frameRate(20);
 	noStroke();
 	//initialize bacteria variables here   
 }   
 public void draw()   
 {    
 	//move and show the bacteria   
 	background(133,199,255);
 	Bacteria [] bobbies;
 	for (int i = 0; i <= bobbies.length; i ++)
 	{
 		Bacteria bob = new Bacteria();
 		bob.move();
 		bob.show();
 	}
 	
 }  
 class Bacteria    
 {     
 	//lots of java! 
 	int range = 5; 
 	int bacX, bacY, bacColor;
 	Bacteria()
 	{
 		bacX = 250;
		bacY = 250;
 		fill(0,127,118);	
 	}
 	public void move()
 	{
		bacX = bacX + (int)(Math.random() * range + 1) - range/2;
 		bacY = bacY + (int)(Math.random() * range + 1) - range/2;
 	}
 	public void show()
 	{
		ellipse(bacX, bacY, 18,18);
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
