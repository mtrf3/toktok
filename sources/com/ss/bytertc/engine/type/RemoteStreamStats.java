package com.ss.bytertc.engine.type;

import X.X1D;
import com.ss.bytertc.engine.InternalRemoteStreamStats;

/* loaded from: classes33.dex */
public class RemoteStreamStats {
    public RemoteAudioStats audioStats;
    public boolean isScreen;
    public int rxQuality;
    public int txQuality;
    public String uid;
    public RemoteVideoStats videoStats;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RemoteStreamStats{uid='");
        LIZ.append(this.uid);
        LIZ.append('\'');
        LIZ.append(", audioStats=");
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

    public RemoteStreamStats() {
    }

    public RemoteStreamStats(InternalRemoteStreamStats internalRemoteStreamStats) {
        RemoteAudioStats remoteAudioStats = new RemoteAudioStats(internalRemoteStreamStats.audioStats);
        RemoteVideoStats remoteVideoStats = new RemoteVideoStats(internalRemoteStreamStats.videoStats);
        this.audioStats = remoteAudioStats;
        this.videoStats = remoteVideoStats;
        this.uid = internalRemoteStreamStats.uid;
        this.isScreen = internalRemoteStreamStats.isScreen;
        this.rxQuality = internalRemoteStreamStats.rxQuality;
        this.txQuality = internalRemoteStreamStats.txQuality;
    }
}
