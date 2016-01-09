package info.adavis.sample.services;

import info.adavis.sample.models.Video;

/**
 * Fake video playback; used for demonstration purposes
 *
 * @author Annyce Davis
 */
public class VideoPlaybackService {

    private Video currentVideo;

    public void setCurrentVideo(Video video) {
        this.currentVideo = video;
    }

    public String playCurrentVideo() {
        return currentVideo.getUrl();
    }

}
