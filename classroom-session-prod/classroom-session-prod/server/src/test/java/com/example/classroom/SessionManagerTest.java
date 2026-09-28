package com.example.classroom;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SessionManagerTest {

    @Test
    void createAssignsIncreasingIds() {
        SessionManager m = new SessionManager();
        assertEquals(1, m.create("Intro", "2026-10-05", "10:00", "Lab 2").getId());
        assertEquals(2, m.create("Storage", "2026-10-12", "10:00", "Lab 2").getId());
    }

    @Test
    void findReturnsEmptyForUnknownId() {
        assertTrue(new SessionManager().find(99).isEmpty());
    }

    @Test
    void attendanceIgnoresDuplicates() {
        Session s = new SessionManager().create("Intro", "2026-10-05", "10:00", "Lab 2");
        assertTrue(s.markPresent("Asha"));
        assertFalse(s.markPresent(" Asha "));
        assertEquals(1, s.getAttendees().size());
    }

    @Test
    void agendaKeepsOrder() {
        Session s = new SessionManager().create("Intro", "2026-10-05", "10:00", "Lab 2");
        s.addAgendaItem("Welcome");
        s.addAgendaItem("Hands-on");
        assertEquals("Hands-on", s.getAgenda().get(1));
    }
}
