
/**
 * This represents the subclass BrownBear
 * @author LeAia Reed
 *
 */
public class BrownBear extends Animal {
	public static void main(String[] args) {
		String[] subSpecies = {"Alaskan", "Asiatic", "European", "Grizzly", "Kodiak", "Siberian"};
	}
	private String subSpecies;
	
	public BrownBear() {
		super();
		simID = 0;
		setLocation(0,0);
		full = false;
		rested = true;
		subSpecies = "Alaskan";
		InvalidSubspeciesException isse = new InvalidSubspeciesException("This is the wrong species.");
		try {
			if(!subSpecies)
				throw isse;
			else
				return subSpecies;
		}//end try block
	}//end empty constructor
	
	public BrownBear(int simID, Location location, String subSpecies) {
		super(simID, location);
		setSubSpecies(subSpecies);
		full = false;
		rested = true;
	}//end preferred constructor
/**
 * Getter and Setter for subSpecies.
 * 
 */
	public String getSubSpecies() {
		return subSpecies;
	}

	public void setSubSpecies(String subSpecies) {
		this.subSpecies = subSpecies;
	}

	@Override
	public String toString() {
		return "BrownBear [subSpecies=" + subSpecies + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}//end toString

	
	

}//end main
