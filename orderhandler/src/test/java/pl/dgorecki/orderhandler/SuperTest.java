package pl.dgorecki.orderhandler;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class SuperTest {


    @Test
    void test() {
//        Message message = Message
//                .creator(new com.twilio.type.PhoneNumber("+48505697560"),
//                        new com.twilio.type.PhoneNumber("+12702142684"),
//                        "This is the ship that made the Kessel Run in fourteen parsecs?")
//                .create();

//        System.out.println(message.getBody());
    }
}
