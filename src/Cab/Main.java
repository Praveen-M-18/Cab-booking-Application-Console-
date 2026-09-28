package Cab;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Cab> totcab=new ArrayList<>();
		BookingSystem bs=new BookingSystem();
		Scanner sc=new Scanner(System.in);
		
		Cab cab1=new Cab('A');
		Cab cab2=new Cab('B');
		Cab cab3=new Cab('C');
		totcab.add(cab1);
		totcab.add(cab2);
		totcab.add(cab3);
		
		
		while(true) {
		System.out.println("**CAB APPLICATION");
		System.out.println("Enter your option");
		System.out.println("1. Display cabs");
		System.out.println("2. Add Cab");
		System.out.println("2. Book Cabs");
		
		int option=sc.nextInt();
		
		switch(option) {
		case 1->{
			for(Cab a: totcab) {
				System.out.println("Id "+a.getId()+" cur loc:"+a.getLocation()+" availnext:"+a.getAvailablenext()+" ");
				System.out.println("Earned "+a.getEarnings());
			}
		}
		case 2->{
			System.out.println("Enter Cab details");
			System.out.println("Enter cab id:");
			char cabid=sc.next().charAt(0);
			Cab c=new Cab(cabid);
			totcab.add(c);
		}
			case 3-> {
				System.out.println("Enter your pickup point: ");
				char pickuppoint=sc.next().charAt(0);
				System.out.println("Enter your drop point: ");
				char droppoint=sc.next().charAt(0);
				System.out.println("Enter your pickup time: ");
				int picktime=sc.nextInt();
				System.out.println("Proccessing");
				Customer c=new Customer(pickuppoint, droppoint, picktime);
				bs.isAvailable(c, totcab);
				System.out.println("Booked");
			}
			case 4->System.exit(0);
		}
		}
		}
	}


