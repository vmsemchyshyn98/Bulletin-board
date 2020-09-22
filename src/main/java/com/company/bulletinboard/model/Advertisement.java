package com.company.bulletinboard.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "adv_table")
public class Advertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "adv_header")
    private String header;

    @Column(name = "description")
    private String text;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    private String author;

    public Advertisement() {
    }

    public Advertisement(String header, String text, Date date, String author) {
        this.header = header;
        this.text = text;
        this.date = date;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "id=" + id +
                ", header='" + header + '\'' +
                ", text='" + text + '\'' +
                ", date=" + date +
                ", author='" + author + '\'' +
                '}';
    }
}
