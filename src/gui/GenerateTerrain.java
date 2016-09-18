package gui;

import java.awt.Color;
import java.util.Random;

public class GenerateTerrain {

    Random r;
    static double roughness = 0;
    static int mapSize = 100;
	static double Size = 10;
//	static Color G = new Color(155, 155, 155);
	static Color G = new Color(120, 100, 80);

    public GenerateTerrain() {
	    	r = new Random();
	    	double[] values1 = new double[mapSize];	        
	        double[] values2 = new double[values1.length];	    	
	
	        for (int y = 0; y < values1.length/2; y+=2) {
	        	
	            for(int i = 0; i < values1.length; i++)
	        	{ 
	            	values1[i] = values2[i];
	                values2[i] = r.nextDouble()*roughness;            
	            }            
	            
	            if(y != 0)
	            {
		            for (int x = 0; x < values1.length/2; x++) {	
						Screen.DPolygons.add(new ThreeDPolygon(new double[]{(Size * x), (Size * x), Size + (Size * x)}, new double[]{(Size * y), Size + (Size * y), Size + (Size * y)}, new double[]{values1[x], values2[x], values2[x+1]}, G, false));	            	
						Screen.DPolygons.add(new ThreeDPolygon(new double[]{(Size * x), Size + (Size * x), Size + (Size * x)}, new double[]{(Size * y), Size + (Size * y), (Size * y)}, new double[]{values1[x], values2[x+1], values1[x+1]}, G, false));
		            }
	            }
	
	        	for(int i = 0; i < values1.length; i++)
	        	{
	            	values1[i] = values2[i];
	                values2[i] = r.nextDouble()*roughness;
	            }
	
	            if(y != 0)
	            {
		            for (int x = 0; x < values1.length/2; x++) {
						Screen.DPolygons.add(new ThreeDPolygon(new double[]{(Size * x), (Size * x), Size + (Size * x)}, new double[]{(Size * (y+1)), Size + (Size * (y+1)), Size + (Size * (y+1))}, new double[]{values1[x], values2[x],  values2[x+1]}, G, false));
		            	Screen.DPolygons.add(new ThreeDPolygon(new double[]{(Size * x), Size + (Size * x), Size + (Size * x)}, new double[]{(Size * (y+1)), Size + (Size * (y+1)), (Size * (y+1))}, new double[]{values1[x], values2[x+1],  values1[x+1]}, G, false));
		            }            
	            }
	        }   
    }
}