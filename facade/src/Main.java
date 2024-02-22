import java.time.LocalDateTime;
import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UUID userId = UUID.randomUUID();
        NotificationFacade notificationFacade = new NotificationFacade();
        /*Отправка СМС*/
        notificationFacade.sendSms(userId);


        /*Отправка Email*/
        notificationFacade.sendEmail(userId);

    }
}