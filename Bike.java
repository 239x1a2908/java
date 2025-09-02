package day1;

public class Bike {
	String Colour="Black";
	String Brand="GT650";
	double Price=4000;
	double Milage=300;
	int NoOfGears=4;
	public static void main(String[] args) {
		Bike b1=new Bike();
		System.out.println("The Colour :"+b1.Colour);
		System.out.println("The Brand :"+b1.Brand);
		System.out.println("The price :"+b1.Price);
		System.out.println("The Milage:"+b1.Milage);
		System.out.println("The NoOFGears :"+b1.NoOfGears);
	}
}