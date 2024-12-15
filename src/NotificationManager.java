

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NotificationManager {

    /**
     * Method called to send notifications out.
     * @param tasks List of NotificationTasks tasks to be run
     */
    public void sendSaleNotificationsOut(List<NotificationTask> tasks) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < tasks.size(); i++) {
            executor.submit(tasks.get(i));
        }

        executor.shutdown();
    }

    /*
    Your job is to complete NotificationManager so the method sendNotificationsOut() is able to complete
    its task by submitting all three tasks to an ExecutorService.

    Complete the implementation of the NotificationManager class by implementing the
    sendSaleNotificationsOut() method so that it executes all NotificationTask instances in the provided
    List.
     */

}
