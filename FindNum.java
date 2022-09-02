package pattern;

public class FindNum {
	public static void main(String[] args) {
		int num=10;
		
		if(num%2==0) {
			if(num%4==0) {
				System.out.println("It is even number and divisible by 4");
			}else {
				System.out.println("It is even but not divisible by 4");
			}
		}
		else {
				if(num%9==0) {
					System.out.println("It is odd and divisible by 9");
				}else {
					System.out.println("It is odd but not divisible by 9");
				}
			}	
	}

}
