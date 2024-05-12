package com.ss.ttlivestreamer.livestreamv2.log;

/* loaded from: classes12.dex */
public class LiveStreamConnectResultEventSource extends LiveStreamEventTracker {
    public int mRtmpCode1;
    public int mRtmpCode2;
    public long mRtmpCode3;
    public String mRtmpMsg;
    public int mScene;

    public LiveStreamConnectResultEventSource(int i, int i2, int i3, long j, String str) {
        this.mScene = i;
        this.mRtmpCode1 = i2;
        this.mRtmpCode2 = i3;
        this.mRtmpCode3 = j;
        this.mRtmpMsg = str;
    }
}
