package me.Megabytte.Game;

import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.glClear;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glOrtho;

import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.openal.AL;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class TetrisGame 
{
	public final int ScreenW = 480, ScreenH = 640;
	public boolean running = true;
	long delta;
	private static long lastFrame;
	
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		TetrisGame game = new TetrisGame();
	}
	
	public TetrisGame() 
	{	
		initOpenGL(ScreenW, ScreenH);
		initGame();
		
		while(running)
		{
			if(Display.isCloseRequested())
			{
				Display.destroy();
				AL.destroy();
				System.exit(0);
			}
			
			delta = (long) getDelta();
			draw();
			input();
			update();
			
			Display.update();
			Display.sync(60);
		}	
		
		Display.destroy();
		AL.destroy();
		System.exit(0);
		
	}	
	
	public void input()
	{
		if(Keyboard.isKeyDown(Keyboard.KEY_ESCAPE))
		{
			running = false;
		}
	}
	
	public void update()
	{
		
		
		
	}
	
	public void draw()
	{
		glClear(GL_COLOR_BUFFER_BIT);
		
		
		
	}
	
	public void initOpenGL(int screenw, int screenh)
	{
		try
		{
			Display.setDisplayMode(new DisplayMode(screenw, screenh));
			Display.setTitle("Tetris Game");
			Display.setVSyncEnabled(true);
			Display.setResizable(false);
			Display.create();
			
			
		} catch (LWJGLException e) { e.printStackTrace();}
				
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, screenw, screenh, 0, 1, -1);
		glMatrixMode(GL_MODELVIEW);
	}
	
	public void initGame()
	{
		lastFrame = getTime();
	}
	
	private static long getTime() 
	{
		return (Sys.getTime() * 1000) / Sys.getTimerResolution();
	}
	
	private static double getDelta() 
	{
		long currentTime = getTime();
		double delta = (double) currentTime - (double) lastFrame;
		lastFrame = getTime();
		return delta;
	}
	
	
	
	
	
	
	
	
}
