package com.ss.lens.algorithm;

import X.C16880lQ;

/* loaded from: classes7.dex */
public class VideoNNSR {
    public long mNativePtr;

    private native int nativeGetVideoNNSrOutput(long j);

    private native long nativeInitVideoNNSr(int i, int i2, String str, String str2, String str3, boolean z);

    private native void nativeReleaseVideoNNSr(long j);

    private native int nativeVideoNNSrOesProcess(long j, int i, float[] fArr, boolean z);

    private native int nativeVideoNNSrProcess(long j, int i, boolean z);

    static {
        try {
            C16880lQ.LLJJJIL("c++_shared");
            C16880lQ.LLJJJIL("fastcv");
            C16880lQ.LLJJJIL("bytenn");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
        try {
            C16880lQ.LLJJJIL("lens");
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
    }

    public int GetVideoNNSrOutput() {
        long j = this.mNativePtr;
        if (j == 0) {
            return -1;
        }
        return nativeGetVideoNNSrOutput(j);
    }

    public void ReleaseVideoNNSr() {
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        nativeReleaseVideoNNSr(j);
    }

    public int VideoNNSrProcess(int i, boolean z) {
        long j = this.mNativePtr;
        if (j == 0) {
            return -1;
        }
        return nativeVideoNNSrProcess(j, i, z);
    }

    public int VideoNNSrOesProcess(int i, float[] fArr, boolean z) {
        long j = this.mNativePtr;
        if (j == 0) {
            return -1;
        }
        return nativeVideoNNSrOesProcess(j, i, fArr, z);
    }

    public boolean InitVideoNNSr(int i, int i2, String str, String str2, String str3, boolean z) {
        if (i <= 0 || i2 <= 0 || str.isEmpty() || str2.isEmpty() || str3.isEmpty()) {
            return false;
        }
        long nativeInitVideoNNSr = nativeInitVideoNNSr(i, i2, str, str2, str3, z);
        this.mNativePtr = nativeInitVideoNNSr;
        if (nativeInitVideoNNSr == 0) {
            return false;
        }
        return true;
    }
}
