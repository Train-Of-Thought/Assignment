package Bank;


public class Banking {
    private int AccNo1;
    private float Balance1;
    private int Pin1;
    
    public boolean verifyAccount(int AccNo2, int Pin2){
        return this.AccNo1 == AccNo2 && this.Pin1 == Pin2;
    }
    
    public void deposit(float amount){
        if(amount>0){
            this.Balance1 += amount;
            System.out.println("Deposited: "+amount);
            System.out.println("New Balance: "+this.Balance1);
        }else{
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public void withdraw(float amount){
        if (amount > 0) {
            if (amount <= this.Balance1) {
                this.Balance1 -= amount;
                System.out.println("Withdrawn: " + amount);
                System.out.println("New Balance: " + this.Balance1);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Invalid withdraw amount.");
        }
    }

    /**
     * @return the AccNo1
     */
    public int getAccNo1() {
        return AccNo1;
    }

    /**
     * @param AccNo1 the AccNo1 to set
     */
    public void setAccNo1(int AccNo1) {
        this.AccNo1 = AccNo1;
    }

    /**
     * @return the Balance1
     */
    public float getBalance1() {
        return Balance1;
    }

    /**
     * @param Balance1 the Balance1 to set
     */
    public void setBalance1(float Balance1) {
        this.Balance1 = Balance1;
    }

    /**
     * @return the Pin1
     */
    public int getPin1() {
        return Pin1;
    }

    /**
     * @param Pin1 the Pin1 to set
     */
    public void setPin1(int Pin1) {
        this.Pin1 = Pin1;
    }

}
