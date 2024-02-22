public class KidsBirthdaySet implements BirthdayFactory{

    public Gift getGift() {
        return new KidsGift();

    }
    public Card getCard() {
        return new KidsCard();
    }
    public Cake getCake() {
        return new KidsCake();
    }
}
