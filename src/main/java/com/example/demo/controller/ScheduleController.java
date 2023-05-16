package com.example.demo.controller;

import com.example.demo.entity.Schedule;
import com.example.demo.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedules")
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/schedule/all")
    public List<Schedule> allUsers() {
        return scheduleService.getAllSchedule();
    }

    @GetMapping("/{id}")
    public Schedule getScheduleById(@PathVariable Long id) {
        return scheduleService.getScheduleById(id);
    }

    @PostMapping()
    public void addSchedule(Schedule schedule) {
        scheduleService.save(schedule);
    }

    @DeleteMapping("{id}")
    public Long deleteSchedule(@PathVariable Long id) {
        scheduleService.delete(id);
        return id;
    }
}
