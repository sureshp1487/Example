package pattern;

public class Wish {
	public static void main(String[] args) {
		int time=22;
		
		if(time>=6 && time<12) {
			System.out.println("good morning");
		}else if(time>=12 && time<16) {
			System.out.println("good afternoon");
		}else if(time>=16 && time<20) {
			System.out.println("good evening");
		}else if(time>=20 && time<24){
			System.out.println("good n5 ight");
		} else{
			System.out.println("no wishes");
		}
		
		
	}

}
