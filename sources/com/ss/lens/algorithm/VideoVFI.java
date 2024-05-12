package com.ss.lens.algorithm;

import X.C16880lQ;

/* loaded from: classes7.dex */
public class VideoVFI {
    public static boolean isLibLoaded;
    public long mNativePtr;

    private native int nativeGetVideoVFIOutput(long j);

    private native long nativeInitVideoVFI(String str, int i, int i2, int i3, boolean z);

    private native void nativeReleaseVideoVFI(long j);

    private native int nativeVideoVFIOesProcess(long j, int i, int i2, int i3, int i4, int i5, float f, float[] fArr, boolean z);

    private native int nativeVideoVFIProcess(long j, int i, int i2, int i3, int i4, int i5, float f, boolean z);

    public int GetVideoVFIOutput() {
        long j = this.mNativePtr;
        if (j == 0) {
            return -1;
        }
        return nativeGetVideoVFIOutput(j);
    }

    public void ReleaseVideoVFI() {
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        nativeReleaseVideoVFI(j);
    }

    public synchronized boolean InitVideoVFI(String str, int i, int i2, int i3, boolean z) {
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
        if (str.isEmpty()) {
            return false;
        }
        long nativeInitVideoVFI = nativeInitVideoVFI(str, i, i2, i3, z);
        this.mNativePtr = nativeInitVideoVFI;
        if (nativeInitVideoVFI != 0) {
            return true;
        }
        return false;
    }

    public int VideoVFIProcess(int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        long j = this.mNativePtr;
        if (j == 0 || i3 <= 0 || i4 <= 0) {
            return -1;
        }
        return nativeVideoVFIProcess(j, i, i2, i3, i4, i5, f, z);
    }

    public int VideoVFIOesProcess(int i, int i2, int i3, int i4, int i5, float f, float[] fArr, boolean z) {
        long j = this.mNativePtr;
        if (j == 0 || i3 <= 0 || i4 <= 0) {
            return -1;
        }
        return nativeVideoVFIOesProcess(j, i, i2, i3, i4, i5, f, fArr, z);
    }
}
