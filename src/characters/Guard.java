package characters;

import game.floor.Location;
import items.Direction;
import items.Direction.Dir;
import items.Distance;
import items.GameObject;

public class Guard extends Character {

	public int characterID;
	public String characterName;
	Direction dir;


	Location characterLocation;


	public Guard(int characterID, String characterName) {
			super(characterID, characterName);
			this.characterName = characterName;
			this.characterID = characterID;
	}

	public Location getCharacterLocation() {
		return super.getCharacterLocation();
	}

	public void setCharacterLocation(int x, int y) {
		super.setCharacterLocation(x,y);
	}

	@Override
	public void move(Direction dir, Distance d) {
		this.dir = dir;
        // moves the gaurd one tile forward based on its direction
			if (dir.equals(Dir.EAST)) {

				this.setCharacterLocation(this.getCharacterLocation().row()+1,this.getCharacterLocation().column());

			} else if (dir.equals(Dir.WEST)) {

				this.setCharacterLocation(this.getCharacterLocation().row()-1,this.getCharacterLocation().column());

			} else if (dir.equals(Dir.NORTH)) {

				this.setCharacterLocation(this.getCharacterLocation().row(),this.getCharacterLocation().column()+1);

			} else if (dir.equals(Dir.SOUTH)) {

				this.setCharacterLocation(this.getCharacterLocation().row(),this.getCharacterLocation().column()-1);

			}



	}

	private boolean moveIsValid(Location p, GameObject c) {


		return false;

		//!board.squareAt(newPosition).isOccupied()
	}

	@Override
	public void characterInteraction(Character c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void objectInteraction(GameObject c) {
		// TODO Auto-generated method stub

	}


}