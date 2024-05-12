package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class LongVideo implements Serializable {

    @InterfaceC65349Pkn("long_video_type")
    public int longVideoType;

    @InterfaceC65349Pkn("trailer_start_time")
    public int trailerStartTime;

    @InterfaceC65349Pkn("video")
    public Video video;

    @InterfaceC65349Pkn("video_control")
    public VideoControl videoControl;

    public int getLongVideoType() {
        return this.longVideoType;
    }

    public int getTrailerStartTime() {
        return this.trailerStartTime;
    }

    public Video getVideo() {
        return this.video;
    }

    public VideoControl getVideoControl() {
        return this.videoControl;
    }

    public void setLongVideoType(int i) {
        this.longVideoType = i;
    }

    public void setTrailerStartTime(int i) {
        this.trailerStartTime = i;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public void setVideoControl(VideoControl videoControl) {
        this.videoControl = videoControl;
    }
}
