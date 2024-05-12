package com.ss.lens.algorithm;

import X.C16880lQ;

/* loaded from: classes7.dex */
public class VideoOCLSR {
    public static boolean isLibLoaded;
    public static LibLoaderListener mLoaderListener;
    public long mNativePtr;

    /* loaded from: classes7.dex */
    public interface LibLoaderListener {
        boolean onLoader(String str);
    }

    private native int nativeGetVideoOclSrOutput(long j);

    private native long nativeInitVideoOclSr(String str, int i, boolean z, boolean z2, int i2, int i3);

    private native void nativeReleaseVideoOclSr(long j);

    private native int nativeVideoOclSrOesProcess(long j, int i, int i2, int i3, float[] fArr, boolean z);

    private native int nativeVideoOclSrProcess(long j, int i, int i2, int i3, boolean z);

    public int GetVideoOclSrOutput() {
        long j = this.mNativePtr;
        if (j == 0) {
            return -1;
        }
        return nativeGetVideoOclSrOutput(j);
    }

    public void ReleaseVideoOclSr() {
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        nativeReleaseVideoOclSr(j);
    }

    public static synchronized void setOutLoader(LibLoaderListener libLoaderListener) {
        synchronized (VideoOCLSR.class) {
            mLoaderListener = libLoaderListener;
        }
    }

    public synchronized boolean InitVideoOclSr(String str, int i, boolean z) {
        if (!isLibLoaded) {
            try {
                LibLoaderListener libLoaderListener = mLoaderListener;
                if (libLoaderListener != null) {
                    libLoaderListener.onLoader("c++_shared");
                    mLoaderListener.onLoader("fastcv");
                    mLoaderListener.onLoader("bytenn");
                } else {
                    C16880lQ.LLJJJIL("c++_shared");
                    C16880lQ.LLJJJIL("fastcv");
                    C16880lQ.LLJJJIL("bytenn");
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            try {
                LibLoaderListener libLoaderListener2 = mLoaderListener;
                if (libLoaderListener2 != null) {
                    if (!libLoaderListener2.onLoader("lens")) {
                        return false;
                    }
                } else {
                    C16880lQ.LLJJJIL("lens");
                }
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
                return false;
            }
        }
        if (str.isEmpty()) {
            return false;
        }
        long nativeInitVideoOclSr = nativeInitVideoOclSr(str, i, z, true, 720, 1440);
        this.mNativePtr = nativeInitVideoOclSr;
        if (nativeInitVideoOclSr != 0) {
            return true;
        }
        return false;
    }

    public int VideoOclSrProcess(int i, int i2, int i3, boolean z) {
        long j = this.mNativePtr;
        if (j == 0 || i2 <= 0 || i3 <= 0) {
            return -1;
        }
        return nativeVideoOclSrProcess(j, i, i2, i3, z);
    }

    public synchronized boolean InitVideoOclSr(String str, int i, boolean z, int i2, int i3) {
        if (!isLibLoaded) {
            try {
                LibLoaderListener libLoaderListener = mLoaderListener;
                if (libLoaderListener != null) {
                    libLoaderListener.onLoader("c++_shared");
                    mLoaderListener.onLoader("fastcv");
                    mLoaderListener.onLoader("bytenn");
                } else {
                    C16880lQ.LLJJJIL("c++_shared");
                    C16880lQ.LLJJJIL("fastcv");
                    C16880lQ.LLJJJIL("bytenn");
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            try {
                LibLoaderListener libLoaderListener2 = mLoaderListener;
                if (libLoaderListener2 != null) {
                    if (!libLoaderListener2.onLoader("lens")) {
                        return false;
                    }
                } else {
                    C16880lQ.LLJJJIL("lens");
                }
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
                return false;
            }
        }
        if (str.isEmpty()) {
            return false;
        }
        long nativeInitVideoOclSr = nativeInitVideoOclSr(str, i, z, true, i2, i3);
        this.mNativePtr = nativeInitVideoOclSr;
        if (nativeInitVideoOclSr != 0) {
            return true;
        }
        return false;
    }

    public int VideoOclSrOesProcess(int i, int i2, int i3, float[] fArr, boolean z) {
        long j = this.mNativePtr;
        if (j == 0 || i2 <= 0 || i3 <= 0) {
            return -1;
        }
        return nativeVideoOclSrOesProcess(j, i, i2, i3, fArr, z);
    }

    public synchronized boolean InitVideoOclSr(String str, int i, boolean z, boolean z2, int i2, int i3) {
        if (!isLibLoaded) {
            try {
                LibLoaderListener libLoaderListener = mLoaderListener;
                if (libLoaderListener != null) {
                    libLoaderListener.onLoader("c++_shared");
                    mLoaderListener.onLoader("fastcv");
                    mLoaderListener.onLoader("bytenn");
                } else {
                    C16880lQ.LLJJJIL("c++_shared");
                    C16880lQ.LLJJJIL("fastcv");
                    C16880lQ.LLJJJIL("bytenn");
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            try {
                LibLoaderListener libLoaderListener2 = mLoaderListener;
                if (libLoaderListener2 != null) {
                    if (!libLoaderListener2.onLoader("lens")) {
                        return false;
                    }
                } else {
                    C16880lQ.LLJJJIL("lens");
                }
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
                return false;
            }
        }
        if (str.isEmpty()) {
            return false;
        }
        long nativeInitVideoOclSr = nativeInitVideoOclSr(str, i, z, z2, i2, i3);
        this.mNativePtr = nativeInitVideoOclSr;
        if (nativeInitVideoOclSr != 0) {
            return true;
        }
        return false;
    }
}
