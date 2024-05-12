package com.ss.bytertc.engine.type;

import X.X1D;
import com.ss.bytertc.engine.InternalLocalStreamStats;

/* loaded from: classes33.dex */
public class LocalStreamStats {
    public LocalAudioStats audioStats;
    public boolean isScreen;
    public int rxQuality;
    public int txQuality;
    public LocalVideoStats videoStats;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocalStreamStats{audioStats=");
        LIZ.append(this.audioStats);
        LIZ.append(", videoStats=");
        LIZ.append(this.videoStats);
        LIZ.append(", isScreen=");
        LIZ.append(this.isScreen);
        LIZ.append(", txQuality=");
        LIZ.append(this.txQuality);
        LIZ.append(", rxQuality=");
        LIZ.append(this.rxQuality);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public LocalStreamStats() {
    }

    public LocalStreamStats(InternalLocalStreamStats internalLocalStreamStats) {
        LocalAudioStats localAudioStats = new LocalAudioStats(internalLocalStreamStats.audioStats);
        LocalVideoStats localVideoStats = new LocalVideoStats(internalLocalStreamStats.videoStats);
        this.audioStats = localAudioStats;
        this.videoStats = localVideoStats;
        this.isScreen = internalLocalStreamStats.isScreen;
        this.txQuality = internalLocalStreamStats.txQuality;
        this.rxQuality = internalLocalStreamStats.rxQuality;
    }
}
