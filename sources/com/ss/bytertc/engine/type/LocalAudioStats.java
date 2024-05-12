package com.ss.bytertc.engine.type;

import X.X1D;
import com.ss.bytertc.engine.InternalLocalAudioStats;

/* loaded from: classes33.dex */
public class LocalAudioStats {
    public float audioLossRate;
    public int jitter;
    public int numChannels;
    public int recordSampleRate;
    public int rtt;
    public float sendKBitrate;
    public int sentSampleRate;
    public int statsInterval;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocalAudioStats{audioLossRate='");
        LIZ.append(this.audioLossRate);
        LIZ.append('\'');
        LIZ.append(", sendKBitrate='");
        LIZ.append(this.sendKBitrate);
        LIZ.append('\'');
        LIZ.append(", recordSampleRate='");
        LIZ.append(this.recordSampleRate);
        LIZ.append('\'');
        LIZ.append(", statsInterval='");
        LIZ.append(this.statsInterval);
        LIZ.append('\'');
        LIZ.append(", rtt='");
        LIZ.append(this.rtt);
        LIZ.append('\'');
        LIZ.append(", numChannels='");
        LIZ.append(this.numChannels);
        LIZ.append('\'');
        LIZ.append(", sentSampleRate='");
        LIZ.append(this.sentSampleRate);
        LIZ.append('\'');
        LIZ.append(", jitter='");
        LIZ.append(this.jitter);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public LocalAudioStats() {
    }

    public LocalAudioStats(InternalLocalAudioStats internalLocalAudioStats) {
        this.audioLossRate = internalLocalAudioStats.audioLossRate;
        this.sendKBitrate = internalLocalAudioStats.sendKBitrate;
        this.recordSampleRate = internalLocalAudioStats.recordSampleRate;
        this.statsInterval = internalLocalAudioStats.statsInterval;
        this.rtt = internalLocalAudioStats.rtt;
        this.numChannels = internalLocalAudioStats.numChannels;
        this.sentSampleRate = internalLocalAudioStats.sentSampleRate;
        this.jitter = internalLocalAudioStats.jitter;
    }
}
