package one.digitalinnovation.usersignupapi.service;

import one.digitalinnovation.usersignupapi.model.User;

public interface UserService {
    Iterable<User> findAll();

    User findById(Long id);

    void addUser(User user);

    void update(Long id, User user);

    void delete(Long id);
}
