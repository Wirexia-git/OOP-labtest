package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{

	ArrayList<Nematode> nematodes = new ArrayList<Nematode>();

	int variant = 0;

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
		}		
	}

	public void loadNematodes()
	{
		Table table = loadTable("nematode.csv", "header");
		for(TableRow r:table.rows())
		{
			Nematode n = new Nematode(r);
			nematodes.add(n);
		}
	}
	
	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();	
		loadNematodes();		
	}

	public void draw()
	{	
		clear();
		Nematode n = nematodes.get(variant);
		String Name = n.getName(); 

		textAlign(CENTER);
		textSize(60);
		text(Name, 400, 50);

		circle(224, 184, 220);
	}
}
