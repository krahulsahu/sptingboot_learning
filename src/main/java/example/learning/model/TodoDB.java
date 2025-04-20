package example.learning.model;

import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class TodoDB {
    @Id
    private String id;
    private String title;
    private String priority;
    private boolean completed;
    private LocalDateTime createdAt = LocalDateTime.now();

    public TodoDB() {
    }

    public TodoDB(String id, String title, String priority, boolean completed, LocalDateTime createdAt) {
        this.id = id;
        this.title = title;
        this.priority = priority;
        this.completed = completed;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
