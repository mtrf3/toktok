package com.ss.bytertc.engine.type;

import X.X1D;
import com.ss.bytertc.engine.InternalRemoteVideoStats;

/* loaded from: classes33.dex */
public class RemoteVideoStats {
    public int codecType;
    public int decoderOutputFrameRate;
    public long e2eDelay;
    public int frozenRate;
    public int height;
    public boolean isScreen;
    public int jitter;
    public float receivedKBitrate;
    public int rendererOutputFrameRate;
    public int rtt;
    public int stallCount;
    public int stallDuration;
    public int statsInterval;
    public int superResolutionMode;
    public int videoIndex;
    public float videoLossRate;
    public int width;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RemoteVideoStats{width='");
        LIZ.append(this.width);
        LIZ.append('\'');
        LIZ.append(", height='");
        LIZ.append(this.height);
        LIZ.append('\'');
        LIZ.append(", videoLossRate='");
        LIZ.append(this.videoLossRate);
        LIZ.append('\'');
        LIZ.append(", receivedKBitrate='");
        LIZ.append(this.receivedKBitrate);
        LIZ.append('\'');
        LIZ.append(", decoderOutputFrameRate='");
        LIZ.append(this.decoderOutputFrameRate);
        LIZ.append('\'');
        LIZ.append(", rendererOutputFrameRate='");
        LIZ.append(this.rendererOutputFrameRate);
        LIZ.append('\'');
        LIZ.append(", stallCount='");
        LIZ.append(this.stallCount);
        LIZ.append('\'');
        LIZ.append(", stallDuration='");
        LIZ.append(this.stallDuration);
        LIZ.append('\'');
        LIZ.append(", e2eDelay='");
        LIZ.append(this.e2eDelay);
        LIZ.append('\'');
        LIZ.append(", isScreen='");
        LIZ.append(this.isScreen);
        LIZ.append('\'');
        LIZ.append(", rtt='");
        LIZ.append(this.rtt);
        LIZ.append('\'');
        LIZ.append(", frozenRate='");
        LIZ.append(this.frozenRate);
        LIZ.append('\'');
        LIZ.append(", videoIndex='");
        LIZ.append(this.videoIndex);
        LIZ.append('\'');
        LIZ.append(", jitter='");
        LIZ.append(this.jitter);
        LIZ.append('\'');
        LIZ.append(", codecType='");
        LIZ.append(this.codecType);
        LIZ.append('\'');
        LIZ.append(", superResolutionMode='");
        LIZ.append(this.superResolutionMode);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public RemoteVideoStats() {
    }

    public RemoteVideoStats(InternalRemoteVideoStats internalRemoteVideoStats) {
        this.width = internalRemoteVideoStats.width;
        this.height = internalRemoteVideoStats.height;
        this.videoLossRate = internalRemoteVideoStats.videoLossRate;
        this.receivedKBitrate = internalRemoteVideoStats.receivedKBitrate;
        this.decoderOutputFrameRate = internalRemoteVideoStats.decoderOutputFrameRate;
        this.rendererOutputFrameRate = internalRemoteVideoStats.rendererOutputFrameRate;
        this.stallCount = internalRemoteVideoStats.stallCount;
        this.stallDuration = internalRemoteVideoStats.stallDuration;
        this.e2eDelay = internalRemoteVideoStats.e2eDelay;
        this.isScreen = internalRemoteVideoStats.isScreen;
        this.statsInterval = internalRemoteVideoStats.statsInterval;
        this.rtt = internalRemoteVideoStats.rtt;
        this.frozenRate = internalRemoteVideoStats.frozenRate;
        this.codecType = internalRemoteVideoStats.codecType;
        this.videoIndex = internalRemoteVideoStats.videoIndex;
        this.jitter = internalRemoteVideoStats.jitter;
        this.superResolutionMode = internalRemoteVideoStats.superResolutionMode;
    }
}
