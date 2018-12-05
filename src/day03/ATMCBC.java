package day03;

/**
 * 封装建设银行ATM机功能的类 所有的ATM机类都必须遵循银联的标准接口 编译错误：实现接口就必须实现接口中所有抽象方法 解决：add
 * unimplemented methods
 *
 */
public class ATMCBC implements IUnionPay {
	// 实现类中，除了实现接口方法外，还可以定义自己专有的成员变量和方法
	public Card card;
	public void setCard(Card card) {
		this.card = card;
	}

	@Override
	public boolean checkPwd(String input) {
		if (input.equals(card.pwd)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean drawMoney(double money) {
		if (card.bal >= money) {
			card.bal-=money;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public double getBalance() {
		
		return card.bal;
	}

}
