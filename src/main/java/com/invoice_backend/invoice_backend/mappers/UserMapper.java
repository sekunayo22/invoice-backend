package com.invoice_backend.invoice_backend.mappers;

import com.invoice_backend.invoice_backend.dtos.UserDto;
import com.invoice_backend.invoice_backend.models.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserDto userDto);
    UserDto toDto(User user);
}
