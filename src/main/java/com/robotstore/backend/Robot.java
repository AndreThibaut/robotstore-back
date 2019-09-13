package com.robotstore.backend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "robots")
public class Robot {
    @Id
    @GeneratedValue
    private Long id;
    private String task;

    public Robot(String task) {
        this.task = task;
    }

    public Robot(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
