package uk.layme.clean_arch_java.entities.domain.task;

import java.time.LocalDate;

public class CommonTask implements Task {
    private String title;
    private String description;
    private LocalDate dueDate;
    private TaskStatus status;

    public CommonTask(String title, String description, LocalDate dueDate, TaskStatus status) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
    }

    @Override
    public boolean isTitleValid() {
        return title.length() > 2;
    }

    @Override
    public boolean isDescriptionValid() {
        return false;
    }

    @Override
    public boolean isDueDateValid() {
        return false;
    }

    @Override
    public String getTitle() {
        return "";
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public LocalDate getDueDate() {
        return null;
    }

    @Override
    public TaskStatus getStatus() {
        return null;
    }
}
