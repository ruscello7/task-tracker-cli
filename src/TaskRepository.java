import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    private List<Task> tasks = new ArrayList<>();

    public void create(Task task) {
        tasks.add(task);
    }

    public Task read(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    public Task update(int id, Task task) {
        for (Task task1 : tasks) {
            if (task1.getId() == id) {
                task1.setTitle(task.getTitle());
                task1.setDescription(task.getDescription());
                return task1;
            }
        }
        return null;
    }

    public boolean delete(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                tasks.remove(task);
                return true;
            }
        }
        return false;
    }




}
