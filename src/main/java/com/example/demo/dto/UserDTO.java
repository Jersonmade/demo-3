package com.example.demo.dto;

import com.example.demo.entity.Schedule;
import com.example.demo.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private List<Schedule> schedules;

    public static UserDTO toModel(User entity) {
        UserDTO model = new UserDTO();
        model.setId(entity.getId());
        model.setUserName(entity.getUserName());
        model.setFirstName(entity.getFirstName());
        model.setLastName(entity.getLastName());
        model.setEmail(entity.getEmail());
        entity.setSchedules(model.getSchedules());
        return model;
    }

}
