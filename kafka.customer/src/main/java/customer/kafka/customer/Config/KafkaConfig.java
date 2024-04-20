package customer.kafka.customer.Config;

import customer.kafka.customer.Constants;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics = Constants.TOPIC_NAME,groupId = Constants.GROUP_ID)
    public void updatedLocation(String location){
        System.out.println(location);
    }
}
