package me.Megabytte.Game.Display;

import static org.lwjgl.opengl.GL11.*;
import me.Megabytte.Game.GameObject;

public class NextBlock extends GameObject
{
	public NextBlock(int x, int y)
	{
		TLX = x; TLY = y;
		TRX = x + 100; TRY = y;
		BLX = x; BLY = y + 100;
		BRX = x +100; BRY = y + 100;
	}
	
	public void update()
	{
		
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
	
}
