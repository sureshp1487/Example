package pattern;

public class AxisBank implements RbiBank {

	public String checkLocker() {
		return "available";
	}
	public int getInterest(int principleAmount,int interestPercentage) {
		int getInterest= principleAmount*interestPercentage/100;
		return getInterest;
	}
	public String loanEligibility(int age) {
		if(age>45) {
			return "not eligible";
		}else {
			return "eligible";
		}
	}
}

