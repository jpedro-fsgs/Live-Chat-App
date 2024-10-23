package dev.jpfsgs.livechat.service;

import dev.jpfsgs.livechat.model.User;
import dev.jpfsgs.livechat.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static dev.jpfsgs.livechat.model.User.Status.OFFLINE;
import static dev.jpfsgs.livechat.model.User.Status.ONLINE;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public void saveUser(User user) {
        user.setStatus(ONLINE);
        repository.save(user);
    }

    public void disconnectUser(User user) {
        repository.findById(user.getUsername())
                .ifPresent(storedUser -> {
                    storedUser.setStatus(OFFLINE);
                    repository.save(storedUser);
                });
    }

    public List<User> findConnectedUsers() {
        return repository.findAllByStatus(ONLINE);
    }
}
