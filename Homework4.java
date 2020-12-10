package testExample;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString="";
		int account=0;
		int before=0;
		
		while(!inputString.contentEquals("0")) { //content equals = 문자열 내용 비교 
			System.out.println("1.입금 2.출금 3.조회 0.종료");
			System.out.print(">>");

			inputString=sc.next();
			
			switch(inputString) {
			case "1":
			System.out.println("입금 코너입니다");
			System.out.println("입금할 금액을 입력해주세요");
			System.out.print(">>");
			
		

			int inmoney=sc.nextInt();
			
			System.out.println("입금 전 잔액은"+ before+ "입니다.");
			if(inmoney%1000!=0) {
				System.out.println("동전은 입금이 불가합니다.");
			    System.out.println("잔액은 "+account+"원 입니다.");
			}else if(inmoney<500000){
				account+=inmoney;
				before=account;
				
				System.out.println("입금 후 잔액은 "+account+"원 입니다.");
		
			}else {
				System.out.println("50만원 이상은 입금이 불가합니다.");
				System.out.println("잔액은 "+account+"원 입니다.");
			}
			
			
			break;

			case "2":
			System.out.println("출금 코너입니다");
			System.out.println("출금할 금액을 입력해주세요");
			System.out.print(">>");
			
			int outmoney=sc.nextInt();
			
			System.out.println("출금 전 잔액은"+ before+ "입니다.");
			if(outmoney%1000!=0) {
					System.out.println("동전은 출금이 불가합니다.");
					System.out.println("잔액은 " + account + "원 입니다.");
			}else if(outmoney>4999) {
				account-=outmoney;
				before=account;
				System.out.println("출금 후 잔액은 "+account+"원 입니다.");
			}else{
				System.out.println("5000원 이하는 출금이 불가합니다.");
			    System.out.println("잔액은 " + account + "원 입니다.");
			    
			}
		  
			
			if(account<outmoney) {
			System.out.println("잔액이 부족합니다.");
			}
			break;
		
			case "3":
			System.out.println("조회 코너입니다");
			System.out.println("현재 잔액은 "+account+"원 입니다.");
			break;

			case "0":
			System.out.println("종료되었습니다");
			break;

			
			}
			}
	}
}



