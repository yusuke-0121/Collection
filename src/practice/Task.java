package practice;

import java.time.LocalDate;

public class Task implements Comparable<Task> {
    private LocalDate date;
    private String task;

    public Task(LocalDate date, String task) {
        this.date = date;
        this.task = task;
    }

    @Override
    public int compareTo(Task other) {
        return date.compareTo(other.date);
    }


    public String getTask() {
        return date + ":" + task;
    }

}
