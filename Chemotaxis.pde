 Bacteria[] bobbies = new Bacteria[5];
 void setup()   
 {    
 	size(500,500);
 	frameRate(20);
 	noStroke();
 	for (int i = 0; i < bobbies.length; i ++)
 	{
 	 bobbies[i] = new Bacteria();
 		
 	}
 	//initialize bacteria variables here   
 }   
 void draw()   
 {    
 	//move and show the bacteria   
 	background(133,199,255);
 	
 	for (int i = 0; i < bobbies.length; i ++)
 	{
 
 		bobbies[i].move();
 		bobbies[i].show();
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
 	void move()
 	{
		bacX = bacX + (int)(Math.random() * range + 1) - range/2;
 		bacY = bacY + (int)(Math.random() * range + 1) - range/2;
 	}
 	void show()
 	{
		ellipse(bacX, bacY, 18,18);
 	}
 	
 }    
