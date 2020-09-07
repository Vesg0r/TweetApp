package android.bignerdrach.tweetapp.pojo;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Objects;

public class Tweet {
    private User user;
    private long id;
    private String creationDate;
    private String text;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tweet tweet = (Tweet) o;
        return id == tweet.id &&
                user.equals(tweet.user) &&
                creationDate.equals(tweet.creationDate) &&
                text.equals(tweet.text) &&
                retweetCount.equals(tweet.retweetCount) &&
                favouriteCount.equals(tweet.favouriteCount) &&
                Objects.equals(imageUrl, tweet.imageUrl);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        return Objects.hash(user, id, creationDate, text, retweetCount, favouriteCount, imageUrl);
    }

    private Long retweetCount;
    private Long favouriteCount;
    private String imageUrl;

    public User getUser() {
        return user;
    }

    public long getId() {
        return id;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getText() {
        return text;
    }

    public Long getRetweetCount() {
        return retweetCount;
    }

    public Long getFavouriteCount() {
        return favouriteCount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Tweet(User user, long id, String creationDate, String text, Long retweetCount, Long favouriteCount, String imageUrl) {
        this.user = user;
        this.id = id;
        this.creationDate = creationDate;
        this.text = text;
        this.retweetCount = retweetCount;
        this.favouriteCount = favouriteCount;
        this.imageUrl = imageUrl;
    }
}
