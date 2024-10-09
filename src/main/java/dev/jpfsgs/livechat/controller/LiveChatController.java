package dev.jpfsgs.livechat.controller;

import dev.jpfsgs.livechat.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class LiveChatController {

    @MessageMapping("/send-message")
    @SendTo("/topic/messages")
    public ChatMessage receivePublicMessage(@Payload ChatMessage message) {
        return message;
    }
}
