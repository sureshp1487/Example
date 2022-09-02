package pattern;

public class MultipleTaskS {
	public static void main(String[] args) {
		int num=5;
		String operation="square";
		switch(operation) {
		case "square":
			System.out.println(num*num);
			break;
		case "cube":
			System.out.println(num*num*num);
			break;
		case "fourTime":
			System.out.println(num*num*num*num);
			break;
		default:
			System.out.println("Invalid operation");
		}
		
	}
}
