package day03;
/**
 * 封装银联标准功能定义的接口
 * @author 
 *
 */
public interface IUnionPay {
  public abstract boolean checkPwd(String input );  
  boolean drawMoney(double money);
  double getBalance();
}
