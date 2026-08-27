public class Main {
    public static void main(String[] args) {
        TaskRepository repo = new TaskRepository();
        repo.create(new Task(1, "Study Java", "Finish Repository"));
    }
}