import java.util.Date;

public class BankAccount {
    private int code;
    private double Balance;
    private Date CreatedAt;

      public BankAccount(){

      }
      public BankAccount(int code ){

      }

    public BankAccount(int code, double balance, Date date) {
          this.code=code;
          this.Balance=balance;
          this.CreatedAt=date;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
