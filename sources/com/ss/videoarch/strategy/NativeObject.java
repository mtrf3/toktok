package com.ss.videoarch.strategy;

/* loaded from: classes15.dex */
public class NativeObject {
    public long mNativeObj;

    private native void nativeRelease(long j);

    public synchronized void release() {
        long j = this.mNativeObj;
        if (j != 0) {
            nativeRelease(j);
            this.mNativeObj = 0L;
        }
    }

    public void finalize() {
        if (this.mNativeObj != 0) {
            release();
        }
    }

    private long getNativeObj() {
        return this.mNativeObj;
    }

    public void setNativeObj(long j) {
        this.mNativeObj = j;
    }
}
