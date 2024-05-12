package com.ss.bytertc.engine;

import X.X1D;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes33.dex */
public class RTCStream {
    public boolean hasAudio;
    public boolean hasVideo;
    public boolean isScreen;
    public String userId;
    public List<VideoStreamDescription> videoStreamDescriptions;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RTCStream{ userId='");
        LIZ.append(this.userId);
        LIZ.append('\'');
        LIZ.append(", isScreen=");
        LIZ.append(this.isScreen);
        LIZ.append(", hasVideo=");
        LIZ.append(this.hasVideo);
        LIZ.append(", hasAudio=");
        LIZ.append(this.hasAudio);
        LIZ.append(", videoStreamDescriptions=");
        LIZ.append(this.videoStreamDescriptions);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public RTCStream() {
    }

    public static RTCStream create(String str, boolean z, boolean z2, boolean z3) {
        return new RTCStream(str, z, z2, z3, null);
    }

    public RTCStream(String str, boolean z, boolean z2, boolean z3, List<VideoStreamDescription> list) {
        this.userId = str;
        this.isScreen = z;
        this.hasVideo = z2;
        this.hasAudio = z3;
        this.videoStreamDescriptions = list;
    }

    public static RTCStream createWithStreamDescriptions(String str, boolean z, boolean z2, boolean z3, VideoStreamDescription[] videoStreamDescriptionArr) {
        return new RTCStream(str, z, z2, z3, Arrays.asList(videoStreamDescriptionArr));
    }
}
