package be.bruxelles.spring_api.tasks;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@Primary
public class TaskService {

    private final List<TaskDTO> taskDTOs;

    public TaskService() {
        taskDTOs = new ArrayList<TaskDTO>();

        taskDTOs.add(
                new TaskDTO(
                "Now",
                "make a task app in Spring",
                Urgency.URGENT,
                LocalDate.parse("2023-07-19"))
        );
    }

    public TaskDTO getSomething () {  return strings.get(index);  }


}