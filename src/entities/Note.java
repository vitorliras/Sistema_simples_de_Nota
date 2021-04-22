package entities;

public class Note {
	
	public String Name;
	public double a;
	public double b;
	public double c;
	public double d;
	
	public double measure() {
		return a+b+c+d;
	}
	
	public void noteFinal() {
		if(measure()< 100*0.6) {
			double falt = (100*0.6) - measure();
			System.out.println("FALIED");
			System.out.println("Missing "+falt+" POINTS");
		}else {
			System.out.println("PASS");
		}
		
		
	}
	
	public String toString() {
		return Name+
				" in Final Grade: "+
				measure();
	}
	
	
}
