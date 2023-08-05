package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task implements Comparable<Task> {
    private LocalDate date;
    private String task;

    public Task(LocalDate date, String task) {
        this.date = date;
        this.task = task;
    }

    public int compareTo(Task other) {
        return date.compareTo(other.date);
    }

    public String gettask() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy年M月d日");
        return date.format(f) + ":" + task;
    }

}
