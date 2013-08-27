package me.Megabytte.Game.Board;

import static org.lwjgl.opengl.GL11.*;
import me.Megabytte.Game.GameObject;

public class Board extends GameObject
{
	
	public Board(int x, int y) 
	{
		TLX = x;
		TLY = y;
		TRX = x + 360;
		TRY = y;
		BLX = x;
		BLY = y + 480; 
		BRX = x + 360;
		BRY	= y + 480; 
		
		
		
	}
	
	public void draw()
	{
		glLoadIdentity();
		glEnable(GL_BLEND);
    	glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
		
		glBegin(GL_QUADS);	
			glVertex2i(TLX, TLY);			
			glVertex2i(TRX, TRY);			
			glVertex2i(BRX, BRY);
			glVertex2i(BLX, BLY);
		glEnd();
		
		glDisable(GL_BLEND);
		glLoadIdentity();
	}
	
	public void update()
	{
		
	}
	
	
	
	
	
	
	
}
