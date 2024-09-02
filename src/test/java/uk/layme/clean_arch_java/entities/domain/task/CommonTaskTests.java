package uk.layme.clean_arch_java.entities.domain.task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommonTaskTests {

    private CommonTask task;

    private String title;
    private String description;
    private LocalDate dueDate;
    private TaskStatus taskStatus;

    @BeforeEach
    void setUp() {
        title = "Task 1";
        description = "Description 1";
        dueDate = LocalDate.now().plusDays(1);
        taskStatus = TaskStatus.TODO;

        task = new CommonTask(title, description, dueDate, taskStatus);
    }

    @Test
    public void isTitleValidShouldReturnTrue() {
        boolean result = task.isTitleValid();

        assertTrue(result);
    }

    @Test
    public void isTitleValidShouldReturnFalseWhenTitleIsSmallerThan3Characters() {
        task = new CommonTask("a".repeat(2), description, dueDate, taskStatus);

        boolean result = task.isTitleValid();

        assertFalse(result);
    }
}
