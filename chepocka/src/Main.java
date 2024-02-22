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