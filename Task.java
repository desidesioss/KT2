package tasks;

import java.util.Date;

public class Task {
    private String title;
    private String description;
    private Date creationDate;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.creationDate = new Date();
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Date getCreationDate() { return creationDate; }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
