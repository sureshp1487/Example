package pattern;

public class Find {
	public static void main(String[] args) {
		float a=12.36f;
		float b=23.36f;
		String num=Float.toString(a); //using toString.String.valueOf float convert to String
		String num1=String.valueOf(b);
		
		String dotV=num.substring(3,num.length());
		String dotV1=num1.substring(3,num1.length());
		float point1=Float.parseFloat(dotV);
		float point2=Float.parseFloat(dotV1);
		
		if(point1==point2) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		System.out.print(num);
		
	}

}
