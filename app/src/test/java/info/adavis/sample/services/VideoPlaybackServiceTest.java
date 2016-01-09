package info.adavis.sample.services;

import org.junit.Before;
import org.junit.Test;

import info.adavis.sample.models.Video;

import static org.junit.Assert.assertEquals;

/**
 * @author Annyce Davis
 */
public class VideoPlaybackServiceTest {

    private VideoPlaybackService playbackService;

    @Before
    public void setUp() {
        playbackService = new VideoPlaybackService();
    }

    @Test
    public void shouldReceiveCurrentUrlWhenVideoAvailable() {
        String url = "http://www.my_video.mp4";

        playbackService.setCurrentVideo(new Video().setUrl(url));

        String actualUrl = playbackService.playCurrentVideo();

        assertEquals("the urls are not the same", url, actualUrl);
    }

}