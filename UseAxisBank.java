package pattern;


public class UseAxisBank {
	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		System.out.println("getInterest :"+ab.getInterest(20000, 10)+"\nCheckLocker :"+ab.checkLocker()+"\nLoanEligibility :"+ab.loanEligibility(46));
	}

}