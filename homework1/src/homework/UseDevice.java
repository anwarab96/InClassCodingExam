package homework;

public class UseDevice {

	public static void main(String[] args) {
		Phone ph = new Phone();
		Computer com = new Computer();
		// call the Phone class methods name by Phone class name.
		
		ph.price();
		ph.name();
		ph.memory();
		ph.ch();
		ph.getcolor();
		
		// call the Computer class methods name by Computer class name.	
		
		com.combgColor();
		com.comprice();
		com.comtype1();
		com.comtype2();
		com.comWarrenty();
	}

}
