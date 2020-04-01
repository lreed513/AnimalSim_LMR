
/**
 * This class should test all objects
 * @author LeAia Reed
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("***********************************************************");
		System.out.println("                  Location Tests                           ");
		Location l = new Location();
		System.out.println(l.getCoordinates());
		System.out.println("***********************************************************");
		
		System.out.println("***********************************************************");
		System.out.println("                  Animal Tests                           ");
		Animal a = new Animal();
		System.out.println("***********************************************************");
		
		System.out.println("***********************************************************");
		System.out.println("                  Goldfinch Tests                           ");
		Goldfinch gf = new Goldfinch();
		System.out.println(gf.super(simID, location, wingSpan));
		System.out.println("***********************************************************");
		
		System.out.println("***********************************************************");
		System.out.println("                  BrownBear Tests                           ");
		BrownBear bb = new BrownBear();
		System.out.println(bb.super(simID, location, subSpecies));
		System.out.println("***********************************************************");
		
		
		
		

	}//end main

}//end class
