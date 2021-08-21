package Banking;

public class AxisBank extends BankInfo {
	public void deposit ()
	{ System.out.println("The RD Deposit ");
	}

	public static void main(String[] args) {
		AxisBank bankObj= new AxisBank();
		bankObj.deposit();
		bankObj.fixed();
		bankObj.savings();
		bankObj.deposit();
		
		
		
		// TODO Auto-generated method stub

	}

}
