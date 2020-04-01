
/**
 * This represents the subclass Goldfinch
 * @author LeAia Reed
 *
 */
import java.util.Random;
public class Goldfinch extends Animal {
	private double wingSpan;
	
	public Goldfinch() {
		super();
		simID = 0;
		setLocation(0,0);
		full = false;
		rested = true;
		wingSpan = 9.0;
		InvalidWingspanException iwe = new InvalidWingspanException("Wingspan is either too short or too long.");
				try {
					if(5.0>wingSpan>11.0)
						throw iwe;
					else
						return wingSpan;
				}
	}//end empty constructor
	public Goldfinch(int simID, Location location, double wingSpan) {
		super(simID, location);
		setWingSpan(wingSpan);
		full = false;
		rested = true;
	}//end preferred constructor
/**
 * Getter and Setter for wingSpan
 *
 */
	public double getWingSpan() {
		return wingSpan;
	}
	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}
	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}//end toString
	

}//end main
