package modele;

public class nombreB {
	private double number  ;
	public nombreB() {
		setNumber(0);
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	public static double  Con (String n ) {
		return( Math.random() * Double.parseDouble( n)) ;
	}

}
