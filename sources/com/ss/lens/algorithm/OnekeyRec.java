package com.ss.lens.algorithm;

import X.C16880lQ;

/* loaded from: classes7.dex */
public class OnekeyRec {
    public static boolean isLibLoaded;
    public long mNativePtr;

    private native int nativeGetOnekeyRecOutput(long j);

    private native long nativeInitOnekeyRec(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2);

    private native int nativeOnekeyRecProcess(long j, int i, int i2, int i3, float[] fArr, boolean z);

    private native void nativeReleaseOnekeyRec(long j);

    public int GetOnekeyRecOutput() {
        long j = this.mNativePtr;
        if (j == 0) {
            return -1;
        }
        return nativeGetOnekeyRecOutput(j);
    }

    public void ReleaseOnekeyRec() {
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        nativeReleaseOnekeyRec(j);
    }

    public int OnekeyRecProcess(int i, int i2, int i3, float[] fArr, boolean z) {
        long j = this.mNativePtr;
        if (j == 0 || i2 <= 0 || i3 <= 0) {
            return -1;
        }
        return nativeOnekeyRecProcess(j, i, i2, i3, fArr, z);
    }

    public synchronized boolean InitOnekeyRec(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2) {
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
        long nativeInitOnekeyRec = nativeInitOnekeyRec(str, z, z2, z3, z4, z5, z6, i, i2);
        this.mNativePtr = nativeInitOnekeyRec;
        if (nativeInitOnekeyRec != 0) {
            return true;
        }
        return false;
    }
}
