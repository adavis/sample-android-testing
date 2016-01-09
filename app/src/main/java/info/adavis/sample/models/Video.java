package info.adavis.sample.models;

/**
 * Sample Domain Object used for demonstration
 *
 * @author Annyce Davis
 */
public class Video {

    private long id;
    private String url;
    private String displayDate;
    private double duration;

    public long getId() {
        return id;
    }

    public Video setId(long id) {
        this.id = id;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Video setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getDisplayDate() {
        return displayDate;
    }

    public Video setDisplayDate(String displayDate) {
        this.displayDate = displayDate;
        return this;
    }

    public double getDuration() {
        return duration;
    }

    public Video setDuration(double duration) {
        this.duration = duration;
        return this;
    }
}
