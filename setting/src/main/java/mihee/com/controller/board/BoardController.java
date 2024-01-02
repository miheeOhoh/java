package mihee.com.controller.board;

import lombok.RequiredArgsConstructor;
import mihee.com.util.KafkaUtil;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController("/api/board")
@RequiredArgsConstructor
public class BoardController {
   // private final
   private final KafkaUtil kafkaUtil;

    @PostMapping("/test/kafka")
    public void testMethod () {
        //sendMessage("test----");
        kafkaUtil.sendMessage("message");

    }
    @PostMapping("/register")
    public String registerBoard() {
        return null;
    }

    public void sendMessage (String message ) {
//        CompletableFuture<SendResult<String, String>> future = kafkaTemplate.send("baeldung", message);
//        future.whenComplete((result, ex) -> {
//            if (ex == null) {
//                System.out.println("Sent message=[" + message + "] with offset =[" +result.getRecordMetadata().offset() + "]");
//            } else {
//                System.out.println("Unable to send message=[" + message +"] due to: "+ ex.getMessage());
//            }
//        });
    }


}


//    public void sendMessage(String message) {
//        CompletableFuture<SendResult<String, String>> future = kafkaTemplate.send(topicName, message);
//        future.whenComplete((result, ex) -> {
//            if (ex == null) {
//                System.out.println("Sent message=[" + message +
//                        "] with offset=[" + result.getRecordMetadata().offset() + "]");
//            } else {
//                System.out.println("Unable to send message=[" +
//                        message + "] due to : " + ex.getMessage());
//            }
//        });
//    }