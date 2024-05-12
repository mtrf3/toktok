package com.ss.ttm.player;

/* loaded from: classes9.dex */
public class NativeObject {
    public long LIZ;
    public boolean LIZIZ;

    private native void nativeRelease(long j);

    public final synchronized void LIZ() {
        if (this.LIZIZ) {
            long j = this.LIZ;
            if (j != 0) {
                nativeRelease(j);
                this.LIZ = 0L;
            }
        }
    }

    public final void finalize() {
    }

    private long getNativeObj() {
        return this.LIZ;
    }

    public void setNativeObj(long j) {
        this.LIZ = j;
        this.LIZIZ = true;
    }
}
