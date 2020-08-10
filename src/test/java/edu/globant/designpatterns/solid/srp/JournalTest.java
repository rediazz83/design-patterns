package edu.globant.designpatterns.solid.srp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JournalTest {

    private Journal journal;

    @BeforeEach
    void setUp() {
        journal = new Journal();
        journal.addEntry("Anteayer hizo frio");
        journal.addEntry("Ayer nublado");
        journal.addEntry("Hoy llovió");
        journal.addEntry("Mañana soleado");
    }

    @Test
    public void shouldPopulateJournal() {
        assertNotNull(journal);
        assertEquals(4, journal.getTotalEntries());
    }

    @Test
    public void shouldDeleteElementOfJournal() {
        journal.removeEntry(2);

        assertNotNull(journal);
        assertEquals(3, journal.getTotalEntries());
    }
}