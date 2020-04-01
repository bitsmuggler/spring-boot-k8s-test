package com.techtopics.k8straining.examplerestapi;

public class Note {

    private final long id;
    private String content;

    public Note(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
