package uk.layme.clean_arch_java.entities.domain.task;

import java.time.LocalDate;

public interface Task {

    boolean isTitleValid();

    boolean isDescriptionValid();

    boolean isDueDateValid();

    String getTitle();

    String getDescription();

    LocalDate getDueDate();

    TaskStatus getStatus();
}
