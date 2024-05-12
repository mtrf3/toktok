package com.ss.bytertc.engine;

/* loaded from: classes33.dex */
public class SubChannelInfo {
    public String channelName;
    public double volumeScale;

    public String getChannelName() {
        return this.channelName;
    }

    public double getVolumeScale() {
        return this.volumeScale;
    }

    public SubChannelInfo(String str, double d) {
        this.channelName = str;
        this.volumeScale = d;
    }
}
