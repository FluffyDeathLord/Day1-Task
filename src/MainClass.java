
public class MainClass {
	public static void main(String[] args) {
		MainClass obj = new MainClass();
		ElectronicDevice Laptop= new Laptop("Lenovo",800,300,400,100,200, "Blue","Windows");
		ElectronicDevice Mobile= new Mobile("Motorola",799,300,650,930,"Silver", 279,"Android");
		ElectronicDevice WashingMachine= new WashingMachine("Godrej",900,200,290,23);
	    ElectronicDevice AC=new AC("Lloyd",500,300,200,21);
	    ElectronicDevice TV=new TV("Sony",800,300,400,100,"Blue", 200);
		
	    Memory memory = new Memory("A",20,500);
		Bluetooth bluetooth = new Bluetooth("B",25,400);
		Camera camera = new Camera("C",45,200);
		Mobile C= new Mobile("Apple",709,200,350,530,"Green", 279,"Android");
		Mobile B= new Mobile("Apple",709,200,350,530,"Green", 279,"Android");
		Mobile A= new Mobile("Apple",709,200,350,530,"Green", 279,"Android");
		C.setCamera(camera);
		B.setBluetooth(bluetooth);
		A.setMemory(memory);
		obj.displayPower(Laptop);
		obj.displayPower(TV);
		obj.displayPower(Mobile);
		obj.displayPower(AC);
		obj.displayPower(WashingMachine);
	
	
		
	}

	private void displayPower(ElectronicDevice e) {
		
		if(e instanceof Laptop){
			System.out.println("Power");
			System.out.println(e.getPower());
			
		}
		if(e instanceof TV){
			System.out.println("Power");
			System.out.println(e.getPower());
			
		}
		if(e instanceof AC){
			System.out.println("Power");
			System.out.println(e.getPower());
			
		}
		if(e instanceof Mobile){
			System.out.println("Power");
			System.out.println(e.getPower());
		
		}
		if(e instanceof Mobile){
			System.out.println("Power");
			System.out.println(e.getPower());
		
		}
	}

}