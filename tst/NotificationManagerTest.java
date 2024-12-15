

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class NotificationManagerTest {

    @Test
    public void sendSaleNotificationsOut_withListOfTasks_callsRunOnEach() {
        // GIVEN
        NotificationManager manager = new NotificationManager();
        List<NotificationTask> notifications = new ArrayList();
        NotificationTask notificationTask1 = mock(NotificationTask.class);
        NotificationTask notificationTask2 = mock(NotificationTask.class);
        notifications.add(notificationTask1);
        notifications.add(notificationTask2);

        //WHEN
        manager.sendSaleNotificationsOut(notifications);

        //THEN
        verify(notificationTask1, times(1)).run();
        verify(notificationTask2, times(1)).run();
    }
    
}
