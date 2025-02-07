package com.shivansh.shoppingcart.service.user;

import com.shivansh.shoppingcart.dto.UserDto;
import com.shivansh.shoppingcart.model.User;
import com.shivansh.shoppingcart.request.CreateUserRequest;
import com.shivansh.shoppingcart.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
