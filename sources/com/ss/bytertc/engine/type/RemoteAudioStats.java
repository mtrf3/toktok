package com.ss.bytertc.engine.type;

import X.X1D;
import com.ss.bytertc.engine.InternalRemoteAudioStats;

/* loaded from: classes33.dex */
public class RemoteAudioStats {
    public float audioLossRate;
    public int concealedSamples;
    public int concealmentEvent;
    public int decDuration;
    public int decSampleRate;
    public long e2eDelay;
    public int frozenRate;
    public int jitter;
    public int jitterBufferDelay;
    public int numChannels;
    public int playoutSampleRate;
    public int quality;
    public float receivedKBitrate;
    public int receivedSampleRate;
    public int rtt;
    public int stallCount;
    public int stallDuration;
    public int statsInterval;
    public int totalRtt;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RemoteAudioStats{audioLossRate='");
        LIZ.append(this.audioLossRate);
        LIZ.append('\'');
        LIZ.append(", receivedKBitrate='");
        LIZ.append(this.receivedKBitrate);
        LIZ.append('\'');
        LIZ.append(", stallCount='");
        LIZ.append(this.stallCount);
        LIZ.append('\'');
        LIZ.append(", stallDuration='");
        LIZ.append(this.stallDuration);
        LIZ.append('\'');
        LIZ.append(", playoutSampleRate='");
        LIZ.append(this.playoutSampleRate);
        LIZ.append('\'');
        LIZ.append(", e2eDelay='");
        LIZ.append(this.e2eDelay);
        LIZ.append('\'');
        LIZ.append(", rtt='");
        LIZ.append(this.rtt);
        LIZ.append('\'');
        LIZ.append(", quality='");
        LIZ.append(this.quality);
        LIZ.append('\'');
        LIZ.append(", jitterBufferDelay='");
        LIZ.append(this.jitterBufferDelay);
        LIZ.append('\'');
        LIZ.append(", numChannels='");
        LIZ.append(this.numChannels);
        LIZ.append('\'');
        LIZ.append(", receivedSampleRate='");
        LIZ.append(this.receivedSampleRate);
        LIZ.append('\'');
        LIZ.append(", frozenRate='");
        LIZ.append(this.frozenRate);
        LIZ.append('\'');
        LIZ.append(", concealedSamples='");
        LIZ.append(this.concealedSamples);
        LIZ.append('\'');
        LIZ.append(", concealmentEvent='");
        LIZ.append(this.concealmentEvent);
        LIZ.append('\'');
        LIZ.append(", decSampleRate='");
        LIZ.append(this.decSampleRate);
        LIZ.append('\'');
        LIZ.append(", decDuration='");
        LIZ.append(this.decDuration);
        LIZ.append('\'');
        LIZ.append(", total_rtt='");
        LIZ.append(this.totalRtt);
        LIZ.append('\'');
        LIZ.append(", jitter='");
        LIZ.append(this.jitter);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public RemoteAudioStats() {
    }

    public RemoteAudioStats(InternalRemoteAudioStats internalRemoteAudioStats) {
        this.audioLossRate = internalRemoteAudioStats.audioLossRate;
        this.receivedKBitrate = internalRemoteAudioStats.receivedKBitrate;
        this.stallCount = internalRemoteAudioStats.stallCount;
        this.stallDuration = internalRemoteAudioStats.stallDuration;
        this.e2eDelay = internalRemoteAudioStats.e2eDelay;
        this.playoutSampleRate = internalRemoteAudioStats.playoutSampleRate;
        this.statsInterval = internalRemoteAudioStats.statsInterval;
        this.rtt = internalRemoteAudioStats.rtt;
        this.totalRtt = internalRemoteAudioStats.totalRtt;
        this.quality = internalRemoteAudioStats.quality;
        this.jitterBufferDelay = internalRemoteAudioStats.jitterBufferDelay;
        this.numChannels = internalRemoteAudioStats.numChannels;
        this.receivedSampleRate = internalRemoteAudioStats.receivedSampleRate;
        this.frozenRate = internalRemoteAudioStats.frozenRate;
        this.concealedSamples = internalRemoteAudioStats.concealedSamples;
        this.concealmentEvent = internalRemoteAudioStats.concealmentEvent;
        this.decSampleRate = internalRemoteAudioStats.decSampleRate;
        this.decDuration = internalRemoteAudioStats.decDuration;
        this.jitter = internalRemoteAudioStats.jitter;
    }
}
