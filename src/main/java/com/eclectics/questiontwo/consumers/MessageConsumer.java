package com.eclectics.questiontwo.consumers;

import com.eclectics.questiontwo.entities.Messages;
import com.eclectics.questiontwo.repository.MessageRepository;
import com.eclectics.questiontwo.wrapper.MessageResponse;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class MessageConsumer {

    @Autowired
    private MessageRepository repository;

    @RabbitListener(queues="${eclectics.rabbitmq.queue}")
    public void addMessage(String message){
        Messages messages = new Messages();
        messages.setMessage(message);
       Messages msg = repository.save(messages);
       System.out.println("data inserted to database:: id:"+msg.getId()+"\n message: "+
            msg.getMessage()+"\n created On: "+msg.getCreatedOn() );
    }

    public MessageResponse findAll(){
        MessageResponse response = new MessageResponse();
        response.setMessages(repository.findAll());
        return response;
    }
}
