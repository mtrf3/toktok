package com.ss.bytertc.engine.type;

import X.X1D;
import com.ss.bytertc.engine.InternalLocalVideoStats;

/* loaded from: classes33.dex */
public class LocalVideoStats {
    public int codecType;
    public int encodedBitrate;
    public int encodedFrameCount;
    public int encodedFrameHeight;
    public int encodedFrameWidth;
    public int encoderOutputFrameRate;
    public int inputFrameRate;
    public boolean isScreen;
    public int jitter;
    public int rendererOutputFrameRate;
    public int rtt;
    public int sentFrameRate;
    public float sentKBitrate;
    public int statsInterval;
    public int videoDenoiseMode;
    public float videoLossRate;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocalVideoStats{sentKBitrate='");
        LIZ.append(this.sentKBitrate);
        LIZ.append('\'');
        LIZ.append(", inputFrameRate='");
        LIZ.append(this.inputFrameRate);
        LIZ.append('\'');
        LIZ.append(", sentFrameRate='");
        LIZ.append(this.sentFrameRate);
        LIZ.append('\'');
        LIZ.append(", encoderOutputFrameRate='");
        LIZ.append(this.encoderOutputFrameRate);
        LIZ.append('\'');
        LIZ.append(", rendererOutputFrameRate='");
        LIZ.append(this.rendererOutputFrameRate);
        LIZ.append('\'');
        LIZ.append(", videoLossRate='");
        LIZ.append(this.videoLossRate);
        LIZ.append('\'');
        LIZ.append(", rtt='");
        LIZ.append(this.rtt);
        LIZ.append('\'');
        LIZ.append(", statsInterval='");
        LIZ.append(this.statsInterval);
        LIZ.append('\'');
        LIZ.append(", encodedBitrate='");
        LIZ.append(this.encodedBitrate);
        LIZ.append('\'');
        LIZ.append(", encodedFrameWidth='");
        LIZ.append(this.encodedFrameWidth);
        LIZ.append('\'');
        LIZ.append(", encodedFrameHeight='");
        LIZ.append(this.encodedFrameHeight);
        LIZ.append('\'');
        LIZ.append(", encodedFrameCount='");
        LIZ.append(this.encodedFrameCount);
        LIZ.append('\'');
        LIZ.append(", codecType='");
        LIZ.append(this.codecType);
        LIZ.append('\'');
        LIZ.append(", isScreen='");
        LIZ.append(this.isScreen);
        LIZ.append('\'');
        LIZ.append(", jitter='");
        LIZ.append(this.jitter);
        LIZ.append('\'');
        LIZ.append(", videoDenoiseMode");
        LIZ.append(this.videoDenoiseMode);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public LocalVideoStats() {
    }

    public LocalVideoStats(InternalLocalVideoStats internalLocalVideoStats) {
        this.sentKBitrate = internalLocalVideoStats.sentKBitrate;
        this.inputFrameRate = internalLocalVideoStats.inputFrameRate;
        this.sentFrameRate = internalLocalVideoStats.sentFrameRate;
        this.encoderOutputFrameRate = internalLocalVideoStats.encoderOutputFrameRate;
        this.rendererOutputFrameRate = internalLocalVideoStats.rendererOutputFrameRate;
        this.statsInterval = internalLocalVideoStats.statsInterval;
        this.videoLossRate = internalLocalVideoStats.videoLossRate;
        this.rtt = internalLocalVideoStats.rtt;
        this.encodedBitrate = internalLocalVideoStats.encodedBitrate;
        this.encodedFrameWidth = internalLocalVideoStats.encodedFrameWidth;
        this.encodedFrameHeight = internalLocalVideoStats.encodedFrameHeight;
        this.encodedFrameCount = internalLocalVideoStats.encodedFrameCount;
        this.codecType = internalLocalVideoStats.codecType;
        this.isScreen = internalLocalVideoStats.isScreen;
        this.jitter = internalLocalVideoStats.jitter;
        this.videoDenoiseMode = internalLocalVideoStats.videoDenoiseMode;
    }
}
