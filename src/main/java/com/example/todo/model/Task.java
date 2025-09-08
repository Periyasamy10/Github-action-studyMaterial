package com.example.todo.model;

public class Task {
    private Long id;
    private String title;
    private boolean completed;

    public Task() {}
    public Task(Long id, String title) {
        this.id = id;
        this.title = title;
        this.completed = false;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public boolean isCompleted() { return completed; }

    public void setId(Long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setCompleted(boolean completed) { this.completed = completed; }
}
