 //declare bacteria variables here   
 int bacX, bacY, bacColor;
 void setup()   
 {    
 	background(255);
 	size(500,500); 
 	//initialize bacteria variables here   
	bacX = 250;
	bacY = 250;
	Bacteria bob = new Bacteria();
 }   
 void draw()   
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
 	void move()
 	{

 	}
 	void show()
 	{

 	}
 	
 }    
