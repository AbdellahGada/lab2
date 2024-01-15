package comp74.lab2.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Model {
    HashMap<Integer, Profile> profiles;
    HashMap<Integer, Posting> postings;
    private static Integer nextProfileId = 100;
    private static Integer nextPostId = 100;
    public Model() {
        super();
        profiles = new HashMap<>();
        postings = new HashMap<>();
    }

    public Posting addPost(Posting posting){
        posting.setPostingId(nextPostId++);
        posting.setDateAndTime(LocalDateTime.now());
        postings.put(posting.getPostingId(),posting);
        return posting;
    }
    public Profile addProfile(Profile profile){
        profile.setProfileId(nextPostId++);
        profiles.put(profile.getProfileId(),profile);
        return profile;
    }
    //get by ID
    public Profile getProfileById(Integer id)
    {
        Profile profile = profiles.get(id);
        return profile;
    }
    public Posting getPostingById(Integer id)
    {
        return postings.get(id);
    }
    //get all
    public List<Profile> getProfiles(){
        return new ArrayList<>(profiles.values());
    }

    public List<Posting> getPosts(){
        return new ArrayList<>(postings.values());
    } 
}
