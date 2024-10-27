public class Main {
    public static void main(String[] args) {
        User[] users = new User[10];
        int userCount = 0;

        User user1 = new User("Alice");
        users[userCount++] = user1;

        User user2 = new User("Bob");
        users[userCount++] = user2;

        user1.addTask("Buy groceries");
        user1.addTask("Call Bob");
        user2.addTask("Finish homework");
        user2.addTask("Read book");

        user1.markTaskAsCompleted("Buy groceries");
        user2.markTaskAsCompleted("Read book");

        for (int i = 0; i < userCount; i++) {
            users[i].printTasks();
        }
    }
}
