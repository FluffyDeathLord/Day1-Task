
public class WashingMachine extends ElectronicDevice{
	private int speed;
	public WashingMachine(String brandname,int power, int validity, int price, int speed){
		super(brandname,power, validity, price);
		this.setSpeed(speed);
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
