package project;

import java.time.LocalDate;

public class ToDo1 {

    private String title;
    private LocalDate until;

    public ToDo1(String title, LocalDate until) {
        this.title = title;
        this.until = until;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getUntil() {
        return until;
    }

    public void setUntil(LocalDate until) {
        this.until = until;
    }

    @Override
    public String toString() {
        return "ToDo1{" +
                "Title='" + title + '\'' +
                ", Until='" + until + '\'' +
                '}';
    }
}



