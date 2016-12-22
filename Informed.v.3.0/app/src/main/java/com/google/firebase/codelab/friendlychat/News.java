package com.google.firebase.codelab.friendlychat;

/**
 * Created by Maksym on 02.12.2016.
 */

public class News {
    private String title, text;


    public News(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {return title;}

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
