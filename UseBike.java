package pattern;

public class UseBike {
	public static void main(String[] args) {
		
		Bike b1=new Bike();
		b1.brand="pulsar";
		b1.price=180000;
		b1.color="blue";
		
		Bike b2=new Bike();
		b2.brand="duke";
		b2.price=218000;
		b2.color="white";
		
		Bike b3=new Bike();
		b3.brand="yamaha";
		b3.price=140000;
		b3.color="blue";
		
		if(b1.price>b2.price && b1.price>b3.price && b1.color.equalsIgnoreCase("white")) {
			System.out.println(b1.brand);
		} else if(b2.price>b1.price && b2.price>b3.price && b2.color.equalsIgnoreCase("white")) {
			System.out.println(b2.brand);
		}else if(b3.price>b2.price && b3.price>b1.price && b1.color.equalsIgnoreCase("white")) {
			System.out.println(b3.brand);
		}else {
			System.out.println("Nothing possible");
		}
		
	}

}
