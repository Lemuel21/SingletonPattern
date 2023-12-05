package Singleton;

public class QueueManager {
    private static QueueManager instance;
    private int currentQueueNumber;

    private QueueManager() {

    }

    public static QueueManager getInstance() {
        if (instance == null)
            instance = new QueueManager();

         return instance;
    }

    // get the current queue number
    public void getcurrentqNumber(String station) {
        System.out.println("Queue number " + currentQueueNumber
                + " is in already " + station + ".");
        incrementQueueNumber();
    }

    public void incrementqNumber()   {
        currentQueueNumber++;
    }

    public void resetqNumber(String station, int resetQueue) {
        System.out.println(station + " reset the queuing number to " + resetQueue);
        this.currentQueueNumber = resetQueue;
    }
}

