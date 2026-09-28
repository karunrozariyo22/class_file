package com.example.classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/** One classroom session: details, agenda and attendance. */
public class Session {
    private final int id;
    private final String title;
    private final String date;
    private final String time;
    private final String room;
    private final List<String> agenda = new ArrayList<>();
    private final Set<String> attendees = new LinkedHashSet<>();

    public Session(int id, String title, String date, String time, String room) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.time = time;
        this.room = room;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDate() { return date; }
    public String getTime() { return time; }
    public String getRoom() { return room; }

    public void addAgendaItem(String item) { agenda.add(item); }

    public List<String> getAgenda() { return Collections.unmodifiableList(agenda); }

    /** Returns true if the student was newly marked present. */
    public boolean markPresent(String student) { return attendees.add(student.trim()); }

    public Set<String> getAttendees() { return Collections.unmodifiableSet(attendees); }
}
