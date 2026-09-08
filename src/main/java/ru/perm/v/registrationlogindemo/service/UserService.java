package ru.perm.v.registrationlogindemo.service;

import ru.perm.v.registrationlogindemo.dto.UserDto;
import ru.perm.v.registrationlogindemo.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
