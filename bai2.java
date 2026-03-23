// Interface
interface MessageService {
    void sendMessage(String message);
}

// Email Service
class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}

class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class Notification {
    private MessageService messageService;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message) {
        messageService.sendMessage(message);
    }
}

public class MainApp {
    public static void main(String[] args) {

        Notification notification = new Notification();
        notification.setMessageService(new EmailService());
        notification.notifyUser("Hello via Email!");

        notification.setMessageService(new SMSService());
        notification.notifyUser("Hello via SMS!");
    }
}