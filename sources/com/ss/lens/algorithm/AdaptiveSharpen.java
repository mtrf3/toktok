package com.ss.lens.algorithm;

import X.C16880lQ;

/* loaded from: classes7.dex */
public class AdaptiveSharpen {
    public static boolean isLibLoaded;
    public long mNativePtr;

    private native int nativeAdaptiveSharpenProcess(long j, int i, int i2, int i3, float[] fArr, boolean z, int i4, float f, float f2, float f3, int i5);

    private native int nativeGetAdaptiveSharpenOutput(long j);

    private native long nativeInitAdaptiveSharpen(boolean z, int i, int i2, int i3);

    private native void nativeReleaseAdaptiveSharpen(long j);

    public int GetAdaptiveSharpenOutput() {
        long j = this.mNativePtr;
        if (j == 0) {
            return -1;
        }
        return nativeGetAdaptiveSharpenOutput(j);
    }

    public void ReleaseAdaptiveSharpen() {
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        nativeReleaseAdaptiveSharpen(j);
    }

    public synchronized boolean InitAdaptiveSharpen(boolean z, int i, int i2, int i3) {
        if (!isLibLoaded) {
            try {
                C16880lQ.LLJJJIL("c++_shared");
                C16880lQ.LLJJJIL("bytenn");
                C16880lQ.LLJJJIL("fastcv");
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            try {
                C16880lQ.LLJJJIL("lens");
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
                return false;
            }
        }
        long nativeInitAdaptiveSharpen = nativeInitAdaptiveSharpen(z, i, i2, i3);
        this.mNativePtr = nativeInitAdaptiveSharpen;
        if (nativeInitAdaptiveSharpen == 0) {
            return false;
        }
        return true;
    }

    public int AdaptiveSharpenProcess(int i, int i2, int i3, boolean z, int i4, float f, float f2, float f3, int i5) {
        long j = this.mNativePtr;
        if (j == 0 || i2 <= 0 || i3 <= 0) {
            return -1;
        }
        return nativeAdaptiveSharpenProcess(j, i, i2, i3, null, z, i4, f, f2, f3, i5);
    }

    public int AdaptiveSharpenOesProcess(int i, int i2, int i3, float[] fArr, boolean z, int i4, float f, float f2, float f3, int i5) {
        long j = this.mNativePtr;
        if (j == 0 || i2 <= 0 || i3 <= 0) {
            return -1;
        }
        return nativeAdaptiveSharpenProcess(j, i, i2, i3, fArr, z, i4, f, f2, f3, i5);
    }
}
