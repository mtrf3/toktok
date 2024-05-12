package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class VideoCover implements Serializable {

    @InterfaceC65349Pkn("offset")
    public Integer offset;

    @InterfaceC65349Pkn("video")
    public Video video;

    @InterfaceC65349Pkn("video_id")
    public String videoId;

    public final Integer getOffset() {
        return this.offset;
    }

    public final Video getVideo() {
        return this.video;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final void setOffset(Integer num) {
        this.offset = num;
    }

    public final void setVideo(Video video) {
        this.video = video;
    }

    public final void setVideoId(String str) {
        this.videoId = str;
    }
}
