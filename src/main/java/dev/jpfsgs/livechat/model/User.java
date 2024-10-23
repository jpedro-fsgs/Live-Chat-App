package dev.jpfsgs.livechat.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class User {
    @Id
    private String username;
    private String name;
    private Status status;

    public enum Status {
        ONLINE, OFFLINE
    }
}
