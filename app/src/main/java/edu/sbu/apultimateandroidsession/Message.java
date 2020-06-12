package edu.sbu.apultimateandroidsession;

import java.util.Date;

public class Message {
    private String sender;
    private String body;
    private Date sentDate;

    public Message(String sender, String body) {
        this.sender = sender;
        this.body = body;
        this.sentDate = new Date();
    }

    public String getSender() {
        return sender;
    }

    public Date getSentDate() {
        return sentDate;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setSentDate(Date sentDate) {
        this.sentDate = sentDate;
    }
}
