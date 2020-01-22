package io.pivotal.pal.tracker;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class InMemoryTimeEntryRepository implements TimeEntryRepository {

    private Map<Long, TimeEntry> timeEntryRepo = new HashMap();
    private Long uniqueId = 1L;

    @Override
    public TimeEntry create(TimeEntry timeEntry) {
        TimeEntry entry = new TimeEntry(uniqueId, timeEntry.getProjectId(), timeEntry.getUserId(), timeEntry.getDate(), timeEntry.getHours());
        timeEntryRepo.put(uniqueId++, entry);
        return entry;
    }

    @Override
    public TimeEntry find(Long id) {
        TimeEntry timeEntry = new TimeEntry();
        timeEntry = timeEntryRepo.get(id);
        return timeEntry;
    }

    @Override
    public TimeEntry update(Long id, TimeEntry timeEntry) {
        TimeEntry entry = timeEntryRepo.get(id);
        if (entry != null) {
            entry.setProjectId(timeEntry.getProjectId());
            entry.setUserId(timeEntry.getUserId());
            entry.setDate(timeEntry.getDate());
            entry.setHours(timeEntry.getHours());
            timeEntryRepo.put(id, entry);
        }
        return entry;
    }

    @Override
    public void delete(Long id) {
        TimeEntry entry = timeEntryRepo.remove(id);
    }

    @Override
    public ArrayList<TimeEntry> list() {
        ArrayList<TimeEntry> entryList = new ArrayList(timeEntryRepo.values());
        return entryList;
    }
}
