package test20230104;

import java.util.Scanner;

public class AccountApp{
	public static void main(String[] args) {
	
		Scanner sc=  new Scanner(System.in);	// 키보드로부터 입력받기 위한 클래스 생성
		boolean run = true;	// while문 안에 사용하고 있으며 run을 기본값으로 true로 만들어 false가 될 때까지 반복
		int money;
		
		Account account = new Account("123-45-67890");	// Account.java를 사용하기 위해 클래스를 생성하고 생성자를 이용해 계조번호 초기화
		
		while(run) {	// 반복
			System.out.println("");
			System.out.println("---------------------------");
			System.out.println("1:예금 2ㅣ출금 3:잔고 4:종료");
			System.out.println("---------------------------");
			System.out.print("선택>");
			
			int menuNo = sc.nextInt();
			
			switch(menuNo) {	// 조건에 따라 기능 실행
				case 1:
					System.out.print("예금액>");
					money = sc.nextInt();
					account.deposit(money);
					break;
					
				case 2:
					System.out.print("출금액>");
					money = sc.nextInt();
					account.withdraw(money);
					break;
				
				case 3:
					System.out.print("잔고액>");
					money = sc.nextInt();
					account.showBalance();
					break;
				case 4:
					System.out.print("프로그램 종료");
					run = false;
				default:
					System.out.println();
			}
			
		}
		sc.close();
	}
}
