public class Main {
    public static void main(String[] args) {

        TaskRepository repo = new TaskRepository();
        TaskService service = new TaskService(repo);
        service.createTask("Estudar Java", "Terminar o projeto");
    }
}