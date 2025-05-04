package aula.api_bancaria.domain.service.impl;

import aula.api_bancaria.domain.model.User;
import aula.api_bancaria.domain.repository.UserRepository;
import aula.api_bancaria.domain.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceIml implements UserService {

    private final UserRepository userRepository;

    public UserServiceIml(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account Number already exists.");
        }
        return userRepository.save(userToCreate);
    }
}
