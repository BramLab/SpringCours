package be.bruxelles.spring_api.tasks;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter @Setter
public class TaskDTO {
    private String uniqueID;
    private String description;
    private Urgency urgency;
    private LocalDate deadline;

    public TaskDTO(String uniqueID, String description, Urgency urgency, LocalDate deadline) {
        this.uniqueID = uniqueID;
        this.description = description;
        this.urgency = urgency;
        this.deadline = deadline;
    }
}

enum Urgency{
    URGENT,
    NORMAL,
    LOW
}

