package day03;

import java.util.Scanner;

public class InterfaceTest {
	public static void main(String[] args) {
//实列化取款机对象
		ATMCBC atm =new ATMCBC();
		//实例化一张银行卡
		Card card=new Card("CBC","123456",5000);
	//将银行卡放入取款机
		atm.setCard(card);
		//提示用户输入密码
		System.out.println("请输入密码: ");
		Scanner sc=new Scanner(System.in);
		String input =sc.next();
		if(atm.checkPwd(input)){
			System.out.println("请输入取款金额");
			double money=sc.nextDouble();
			if (atm.drawMoney(money)){
				System.out.println("取款成功！余额："+atm.getBalance());
			}else{
				System.out.println("余额不足，取款失败");
			}
		}else{
			System.out.println("密码验证错误！请退出");
		}
	}
}
