package com.example.keyzoomv2;

import java.util.*;
import android.graphics.RectF;

public class Keys {
	
	private ArrayList<Key> keys;
	
	public Keys(int screenWidth, int screenHeight)
	{
		keys = new ArrayList<Key>();
		String[] letters = {"0","1", "2", "3", "4", "5", "6", "7", "8", "9", "Q", "W", "E", "R", "T", "Y", "U", "I"
				, "O", "P", "A", "S", "D", "F", "G", "H", "J", "K", "L", "del", "Z", "X", "C", "V", "B", "N", "M", "."
				, ",", "?", "up", "space", "enter", "'"};
		int[] startX = new int[10];
		int[] endX = new int[10];
		int[] startY = new int[5];
		int[] endY = new int[5];
		
		int cellWidthDistance = screenWidth / 10;
		int cellHeightDistance = screenHeight / 5;
		double percentToStartX = .05;
		double percentToEndX = .95;
		double percentToStartY = .1;
		double percentToEndY = .90;
		int extraStartX = (int) (cellWidthDistance * percentToStartX);
		int extraEndX = (int) (cellWidthDistance * percentToEndX);
		int extraStartY = (int) (cellHeightDistance * percentToStartY);
		int extraEndY = (int) (cellHeightDistance * percentToEndY);
		
		for(int i = 0; i < startX.length; i++)
		{
			startX[i] = i*cellWidthDistance + extraStartX;
		}
		
		for(int i = 0; i < endX.length; i++)
		{
			endX[i] = i*cellWidthDistance + extraEndX;
		}
		
		for(int i = 0; i < startY.length; i++)
		{
			startY[i] = i*cellHeightDistance + extraStartY;
		}
		
		for(int i = 0; i < endY.length; i++)
		{
			endY[i] = i*cellHeightDistance + extraEndY;
		}
		
		int i = 0;
		for(int r = 0; r < 4; r++)
		{
			for(int c = 0; c < 10; c++)
			{
				keys.add(new Key(letters[i], new RectF(startX[c], startY[r], endX[c], endY[r])));
				i++;
			}
		}
											//Startx		StartY		EndX		EndY
		keys.add (new Key("enter", 	new RectF(startX[7],	startY[4],	endX[8],	endY[4])));
		keys.add (new Key("'", 		new RectF(startX[9],	startY[4],	endX[9],	endY[4])));
		keys.add (new Key("space", 	new RectF(startX[1],	startY[4],	endX[6],	endY[4])));
		keys.add (new Key("up", 	new RectF(startX[0],	startY[4],	endX[0],	endY[4])));
//		keys.add (new Key("0", new RectF(23, 		38, 		105, 		120)));
//		keys.add (new Key("1", new RectF(110, 		38, 		190, 		120)));
//		keys.add (new Key("2", new RectF(210, 		38, 		290, 		120)));
//		keys.add (new Key("3", new RectF(310, 		38, 		390, 		120)));
//		keys.add (new Key("4", new RectF(410, 		38, 		490, 		120)));
//		keys.add (new Key("5", new RectF(510, 		38, 		590, 		120)));
//		keys.add (new Key("6", new RectF(610, 		38, 		690, 		120)));
//		keys.add (new Key("7", new RectF(710, 		38, 		790, 		120)));
//		keys.add (new Key("8", new RectF(810, 		38, 		890, 		120)));
//		keys.add (new Key("9", new RectF(910, 		38, 		990, 		120)));
//		keys.add (new Key("Q", new RectF(23, 		140, 		105, 		220)));
//		keys.add (new Key("W", new RectF(110, 		140, 		190, 		220)));
//		keys.add (new Key("E", new RectF(210, 		140, 		290, 		220)));
//		keys.add (new Key("R", new RectF(310, 		140, 		390, 		220)));
//		keys.add (new Key("T", new RectF(410, 		140, 		490, 		220)));
//		keys.add (new Key("Y", new RectF(510, 		140, 		590, 		220)));
//		keys.add (new Key("U", new RectF(610, 		140, 		690, 		220)));
//		keys.add (new Key("I", new RectF(710, 		140, 		790, 		220)));
//		keys.add (new Key("O", new RectF(810, 		140, 		890, 		220)));
//		keys.add (new Key("P", new RectF(910, 		140, 		990, 		220)));
//		keys.add (new Key("A", new RectF(23, 		250, 		105, 		330)));
//		keys.add (new Key("S", new RectF(110, 		250, 		190, 		330)));
//		keys.add (new Key("D", new RectF(210, 		250, 		290, 		330)));
//		keys.add (new Key("F", new RectF(310, 		250, 		390, 		330)));
//		keys.add (new Key("G", new RectF(410, 		250, 		490, 		330)));
//		keys.add (new Key("H", new RectF(510, 		250, 		590, 		330)));
//		keys.add (new Key("J", new RectF(610, 		250, 		690, 		330)));
//		keys.add (new Key("K", new RectF(710, 		250, 		790, 		330)));
//		keys.add (new Key("L", new RectF(810, 		250, 		890, 		330)));
//		keys.add (new Key("DEL", new RectF(910, 	250, 		990, 		330)));
//		keys.add (new Key("Z", new RectF(23, 		350, 		105, 		440)));
//		keys.add (new Key("X", new RectF(110, 		350, 		190, 		440)));
//		keys.add (new Key("C", new RectF(210, 		350, 		290, 		440)));
//		keys.add (new Key("V", new RectF(310, 		350, 		390, 		440)));
//		keys.add (new Key("B", new RectF(410, 		350, 		490, 		440)));
//		keys.add (new Key("N", new RectF(510, 		350, 		590, 		440)));
//		keys.add (new Key("M", new RectF(610, 		350, 		690, 		440)));
//		keys.add (new Key(".", new RectF(710, 		350, 		790, 		440)));
//		keys.add (new Key(",", new RectF(810, 		350, 		890, 		440)));
//		keys.add (new Key("?", new RectF(910, 		350, 		990, 		440)));
//		keys.add (new Key("del", new RectF(910, 	250, 		990, 		330)));

	}

	public ArrayList<Key> getKeys()
    {
    	return keys;
    }
    
    public String getKeyPressed(float x, float y)
    {
    	Key k;
    	for(int i = 0; i < keys.size(); i++)
    	{
    		k = keys.get(i);
    		if(k.getsRect().contains(x,y)){
    			return k.getsLetter();
    		}
    	}
    	
		return null;
    }

}
