package me.Megabytte.Game.Board;

import me.Megabytte.Game.GameObject;

public class Board extends GameObject
{
	
	
	
	public Board(int x, int y) 
	{
		TLX = x;
		TLY = y;
		TRX = x + 240;
		TRY = y;
		BLX = x;
		BLY = y + 320;
		BRX = x + 240;
		BRY	= y + 320;
		
		
		
	}
	
	public void draw()
	{
		
	}
	
	public void update()
	{
		
	}
	
	
	
	
	
	
	
}
