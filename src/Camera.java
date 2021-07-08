
public class Camera{
	
	private String brandname;
	private int price;
	private int validity;
    public Camera(String  brandname,int price, int validity){
    	super();
    	this.brandname=brandname;
    	this.price=price;
    	this.validity=validity;
    	
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
	public int getValidity() {
		return validity;
	}
	public void setValidity(int validity) {
		this.validity = validity;
	}
}
