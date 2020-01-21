package io.pivotal.pal.tracker;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class TimeEntryController {
    public TimeEntryController(TimeEntryRepository timeEntryRepository) {
    }

    public ResponseEntity create(TimeEntry timeEntryToCreate) {
        return new ResponseEntity(HttpStatus.OK);
    }

    public ResponseEntity<TimeEntry> read(long timeEntryId) {
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    public ResponseEntity<List<TimeEntry>> list() {
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    public ResponseEntity update(long timeEntryId, TimeEntry expected) {
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    public ResponseEntity delete(long timeEntryId) {
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}
