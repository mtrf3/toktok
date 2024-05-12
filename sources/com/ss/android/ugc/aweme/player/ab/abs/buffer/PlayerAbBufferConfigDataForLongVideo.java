package com.ss.android.ugc.aweme.player.ab.abs.buffer;

/* loaded from: classes9.dex */
public final class PlayerAbBufferConfigDataForLongVideo {
    public final boolean enableLongVideoBufferOpt;
    public int interactionBlockDurationPreloadedForLongVideo = 200;
    public int interactionBlockDurationNonPreloadedForLongVideo = 1000;
    public int netBlockDurationMaxForLongVideo = 5000;
    public float netBlockIncFactorForLongVideo = 9.0f;
    public int netBlockDurationInitialForLongVideo = 200;
    public int interactionBlockDurationSeeking = -1;

    public final boolean getEnableLongVideoBufferOpt() {
        return this.enableLongVideoBufferOpt;
    }

    public final int getInteractionBlockDurationNonPreloadedForLongVideo() {
        return this.interactionBlockDurationNonPreloadedForLongVideo;
    }

    public final int getInteractionBlockDurationPreloadedForLongVideo() {
        return this.interactionBlockDurationPreloadedForLongVideo;
    }

    public final int getInteractionBlockDurationSeeking() {
        return this.interactionBlockDurationSeeking;
    }

    public final int getNetBlockDurationInitialForLongVideo() {
        return this.netBlockDurationInitialForLongVideo;
    }

    public final int getNetBlockDurationMaxForLongVideo() {
        return this.netBlockDurationMaxForLongVideo;
    }

    public final float getNetBlockIncFactorForLongVideo() {
        return this.netBlockIncFactorForLongVideo;
    }

    public final void setInteractionBlockDurationNonPreloadedForLongVideo(int i) {
        this.interactionBlockDurationNonPreloadedForLongVideo = i;
    }

    public final void setInteractionBlockDurationPreloadedForLongVideo(int i) {
        this.interactionBlockDurationPreloadedForLongVideo = i;
    }

    public final void setInteractionBlockDurationSeeking(int i) {
        this.interactionBlockDurationSeeking = i;
    }

    public final void setNetBlockDurationInitialForLongVideo(int i) {
        this.netBlockDurationInitialForLongVideo = i;
    }

    public final void setNetBlockDurationMaxForLongVideo(int i) {
        this.netBlockDurationMaxForLongVideo = i;
    }

    public final void setNetBlockIncFactorForLongVideo(float f) {
        this.netBlockIncFactorForLongVideo = f;
    }
}
