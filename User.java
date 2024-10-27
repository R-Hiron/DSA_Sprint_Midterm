public class User {
    private String name;
    private TaskList taskList;

    public User(String name) {
        this.name = name;
        this.taskList = new TaskList();
    }

    public String getName() {
        return name;
    }

    public void addTask(String description) {
        Task newTask = new Task(description);
        taskList.addTask(newTask);
        System.out.println("Task '" + description + "' added to " + name + "'s to-do list.");
    }

    public void markTaskAsCompleted(String description) {
        taskList.markTaskAsCompleted(description);
    }

    public void printTasks() {
        System.out.println("\nTasks for " + name + ":");
        taskList.printTasks();
    }
}
