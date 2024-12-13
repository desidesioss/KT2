package manager;

import tasks.Task;
import java.util.*;

public class TaskManager {
    private List<Task> tasks;
    private static int taskCount = 0;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        taskCount++;
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public List<Task> getTasks() {
        tasks.sort(Comparator.comparing(Task::getCreationDate));
        return tasks;
    }

    public static int getTaskCount() {
        return taskCount;
    }
}
