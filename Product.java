package day1;

public class Product {
	String Name;
	int Price;
	double GST;
	double Discount;
	int Quantity;
	private int Quaninty;
	public static void main(String[] args) {
		Product p1=new Product();
		p1.Name="Car";
		p1.Price=20000;
		p1.GST=5;
		p1.Discount=40;
		p1.Quaninty=1;
		System.out.println("Product Name :"+p1.Name);
		System.out.println("Product Price:"+p1.Price);
		System.out.println("Product GST:"+p1.GST);
		System.out.println("Product Discount:"+p1.Discount);
		System.out.println("Product Qunaninty:"+p1.Quantity);
		Product p2=new Product();
		p2.Name="bag";
		p2.Price=40000;
		p2.GST=2;
		p2.Discount=30;
		p2.Quaninty=2;
		System.out.println("Product Name :"+p2.Name);
		System.out.println("Product Price:"+p2.Price);
		System.out.println("Product GST:"+p2.GST);
		System.out.println("Product Discount:"+p2.Discount);
		System.out.println("Product Qunaninty:"+p2.Quantity);
	}
}