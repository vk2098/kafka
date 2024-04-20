package deliveryboy.kafka.services;

import deliveryboy.kafka.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;
    public boolean updateLocation(String location){
        kafkaTemplate.send(Constants.TOPIC_NAME,location);
        return true;
    }
}
