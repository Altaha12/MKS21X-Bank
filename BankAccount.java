public class BankAccount{
  private double balance;
  private int accountID;
  private String password;
  public BankAccount(double balance0,int accountID0, String password0){
    balance=balance0;
    accountID=accountID0;
    password=password0;
  }
  public int getAccountID(){
    return accountID;}
  public double getBalance(){
    return balance;}
  public void setPassword(String password1){
    password=password1;}
  public String toString(){
    return ""+accountID+"\t"+balance;}
  public Boolean deposit(double money){
    if(money>=0){
      balance+=money;
      return true;}
    return false;}
  public Boolean withdraw(double moneyout){
    if(moneyout<=balance){
      balance-=moneyout;
      return true;
    }
    return false;
  }
  private boolean authenticate(String password){
    return password.equals(this.password);
  }
  public boolean transferTo(BankAccount other, double amount, String password){
    if(authenticate(password)&&withdraw(amount)){
      other.deposit(amount);
      System.out.println("successfull transfer");
      return true;
    }
    return false;

  }





}
