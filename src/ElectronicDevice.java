
public class ElectronicDevice {
	String brandname;
	int price;
	int power;
	int validity;
	public ElectronicDevice(){
		}
	public ElectronicDevice(String  brandname,int price, int validity,int power){
		this.brandname=brandname;
		this.power=power;
		this.price=price;
		this.validity=validity;
	}

	
	public int getValidity() {
		return validity;
	}
	public void setValidity(int validity) {
		this.validity = validity;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
}
