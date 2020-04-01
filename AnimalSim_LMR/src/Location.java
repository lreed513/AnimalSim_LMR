/**
 * This class represents a Location for
 * an animal 
 * @author LeAia Reed
 * @version 1.13
 * Project 3
 * SP2020
 */
import java.util.*;
import java.util.Arrays;

public class Location {
	private int xCoord;
	private int yCoord;
/**
 * This method sets x and y to 0.
 */
	public Location() {
		xCoord = 0;
		yCoord = 0;
		InvalidCoordinateException ice = new InvalidCoordinateException("Coordinates cannot be negative.");
		try {
			if(xCoord<0)
				throw ice;
			else
				return xCoord;
			if(yCoord<0)
				throw ice;
			else
				return yCoord;
		}//end try block
		catch (InvalidCoordinateException e){
			System.out.println(e.getMessage());
		}//end catch block
		
	}//end empty constructor
/**
 * This method initializes x and y coordinates.
 * @param xCoord
 * @param yCoord
 */
	public Location(int xCoord, int yCoord) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}//end preferred constructor
	/** 
	 * This method should update x and y coordinates
	 * @param xCoord
	 * @param yCoord
	 */
	public update(int xCoord, int yCoord) {
		location.setBounds(xCoord, yCoord);
	}
	/**
	 * This method should return an array of x and y Coordinates.
	 * @return
	 */
	public int[] getCoordinates() {
		int[] getCoordinates = {0,0};
		for(int xCoord=0; xCoord<0; xCoord++)
			for(int yCoord=0; yCoord<0; yCoord++)
				positions[getCoordinates] = new Coordinates(xCoord, yCoord);
		return getCoordinates++;
		
	}
/**
 * Getters and Setters for instance variables
 *
 */
	public int getxCoord() {
		return xCoord;
	}//end get x
	public void setxCoord(int xCoord) {
		if(xCoord<0)
			this.xCoord = 0;
		else
			this.xCoord = xCoord;
		
	}//end set x
	public int getyCoord() {
		return yCoord;
	}//end get y
	public void setyCoord(int yCoord) {
		if(yCoord<0)
			this.yCoord = 0;
		else
			this.yCoord = yCoord;
	}//end set y
	@Override
	public String toString() {
		return "Location [xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
	}//end toString
	



}//end main
