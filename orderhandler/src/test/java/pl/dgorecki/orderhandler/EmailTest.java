package pl.dgorecki.orderhandler;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import pl.dgorecki.orderhandler.service.MailService;

@SpringBootApplication
public class EmailTest {

    @Autowired
    private MailService mailService;

    @Test
    void sendSimpleEmail() {
        SimpleMailMessage message = new SimpleMailMessage();
    }
}
