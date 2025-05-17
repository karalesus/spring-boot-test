package com.miit.spring_boot_test.controller;

import com.miit.spring_boot_test.model.Chopstick;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/chopsticks")
public class ChopstickController {
    private final List<Chopstick> chopsticks = new ArrayList<>();

    @GetMapping
    public List<Chopstick> getAllChopsticks() {
        return chopsticks;
    }

    @PostMapping
    public Chopstick addChopstick(@RequestBody Chopstick chopstick) {
        chopsticks.add(chopstick);
        return chopstick;
    }
}