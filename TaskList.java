public class TaskList {
    private TaskNode head;

    public TaskList() {
        this.head = null;
    }

    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void markTaskAsCompleted(String description) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.getDescription().equals(description)) {
                current.task.markAsCompleted();
                System.out.println("Task '" + description + "' marked as completed.");
                return;
            }
            current = current.next;
        }
        System.out.println("Task '" + description + "' not found.");
    }

    public void printTasks() {
        TaskNode current = head;
        if (current == null) {
            System.out.println("No tasks found.");
            return;
        }
        while (current != null) {
            System.out.println("Task: " + current.task.getDescription() +
                    " | Status: " + (current.task.isCompleted() ? "Completed" : "Pending"));
            current = current.next;
        }
    }
}
