package com.taskmanager.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @GetMapping
    public List<String> getTasks(){
        return Arrays.asList("Task1","Task2");
    }

    @PostMapping
    public String createTask(){
        return "Task Created";
    }

}
