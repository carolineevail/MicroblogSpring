package com.theironyard;

/**
 * Created by Caroline on 3/7/16.
 */
public class Message {
    int id;
    String text;

    public Message(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}