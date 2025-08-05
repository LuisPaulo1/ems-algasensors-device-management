package com.algaworks.algasensors.device_management.api.controller;

import com.algaworks.algasensors.device_management.api.model.SensorInput;
import com.algaworks.algasensors.device_management.common.IdGenerator;
import com.algaworks.algasensors.device_management.domain.model.Sensor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/sensors")
public class SensorController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Sensor create(@RequestBody SensorInput sensor) {
        return Sensor.builder()
                .id(IdGenerator.generateTSID())
                .name(sensor.getName())
                .ip(sensor.getIp())
                .location(sensor.getLocation())
                .protocol(sensor.getProtocol())
                .model(sensor.getModel())
                .enabled(false)
                .build();
    }
}