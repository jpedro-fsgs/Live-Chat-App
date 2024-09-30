package dev.jpfsgs.livechat.domain;

import java.time.LocalDateTime;

public record ChatOutput(String user, String content, LocalDateTime time) {
}
