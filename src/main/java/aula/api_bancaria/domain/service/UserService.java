package aula.api_bancaria.domain.service;


import aula.api_bancaria.domain.model.User;

public interface UserService{
    User findById(Long id);

     User create(User userToCreate);

}