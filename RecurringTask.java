package tasks;

import java.util.Date;

public class RecurringTask extends Task {
    private String interval;
    private Date startDate;

    public RecurringTask(String title, String description, String interval, Date startDate) {
        super(title, description);
        this.interval = interval;
        this.startDate = startDate;
    }

    public String getInterval() { return interval; }
    public void setInterval(String interval) { this.interval = interval; }
    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }

    @Override
    public String toString() {
        return super.toString() + ", RecurringTask{interval='" + interval + '\'' + ", startDate=" + startDate + '}';
    }
}
