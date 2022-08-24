package eventRegister;

import eventRegister.manager.EventManager;
import eventRegister.manager.UserManager;
import eventRegister.model.Event;
import eventRegister.model.EventType;
import eventRegister.model.User;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        UserManager userManager = new UserManager();
        try {
            Event event = (new Event("Veracnund", "Gyumri", true, 1500, EventType.FESTIVAL));
            eventManager.addEvent(event);
            System.out.println(event);
            List<Event> allEvents = eventManager.showEvents();
            for (Event event1 : allEvents) {
                System.out.println(event1);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            User user = (new User("poxos", "poxosyan", "poxos@gmail.com", 1));
            userManager.addUser(user);
            System.out.println(user);
            List<User> allUsers = userManager.showUsers();
            for (User user1 : allUsers) {
                System.out.println(user1);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
