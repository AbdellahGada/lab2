package comp74.lab2;
import java.util.Random;
import org.springframework.boot.CommandLineRunner;
import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import comp74.lab2.model.Model;
import comp74.lab2.model.Posting;
import comp74.lab2.model.Profile;

public class Startup implements CommandLineRunner{
    Model model;
    final Integer MIN_PROFILES=2;
    final Integer MAX_PROFILES =10;
    final Integer MIN_POSTS=2;
    final Integer MAX_POSTS=8;
    Lorem lorem = LoremIpsum.getInstance();
    public Startup (Model model)
    {
        this.model=  model;
    }

    @Override
    public void run(String... aStrings) throws Exception{
        Random random = new Random();
        Integer nProfiles = MIN_PROFILES + random.nextInt(MAX_PROFILES - MIN_PROFILES);
        for(int profileCount=0; profileCount< nProfiles;profileCount++)
        {
            Profile profile = new Profile(lorem.getFirstName());
            Integer nPostings = MIN_POSTS + random.nextInt(MAX_POSTS-MIN_POSTS);
            for(int postingCount = 0; postingCount < nPostings;postingCount++)
            {
                Posting posting = new Posting();
                posting.setUserName(profile.getUserName());
                Integer nWords = 10 + random.nextInt(MAX_POSTS-MIN_POSTS);
                posting.setPostingText(lorem.getWords(nWords));
                model.addPost(posting);
                profile.addPosting(posting);
            }
            model.addProfile(profile);
        }

    }
    
}
