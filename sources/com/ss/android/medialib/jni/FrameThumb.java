package com.ss.android.medialib.jni;

import com.ss.android.ttve.nativePort.TENativeLibsLoader;

/* loaded from: classes7.dex */
public class FrameThumb {
    public long handle = nativeCreate();

    private native long nativeCreate();

    private native int[] nativeGetOldFrameThumbnail(long j, int i, int i2);

    private native int[] nativeInitVideoToGraph(long j, String str, int i, int i2, boolean z);

    private native int nativeStart(long j);

    private native void nativeStop(long j);

    private native void nativeStopGetFrameThumbnail(long j);

    private native int nativeUninitVideoToGraph(long j);

    public synchronized int start() {
        int nativeStart;
        long j = this.handle;
        if (j != 0) {
            nativeStart = nativeStart(j);
        } else {
            nativeStart = -1;
        }
        return nativeStart;
    }

    public synchronized void stop() {
        long j = this.handle;
        if (j != 0) {
            nativeStop(j);
        }
    }

    public void stopGetFrameThumbnail() {
        nativeStopGetFrameThumbnail(this.handle);
    }

    public int unInitVideoToGraph() {
        int nativeUninitVideoToGraph;
        long j = this.handle;
        if (j == 0) {
            return -1;
        }
        nativeStopGetFrameThumbnail(j);
        synchronized (this) {
            nativeUninitVideoToGraph = nativeUninitVideoToGraph(this.handle);
            this.handle = 0L;
        }
        return nativeUninitVideoToGraph;
    }

    static {
        TENativeLibsLoader.loadRecorder();
    }

    public int[] getFrameThumbnail(int i) {
        return getFrameThumbnail(i, 1);
    }

    public int[] initVideoToGraph(String str) {
        return initVideoToGraph(str, -1, -1);
    }

    public synchronized int[] getFrameThumbnail(int i, int i2) {
        long j = this.handle;
        if (j == 0) {
            return null;
        }
        return nativeGetOldFrameThumbnail(j, i, i2);
    }

    public synchronized int[] initVideoToGraph(String str, int i, int i2) {
        return initVideoToGraph(str, i, i2, false);
    }

    public synchronized int[] initVideoToGraph(String str, int i, int i2, boolean z) {
        long j = this.handle;
        if (j == 0) {
            int[] iArr = new int[9];
            iArr[0] = -10000;
            return iArr;
        }
        return nativeInitVideoToGraph(j, str, i, i2, z);
    }
}
