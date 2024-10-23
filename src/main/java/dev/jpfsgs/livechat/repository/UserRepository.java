package dev.jpfsgs.livechat.repository;

import dev.jpfsgs.livechat.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

    List<User> findAllByStatus(User.Status status);
}
