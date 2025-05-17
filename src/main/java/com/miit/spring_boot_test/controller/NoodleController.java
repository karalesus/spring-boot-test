package com.miit.spring_boot_test.controller;

import com.miit.spring_boot_test.model.Noodle;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/noodles")
public class NoodleController {
    private final List<Noodle> noodles = new ArrayList<>();

    @GetMapping
    public List<Noodle> getAllNoodles() {
        return noodles;
    }

    @PostMapping
    public Noodle addNoodle(@RequestBody Noodle noodle) {
        noodles.add(noodle);
        return noodle;
    }
}
