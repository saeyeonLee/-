package test20230104;

public class Account {

	// 핑드
	private String accountNo;	//계좌번호
	private int balance;		// 금액
	
	// 생성자 : 계좌번호를 입력하기 위해
	public Account(String accountNo) {		
		this.accountNo = accountNo;
	}
	
	// 메소드
	public int deposit(int money) {			// 메소드(예금하다) 
		balance = balance + money;
		return balance;
	}
	
	public int withdraw(int money) {		// 메소드(출금하다)
		balance = balance - money;
		return balance;
	}
	
	public void showBalance() {
		System.out.println(balance);
	}
}
