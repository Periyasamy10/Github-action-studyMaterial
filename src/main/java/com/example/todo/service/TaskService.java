package com.example.todo.service;

import com.example.todo.model.Task;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class TaskService {
    private final Map<Long, Task> tasks = new HashMap<>();
    private final AtomicLong counter = new AtomicLong(1);

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks.values());
    }

    public Task addTask(String title) {
        Long id = counter.getAndIncrement();
        Task task = new Task(id, title);
        tasks.put(id, task);
        return task;
    }

    public void deleteTask(Long id) {
        tasks.remove(id);
    }
}
