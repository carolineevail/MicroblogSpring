package com.theironyard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Caroline on 3/7/16.
 */
@Entity
public class Message {
    @Id
    @GeneratedValue
    Integer id;
    String text;

    public Message(Integer id, String text) {
        this.id = id;
        this.text = text;
    }

    public Message(String text) {
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
