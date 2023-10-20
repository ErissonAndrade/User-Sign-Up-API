package one.digitalinnovation.usersignupapi.service.impl;

import one.digitalinnovation.usersignupapi.model.AddressRepository;
import one.digitalinnovation.usersignupapi.model.User;
import one.digitalinnovation.usersignupapi.model.UserRepository;
import one.digitalinnovation.usersignupapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void update(Long id, User user) {
        Optional<User> getUser = userRepository.findById(id);
        if(getUser.isPresent()) {
            userRepository.save(user);
        }
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
