package comp74.lab2.model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Posting {
    private Integer postingId;
    String postingText;
    String userName;
    LocalDate date;
    LocalTime time;
    public void setDateAndTime(LocalDateTime datetime) {       
        this.date = datetime.toLocalDate();
        this.time = datetime.toLocalTime();
    }
    public Integer getPostingId() {
        return postingId;
    }
    public void setPostingId(Integer postingId) {
        this.postingId = postingId;
    }
    public String getPostingText() {
        return postingText;
    }
    public void setPostingText(String postingText) {
        this.postingText = postingText;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public LocalTime getTime() {
        return time;
    }
    public void setTime(LocalTime time) {
        this.time = time;
    }
    
    

    
    
    
}
