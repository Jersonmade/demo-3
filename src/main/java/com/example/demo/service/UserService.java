package com.example.demo.service;

import com.example.demo.dto.ScheduleDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.entity.Schedule;
import com.example.demo.entity.User;
import com.example.demo.repository.ScheduleRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ScheduleRepository scheduleRepository;

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public UserDTO getUserById(Long id) {
        User user = userRepository.findById(id).get();
        List<Schedule> schedules = scheduleRepository.findAllByUserId(id);
        user.setSchedules(schedules);
        return UserDTO.toModel(user);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public Long delete(Long id) {
        userRepository.deleteById(id);
        return id;
    }
}
