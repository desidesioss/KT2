package tasks;

import java.util.Date;

public class DeadlineTask extends Task {
    private Date deadline;

    public DeadlineTask(String title, String description, Date deadline) {
        super(title, description);
        this.deadline = deadline;
    }

    public Date getDeadline() { return deadline; }
    public void setDeadline(Date deadline) { this.deadline = deadline; }

    @Override
    public String toString() {
        return super.toString() + ", DeadlineTask{deadline=" + deadline + '}';
    }
}
