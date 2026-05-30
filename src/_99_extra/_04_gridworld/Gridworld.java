package _99_extra._04_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {

	public static void main(String[] args) {
		World world = new World();
		Bug bug = new Bug(Color.BLUE);
		Flower flower1 = new Flower(Color.GREEN);
		Location loc1 = new Location(4, 7);
		Location loc2 = new Location(4, 6);
		for(int rows = 0; rows < 10; rows++) {
			for(int columns = 0; columns < 10; columns++) {
				Location loc = new Location(rows, columns);
				world.add(loc, flower1);
			}
		}
		world.show();
	}
	
}
