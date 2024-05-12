package com.ss.ttlivestreamer.livestreamv2.log;

/* loaded from: classes12.dex */
public class LiveStreamConnectResultEventResult {
    public int mConnectSuccess;
    public int mRetryCount;
    public int mStreamRetryCount;

    public LiveStreamConnectResultEventResult(int i, int i2, int i3) {
        this.mConnectSuccess = i;
        this.mRetryCount = i2;
        this.mStreamRetryCount = i3;
    }
}
