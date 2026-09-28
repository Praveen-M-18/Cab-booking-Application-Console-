package Cab;

import java.util.ArrayList;
import java.util.List;

public class Cab {
	private char id;
	private int availablenext;
	private char location;
	private int charges;
	private int earnings;
	
	
	public Cab(char id){
		this.id=id;
		this.availablenext=0;
		this.location='a';
		this.charges=0;
		this.earnings=0;
	}
	
	

	public char getId() {
		return id;
	}

	public void setId(char id) {
		this.id = id;
	}

	public int getAvailablenext() {
		return availablenext;
	}

	public void setAvailablenext(int availablenext) {
		this.availablenext = availablenext;
	}

	public char getLocation() {
		return location;
	}

	public void setLocation(char location) {
		this.location = location;
	}

	public int getCharges() {
		return charges;
	}

	public void setCharges(int charges) {
		this.charges = charges;
	}

	public int getEarnings() {
		return earnings;
	}

	public void setEarnings(int earnings) {
		this.earnings = earnings;
	}

	@Override
	public String toString() {
		return "Cab [id=" + id + ", availablenext=" + availablenext + ", location=" + location + ", charges=" + charges
				+ ", earnings=" + earnings + "]";
	}
	
	
	
	//methods
	
	

}
