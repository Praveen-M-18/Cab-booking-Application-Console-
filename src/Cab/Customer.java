package Cab;

public class Customer {
	private int id=0;
	private char pickUpPoint;
	private char dropPoint;
	private int pickUpTime;
	private int dropTime;
	
	public Customer(char pickUpPoint, char dropPoint, int pickUpTime) {
		this.id+=1;
		this.pickUpPoint = pickUpPoint;
		this.dropPoint = dropPoint;
		this.pickUpTime = pickUpTime;
		this.dropTime = pickUpTime+Math.abs(pickUpPoint-dropPoint);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getPickUpPoint() {
		return pickUpPoint;
	}
	public void setPickUpPoint(char pickUpPoint) {
		this.pickUpPoint = pickUpPoint;
	}
	public char getDropPoint() {
		return dropPoint;
	}
	public void setDropPoint(char dropPoint) {
		this.dropPoint = dropPoint;
	}
	public int getPickUpTime() {
		return pickUpTime;
	}
	public void setPickUpTime(int pickUpTime) {
		this.pickUpTime = pickUpTime;
	}
	public int getDropTime() {
		return dropTime;
	}
	public void setDropTime(int dropTime) {
		this.dropTime = dropTime;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", pickUpPoint=" + pickUpPoint + ", dropPoint=" + dropPoint + ", pickUpTime="
				+ pickUpTime + ", dropTime=" + dropTime + "]";
	}
	
	

}
