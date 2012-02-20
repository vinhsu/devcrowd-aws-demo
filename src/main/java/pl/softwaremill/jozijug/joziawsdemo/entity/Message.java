package pl.softwaremill.jozijug.joziawsdemo.entity;

import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

/**
 * @author Adam Warski (adam at warski dot org)
 */
@Entity
public class Message implements Serializable {

    @Id
    private String uuid;

    @Column
    private String room;

    @Column
    private String content;

    @Column
    private DateTime date;

    @Column
    private DateTime saveDate;

    public Message() {
    }

    public Message(UUID uuid, String room, String content, DateTime date, DateTime saveDate) {
        this.uuid = uuid.toString();
        this.room = room;
        this.content = content;
        this.date = date;
        this.saveDate = saveDate;
    }

    public String getUuid() {
        return uuid;
    }

    public String getRoom() {
        return room;
    }

    public String getContent() {
        return content;
    }

    public DateTime getDate() {
        return date;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    public DateTime getSaveDate() {
        return saveDate;
    }

    public void setSaveDate(DateTime saveDate) {
        this.saveDate = saveDate;
    }

    @Override
    public String toString() {
        return "Message{" +
                "uuid=" + uuid +
                ", room='" + room + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", saveDate=" + saveDate +
                '}';
    }
}
