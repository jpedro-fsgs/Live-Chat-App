package dev.jpfsgs.livechat.model;

import lombok.Data;

import java.time.Instant;

@Data
public class ChatMessage {
    private MessageType type;
    private String content;
    private String sender;
    private Instant timestamp;

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }

    ChatMessage(MessageType type, String content, String sender) {
        this.type = type;
        this.content = content;
        this.sender = sender;
        this.timestamp = Instant.now();
    }
}
