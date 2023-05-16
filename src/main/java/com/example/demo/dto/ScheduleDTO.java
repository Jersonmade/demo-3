package com.example.demo.dto;

import com.example.demo.entity.Schedule;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ScheduleDTO {
    private Long id;
    private String name;
    private boolean monday;
    private boolean tuesday;
    private boolean wednesday;
    private boolean thursday;
    private boolean friday;
    private boolean saturday;
    private boolean sunday;

    public static ScheduleDTO toModel(Schedule entity) {
        ScheduleDTO model = new ScheduleDTO();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setMonday(entity.isMonday());
        model.setTuesday(entity.isTuesday());
        model.setWednesday(entity.isWednesday());
        model.setThursday(entity.isThursday());
        model.setFriday(entity.isFriday());
        model.setSaturday(entity.isSaturday());
        model.setSunday(entity.isSunday());
        return model;
    }
}
