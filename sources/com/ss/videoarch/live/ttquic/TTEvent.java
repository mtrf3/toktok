package com.ss.videoarch.live.ttquic;

import X.Q89;
import X.X1D;
import android.os.Bundle;
import defpackage.b0;

/* loaded from: classes15.dex */
public class TTEvent {
    public int audioCachedNum;
    public int audioInitSectionCached;
    public Bundle bundle;
    public long cacheDuration;
    public int cacheFrameCount;
    public int cacheMode;
    public long cacheReadBytes;
    public int cacheSize;
    public long cacheWriteBytes;
    public long cancelCostTime;
    public int code;
    public String error;
    public int mode;
    public int optCancelTask;
    public int preloadNum;
    public int subCode;
    public String url;
    public int videoCachedNum;
    public int videoInitSectionCached;
    public int what;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTEvent{what=");
        LIZ.append(this.what);
        LIZ.append(", url='");
        Q89.LIZIZ(LIZ, this.url, '\'', ", error='");
        Q89.LIZIZ(LIZ, this.error, '\'', ", code=");
        LIZ.append(this.code);
        LIZ.append(", subCode=");
        LIZ.append(this.subCode);
        LIZ.append(", preloadNum=");
        LIZ.append(this.preloadNum);
        LIZ.append(", videoCachedNum=");
        LIZ.append(this.videoCachedNum);
        LIZ.append(", audioCachedNum=");
        LIZ.append(this.audioCachedNum);
        LIZ.append(", videoInitSectionCached=");
        LIZ.append(this.videoInitSectionCached);
        LIZ.append(", audioInitSectionCached=");
        LIZ.append(this.audioInitSectionCached);
        LIZ.append(", cacheReadBytes=");
        LIZ.append(this.cacheReadBytes);
        LIZ.append(", cacheWriteBytes=");
        LIZ.append(this.cacheWriteBytes);
        LIZ.append(", cacheMode=");
        LIZ.append(this.cacheMode);
        LIZ.append(", cacheFrameCount=");
        LIZ.append(this.cacheFrameCount);
        LIZ.append(", cacheDuration=");
        LIZ.append(this.cacheDuration);
        LIZ.append(", cacheSize=");
        LIZ.append(this.cacheSize);
        LIZ.append(", cancelCostTime=");
        LIZ.append(this.cancelCostTime);
        LIZ.append(", mode=");
        LIZ.append(this.mode);
        LIZ.append(", optCancelTask=");
        return b0.LIZJ(LIZ, this.optCancelTask, '}', LIZ);
    }
}
