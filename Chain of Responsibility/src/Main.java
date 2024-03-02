//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ValidateTransaction firstValidation = new MinLimit();
        ValidateTransaction secondValidation = new MaxLimit();
        firstValidation.setNext(secondValidation);

        firstValidation.check(new MoneyTransaction(20000));

    }
}
 abstract class ValidateTransaction {

    private ValidateTransaction next;

    public void setNext(ValidateTransaction next) {
        this.next = next;
    }

    protected void checkNext(MoneyTransaction moneyTransaction) {
        if(next != null) {
            next.check(moneyTransaction);
        }
    }

    public  abstract void check(MoneyTransaction moneyTransaction);
}
 class MaxLimit extends ValidateTransaction {

    @Override
    public void check(MoneyTransaction moneyTransaction) {
        if (moneyTransaction.getAmount() > 10000) {
            System.out.println("Превышен максимальный размер транзакции");
        }
    }
}
 class MoneyTransaction {

    public  MoneyTransaction(double amount) {
        this.amount = amount;

    }
    public double getAmount() {
        return amount;
    }

    private double amount;
}
 class MinLimit extends ValidateTransaction {

    @Override
    public void check(MoneyTransaction moneyTransaction) {
        if (moneyTransaction.getAmount() > 1000) {
            System.out.println("Необходимо ввести пин-код");
        }

        checkNext(moneyTransaction);
    }
}



