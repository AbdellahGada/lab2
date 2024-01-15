package comp74.lab2.model;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Profile {
    Integer profileId;
    String userName;
    List<Posting> postings;

    public Profile(String userName) {
        this.userName = userName;
        postings = new ArrayList<>();
    }
    public void addPosting(Posting posting){
        postings.add(posting);
    }
    public Integer getProfileId() {
        return profileId;
    }
    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public List<Posting> getPostings() {
        return postings;
    }
    public void setPostings(List<Posting> postings) {
        this.postings = postings;
    }
}
