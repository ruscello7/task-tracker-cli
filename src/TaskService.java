public class TaskService {
    private TaskRepository repository;

    private int nextId = 1;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public void createTask(String title, String description) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be null or blank");
        }
        repository.create(new Task(nextId, title, description));
        nextId++;
    }

}
