package com.miit.spring_boot_test.model;

import java.util.UUID;

public class Chopstick {

    private UUID id;
    private String material; // Wooden, steel, plastic, silver, gold

    protected Chopstick() {
        this.id = UUID.randomUUID();
    }

    public Chopstick(String material) {
        this.id = UUID.randomUUID();
        this.material = material;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
