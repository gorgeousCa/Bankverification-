package day03;
/**
 * 封装银行卡属性的类
 * @author lenovo
 *
 */
public class Card {
	public String bank;
	public String pwd;
	public double bal;//余额

	public Card(String bank, String pwd, double bal) {
		super();
		this.bank = bank;
		this.pwd = pwd;
		this.bal = bal;
	}

}
