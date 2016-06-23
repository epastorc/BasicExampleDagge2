package project.exampleusedagger2;

import java.util.Date;

/**
 * Created by kikep on 23/06/2016.
 */
public class Note {
    private String title;
    private Date date_note;
    private String content;
    private Integer id_user;
    public Note(){

    }
    public Note(String title, Date date_note, String content, Integer id_user) {
        this.title = title;
        this.date_note = date_note;
        this.content = content;
        this.id_user = id_user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate_note() {
        return date_note;
    }

    public void setDate_note(Date date_note) {
        this.date_note = date_note;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    @Override
    public String toString() {
        return "Note{" +
                "title='" + title + '\'' +
                ", date_note=" + date_note +
                ", content='" + content + '\'' +
                ", id_user=" + id_user +
                '}';
    }
}
