package Singleton;

public class HelpDeskStation {
    public static void main(String[] args) {
        QueueManager queueManager = QueueManager.getInstance();
        queueManager.geturrentqNumber("Station 3");
        queueManager.getcurrentqNumber("Station 4");
        queueManager.getCurrentqNumber("Station 1");

        queueManager.resetqNumber("Station 1", 100);

        queueManager.getcurrentqNumber("Station 4");
        queueManager.getcurrentqNumber("Station 1");
        queueManager.getcurrentqNumber("Station 2");
    }
}

