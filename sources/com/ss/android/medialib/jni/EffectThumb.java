package com.ss.android.medialib.jni;

import X.C16880lQ;
import X.InterfaceC43682HCk;
import com.ss.android.medialib.model.CoverInfo;
import com.ss.android.medialib.player.EffectConfig;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class EffectThumb {
    public long handle = nativeCreate();
    public List<CoverInfo> mCovers = new ArrayList();
    public int mMaxSize;
    public float mSpeed;
    public long mTrimIn;
    public long mTrimOut;
    public boolean stopped;
    public InterfaceC43682HCk thumbListener;

    private native long nativeCreate();

    private native long nativeGetDuration(long j);

    private native int nativeInit(long j, String str);

    private native int nativeRenderVideo(long j, long[] jArr, EffectConfig effectConfig, int i, int i2);

    private native void nativeStop(long j);

    public CoverInfo getThumb() {
        return null;
    }

    public void setThumbListener(InterfaceC43682HCk interfaceC43682HCk) {
    }

    public synchronized void stopRender() {
        long j = this.handle;
        if (j == 0) {
            return;
        }
        this.stopped = true;
        nativeStop(j);
        this.handle = 0L;
    }

    public long getDuration() {
        return ((float) (this.mTrimOut - this.mTrimIn)) / this.mSpeed;
    }

    public long getSourceVideoDuration() {
        long j = this.handle;
        if (j == 0) {
            return -1L;
        }
        return nativeGetDuration(j);
    }

    public void finalize() {
        stopRender();
        super.finalize();
    }

    static {
        TENativeLibsLoader.loadOldEditor();
    }

    public CoverInfo getThumb(int i) {
        if (i < 0 || i >= this.mMaxSize || this.mCovers == null) {
            return null;
        }
        while (!this.stopped) {
            synchronized (this) {
                if (this.mCovers.size() <= i) {
                    try {
                        wait(10L);
                    } catch (InterruptedException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                if (this.mCovers.size() > i) {
                    CoverInfo coverInfo = this.mCovers.get(i);
                    this.mCovers.set(i, null);
                    return coverInfo;
                }
            }
        }
        return null;
    }

    public int init(String str) {
        long j = this.handle;
        if (j == 0) {
            return -1;
        }
        int nativeInit = nativeInit(j, str);
        if (nativeInit >= 0) {
            this.mTrimIn = 0L;
            this.mTrimOut = getSourceVideoDuration();
            this.mSpeed = 1.0f;
        }
        return nativeInit;
    }

    public void onThumb(int[] iArr, int i, int i2) {
        CoverInfo coverInfo = new CoverInfo(i, i2, iArr);
        synchronized (this) {
            if (!this.stopped) {
                this.mCovers.add(coverInfo);
                notify();
            }
        }
    }

    public int init(String str, long j, long j2, float f) {
        long j3 = this.handle;
        if (j3 == 0) {
            return -1;
        }
        int nativeInit = nativeInit(j3, str);
        if (nativeInit >= 0) {
            this.mTrimIn = j;
            this.mTrimOut = j2;
            this.mSpeed = f;
        }
        return nativeInit;
    }

    public int renderVideo(long[] jArr, EffectConfig effectConfig, int i, int i2) {
        if (this.handle == 0) {
            return -1;
        }
        this.mMaxSize = jArr.length;
        for (int i3 = 0; i3 < jArr.length; i3++) {
            jArr[i3] = (((float) jArr[i3]) * this.mSpeed) + this.mTrimIn;
        }
        return nativeRenderVideo(this.handle, jArr, effectConfig, i, i2);
    }

    public int renderVideo(long j, EffectConfig effectConfig, int i, int i2) {
        long j2 = this.handle;
        if (j2 == 0) {
            return -1;
        }
        this.mMaxSize = 1;
        return nativeRenderVideo(j2, new long[]{(((float) j) * this.mSpeed) + this.mTrimIn}, effectConfig, i, i2);
    }
}
