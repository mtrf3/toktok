package com.bytedance.vcloud.abrmodule;

/* loaded from: classes9.dex */
public class ABRResultElement {
    public long bitrate;
    public int cacheTime;
    public int mediaType;
    public int onceSelectType;
    public int seconds;
    public int useSR;

    public long getBitrate() {
        return this.bitrate;
    }

    public int getCacheTime() {
        return this.cacheTime;
    }

    public int getMediaType() {
        return this.mediaType;
    }

    public int getOnceSelectType() {
        return this.onceSelectType;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public int getUseSR() {
        return this.useSR;
    }

    public ABRResultElement(long j, int i, int i2, int i3) {
        this.bitrate = j;
        this.seconds = i;
        this.mediaType = i2;
        this.cacheTime = i3;
    }

    public ABRResultElement(long j, int i, int i2, int i3, int i4) {
        this.bitrate = j;
        this.seconds = i;
        this.mediaType = i2;
        this.cacheTime = i3;
        this.useSR = i4;
    }

    public ABRResultElement(long j, int i, int i2, int i3, int i4, int i5) {
        this.bitrate = j;
        this.seconds = i;
        this.mediaType = i2;
        this.cacheTime = i3;
        this.useSR = i4;
        this.onceSelectType = i5;
    }
}
