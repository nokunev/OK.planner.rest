package lv.ok.service;

import lv.ok.models.Event;
import lv.ok.models.User;

import java.util.List;

public interface IEventService {

    Event addEvent(Event event);
    List<Event> getAllEvents();
    void deleteEvent(String id);
    void updateEvent(String id, Event event);
}
