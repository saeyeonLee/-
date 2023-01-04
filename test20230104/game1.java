package test20230104;

import java.util.Random;
import java.util.Scanner;

public class game1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.주먹 2:가위 3:보");
		System.out.print("숫자를 입력하세요: ");
		
		int computer = 0;
		int user = sc.nextInt();
		Random r = new Random();
		
		computer = r.nextInt(3)+1; // 0~2에 숫자 중 랜덤하게 나오기 위해 +1을 해서 1~3의 수가 나올 수 있게 함.
		
		System.out.println("유저: "+user);
		System.out.println("컴퓨터: "+computer);
		
		if(user==1) {
			if(computer==2) {
				System.out.println("승리");
			}	
			else if(computer==3) {
				System.out.println("패배");
			}
			else {
				System.out.println("무승부");
			}
		}	
		else if(user==2) {
			if(computer==2) {
				System.out.println("무승부");
			}
			else if(computer==3) {
				System.out.println("승리");
			}
			else {
				System.out.println("패배");
			}
		}
		else if(user==3) {
			if(computer==2) {
				System.out.println("패배");
			}
			else if(computer==3) {
				System.out.println("무승부");
			}
			else {
				System.out.println("승리");
			}
		}
		else {
			System.out.println("다시 입력해 주세요");
		}
		sc.close();
	}
}
