class SimplifiedBankAccount1 {
    double balance; // in BRL
    boolean isSpecial;
    String holderName;

    SimplifiedBankAccount1(String name, double balance) throws Exception {
        if (balance < 100) {
            throw new Exception("Balance must be greater or equals to 100");
        }
        holderName = name;
        isSpecial = false;
        this.balance = balance;
    }

    void deposit(double value) {
        balance += value;
    }

    boolean withdraw(double value) {
        if (isSpecial || value <= balance) {
            balance -= value;
            return true;
        }
        return false;
    }

    void showData() {
        System.out.print("The account holder name is: ");
        System.out.println(holderName);
        System.out.print("The balance is: ");
        System.out.println(balance);
        if (isSpecial) {
            System.out.println("The account is special");
        } else {
            System.out.println("The account is standard");
        }
        if (balance < 0) {
            System.out.println("⚠️This account is currently in DEBT!");
        }
    }
}
