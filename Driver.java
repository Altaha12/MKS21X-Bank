public class Driver{
  public static void main(String[] args){
  double x=100.00;
  double y=200.01;
  BankAccount a = new BankAccount(100.0,234674836,"apcs");
  System.out.println(a.getBalance());
  System.out.println(a.getAccountID());
  a.setPassword("1");
  System.out.println(a);
  Boolean s=a.deposit(x);
  if(s)System.out.println("success");
  if(!s)System.out.println("failed");
  System.out.println(a);
  Boolean r=a.withdraw(y);
  if(r)System.out.println("success");
  if(!r)System.out.println("failed");
  System.out.println(a);

  }
}
