package Cab;

import java.util.ArrayList;

public class BookingSystem {
	private int id=0;
	private Customer c;
	private Cab cab;	
	
	
	
	public Cab isAvailable(Customer c,ArrayList<Cab> totcab) {
		int picktime=c.getPickUpTime();
		
		ArrayList<Cab> availabletaxies=new ArrayList<>();
		for(Cab a: totcab) {
			int distance=a.getLocation()-c.getPickUpPoint();
			if((a.getAvailablenext()==0)||(a.getAvailablenext()+distance)<=picktime) {
				availabletaxies.add(a);
			}
		}
		int min=Integer.MAX_VALUE;
		Cab assigned=availabletaxies.get(0);
		ArrayList<Cab> nearby=new ArrayList<>();
		for(Cab a: availabletaxies) {
			int distance=a.getLocation()-c.getPickUpPoint();
			if(distance<min) {
				min=distance;
				assigned=a;
			}
			else if(distance==min) {
				if(a.getEarnings()<assigned.getEarnings()) {
					assigned=a;
				}
			}
		}
		
		assigned.setAvailablenext(c.getDropTime());
		assigned.setLocation(c.getDropPoint());
		int charges=Math.abs(c.getPickUpPoint()-c.getDropPoint())*100;
		assigned.setCharges(charges);
		assigned.setEarnings(assigned.getEarnings()+charges);
		return assigned;
		
	}
	
	
	

}
