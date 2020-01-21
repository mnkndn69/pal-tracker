package io.pivotal.pal.tracker;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryTimeEntryRepository {

private Map<Long, TimeEntry> timeEntryRepo= new HashMap();
private Long uniqueId = 1L;

    public TimeEntry create(TimeEntry timeEntry) {
         TimeEntry entry = new TimeEntry(uniqueId,timeEntry.getUserId(),timeEntry.getProjectId(),timeEntry.getDate(),timeEntry.getHours());
         timeEntryRepo.put(uniqueId++,entry);
         return entry;
    }

    public TimeEntry find(long id) {
        TimeEntry timeentry = new TimeEntry();

        return timeentry;
    }

    public TimeEntry update(long id, TimeEntry timeEntry) {
        return timeEntry;
    }

    public void delete(long id) {
    }

    public ArrayList<TimeEntry> list() {
return new ArrayList<>();
    }
}
