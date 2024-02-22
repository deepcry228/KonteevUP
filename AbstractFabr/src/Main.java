//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //AdultBirthdaySet adultbirthdaySet = new AdultBirthdaySet();
        KidsBirthdaySet kidsBirthdaySet = new KidsBirthdaySet();
        System.out.println(doParty(kidsBirthdaySet));

    }

    public  static String doParty(BirthdayFactory birthdayFactory) {
        return birthdayFactory.getCard().getName() + " и " +
                birthdayFactory.getGift().getName() + " и " +
                birthdayFactory.getCake().getName();
    }
}