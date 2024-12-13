import manager.TaskManager;
import tasks.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        Task task1 = new Task("Задача 1", "Описание задачи 1");
        DeadlineTask task2 = new DeadlineTask("Задача с дедлайном", "Описание задачи с дедлайном", new Date(System.currentTimeMillis() + 86400000));
        RecurringTask task3 = new RecurringTask("Повторяющаяся задача", "Описание повторяющейся задачи", "Ежедневно", new Date());

        manager.addTask(task1);
        manager.addTask(task2);
        manager.addTask(task3);

        System.out.println("Все задачи:");
        for (Task task : manager.getTasks()) {
            System.out.println(task);
        }

        System.out.println("Общее количество задач: " + TaskManager.getTaskCount());
    }
}
