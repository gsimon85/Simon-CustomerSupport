package com.example.simon4;

public class Ticket {
    public String name;
    public String subject;
    public String bodyOfTheTicket;
    public Attachments attachments;

    public Ticket(String name, String subject, String bodyOfTheTicket, Attachments attachments) {
        this.name = name;
        this.subject = subject;
        this.bodyOfTheTicket = bodyOfTheTicket;
        this.attachments = attachments;
    }
    public Ticket(){
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject() {
        this.subject = subject;
    }
    public Attachments getAttachments() {
        return attachments;
    }
    public void setAttachments(Attachments attachments) {
        this.attachments = attachments;
    }
    public String getBodyOfTheTicket() {
        return bodyOfTheTicket;
    }

    public void setBodyOfTheTicket(String bodyOfTheTicket) {
        this.bodyOfTheTicket = bodyOfTheTicket;
    }
    public void addAttachment(){
        setAttachments(attachments);
    }

    public boolean hasAttachments() {
        return attachments.getName().length() > 0 && attachments.getContents().length > 0;
    }
}
