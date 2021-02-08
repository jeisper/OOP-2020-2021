// package ie.tudublin;

// import processing.core.PApplet;

// public class BugZap extends PApplet
// {
//     public void settings()
//     {
//         size(500, 500);
//     }

//     int i;
//     String s;
//     boolean b;
//     float playerX = width / 2;
//     float playerY = height;
//     float playerWidth = 20;
//     float bugX = width*4;
//     float bugY = random(height);
//     float bugWidth = 20;

//     void drawPlayer(float x, float y, float w)
//     {
//         fill(255, 0, 0);
//         square(x, y, w);
//         line(x, y, x*50, y);
//         fill(255, 0, 0);
        
//     }

//     void drawBug(float x, float y, float w)
//     {
//         stroke(255, 0, 0);
//         square(x, y, w);
//     }

//     public void draw()
//     {
//         background(0);

//         noStroke();

//         drawPlayer(playerX, playerY, playerWidth);

//         drawBug(bugX, bugY, bugWidth);

//         if((frameCount % 60) == 0)
//         {
//             bugX--;
//         }
        
//     }


//     public void keyPressed()
// 	{
// 		if (keyCode == UP)
// 		{
//             System.out.println("MOVING TO THE TOP");
//             playerY --;
//             playerY --;
//             playerY --;
// 		}
// 		if (keyCode == DOWN)
// 		{
//             System.out.println("MOVING TO THE BOTTOM");
//             playerY ++;
//             playerY ++;
//             playerY ++;
// 		}
// 		if (key == ' ')
// 		{
//             System.out.println("SPACE key pressed");
//             line(playerX, playerY, playerX*50, playerY);
// 		}
// 	}
// }

package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet{

    float playerX;
    float playerY;
    float playerWidth;
    float playerSpeed;
    
	public void settings()
	{
		// If you want to use the width and 
		// height variables, they have to be after settings 
		// is called
		size(500, 500);
	}

	
	public void setup() {
         playerX = width/2;
         playerY = height - 50;
         playerWidth = 50;
         playerSpeed = 3;
	}

	// These are fields in the class now and can be used in 
	// any of the methods in the HelloProcessing2 class 

	float x = 300;
	int i;
	String s;
    boolean b;

	
    public void draw()
    {	
        background(0);
        setup(); 
        drawPlayer(playerX, playerY, playerWidth);
    }

    public void drawPlayer(float x, float y, float w){
        float h = w /2;
   
        line(x, y + h, x + w, y + h);
        line(x, y + h, x, y + h * 0.5f);
        line(x + w, y + h, x + w, y + h * 0.5f);
        line(x, y + h * 0.5f, x + w * 0.2f, y + h * 0.3f);
        line(x + w, y + h * 0.5f, y + w * 0.8f, y + h * 0.3f);
        line(x + w * 0.2f, y + h * 0.3f, x + w * 0.8f, y + h * 0.3f);
        line(x + w * 0.5f, y, x + w * 0.5f, y + h * 0.3f); 
        stroke(255);
    }

    public void keyPressed()
	{
		if (keyCode == LEFT)
		{
            playerY --;
            playerY --;
            playerY --;
		}
		if (keyCode == RIGHT)
		{
            playerY ++;
		}
		if (key == ' ')
		{
			System.out.println("SPACE key pressed");
		}
	}	
}
