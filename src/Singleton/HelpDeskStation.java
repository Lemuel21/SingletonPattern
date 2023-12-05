package Singleton;

public class HelpDeskStation {
    public static void main(String[] args) {
        QueueManager queueManager = QueueManager.getInstance();
        queueManager.getCurrentQueueNumber("Station 3");
        queueManager.getCurrentQueueNumber("Station 4");
        queueManager.getCurrentQueueNumber("Station 1");

        queueManager.resetQueueNumber("Station 1", 100);

        queueManager.getCurrentQueueNumber("Station 4");
        queueManager.getCurrentQueueNumber("Station 1");
        queueManager.getCurrentQueueNumber("Station 2");
    }
}

