package com.techtopics.k8straining.examplerestapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class NotesController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/notes")
    public List<Note> getNotes() {
        return generateNotes();
    }

    private List<Note> generateNotes() {
        List<Note> notes = new ArrayList<>();
        for(int i = 0; i < 25; i++) {
            var id = counter.incrementAndGet();
            var note = new Note(id, String.format("note %s", id));
            notes.add(note);
        }

        return notes;
    }
}
