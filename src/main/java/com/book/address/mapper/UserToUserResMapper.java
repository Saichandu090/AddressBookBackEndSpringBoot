package com.book.address.mapper;

import com.book.address.dto.UserLoginDTO;
import com.book.address.dto.UserResponseDTO;
import com.book.address.model.User;

public class UserToUserResMapper
{
    public UserResponseDTO convertUser(User user)
    {
        if(user!=null) {
            UserResponseDTO responseDTO = new UserResponseDTO();
            responseDTO.setResult(true);
            responseDTO.setMessage("User Created Successfully");
            return responseDTO;
        }
        else{
            UserResponseDTO responseDTO=new UserResponseDTO();
            responseDTO.setMessage("User Not Created");
            responseDTO.setResult(false);
            return responseDTO;
        }
    }

    public UserResponseDTO login(UserLoginDTO loginDTO, String token)
    {
        UserResponseDTO dto=new UserResponseDTO();
        dto.setResult(true);
        dto.setMessage(token);
        return dto;
    }

    public UserResponseDTO userAlreadyExists()
    {
        UserResponseDTO responseDTO=new UserResponseDTO();
        responseDTO.setResult(false);
        responseDTO.setMessage("User Already Exists");
        return responseDTO;
    }
}
