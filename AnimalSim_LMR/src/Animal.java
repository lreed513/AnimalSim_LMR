
/**
 * This represents a superclass Animal from
 * which Goldfinch and BrownBear will be derived.
 * @author LeAia Reed
 *
 */
import java.util.Random;
public abstract class Animal {
	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
	
	public Animal() {
		simID = 0;
		setLocation(0,0);
		full = false;
		rested = true;
		InvalidSimIDException ise = new InvalidSimIDException("SimID must be greater than 0.");
		try {
			if(simID<0)
				throw ise;
			else
				return simID;
		}
		catch (InvalidSimIDException i) {
			System.out.println(i.getMessage());
		}
	}
	public Animal(int simID, Location location) {
		setSimID(simID);
		setLocation(0,0);
		setFull(false);
		setRested(true);
	}
	public boolean eat() {
		Random r = new Random();
		int upperbound = 2;
		double double_r = r.nextDouble();
		if(r<=0.5)
			full = false;
		else
			return true;
	}
	public boolean sleep() {
		Random s = new Random();
		int upperbound = 2;
		double double_s = s.nextDouble();
		if(s<=0.5)
			rested = false;
		else
			return true;
	}
/**
 * Getters and Setters for instance variables
 *
 */
	public int getSimID() {
		return simID;
	}
	public void setSimID(int simID) {
		this.simID = simID;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public boolean isFull() {
		return full;
	}
	public void setFull(boolean full) {
		this.full = full;
	}
	public boolean isRested() {
		return rested;
	}
	public void setRested(boolean rested) {
		this.rested = rested;
	}
	@Override
	public String toString() {
		return "Animal [simID=" + simID + ", location=" + location + ", full=" + full + ", rested=" + rested + "]";
	}
	
	
}
