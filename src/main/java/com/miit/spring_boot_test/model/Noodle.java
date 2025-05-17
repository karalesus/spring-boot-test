package com.miit.spring_boot_test.model;

import java.util.UUID;

public class Noodle {

    private UUID id;
    private String type; // Wok, Ramen, Soba, Udon, Wheat, Padthai

    protected Noodle() {
        this.id = UUID.randomUUID();
    }

    public Noodle(String type) {
        this.id = UUID.randomUUID();
        this.type = type;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
