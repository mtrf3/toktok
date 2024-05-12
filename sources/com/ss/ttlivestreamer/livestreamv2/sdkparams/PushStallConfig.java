package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import com.livecore.base.tinyjson.annotations.Serialized;

/* loaded from: classes12.dex */
public final class PushStallConfig {

    @Serialized("audio_threshold")
    public int audioThreshold = 100;

    @Serialized("video_threshold")
    public int videoThreshold = 200;

    public final int getAudioThreshold() {
        return this.audioThreshold;
    }

    public final int getVideoThreshold() {
        return this.videoThreshold;
    }

    public final void setAudioThreshold(int i) {
        this.audioThreshold = i;
    }

    public final void setVideoThreshold(int i) {
        this.videoThreshold = i;
    }
}
