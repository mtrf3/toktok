package com.ss.ttlivestreamer.core.utils;

import X.X1D;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class VideoFrameStatics {
    public final int mEstRateStatisticsType;
    public List<Long> mList;
    public long mNativeStatics;
    public final int mWinMs;

    private native long nativeCreate();

    private native double nativeGetFrameRate(long j);

    private native void nativeRelease(long j);

    private native void nativeUpdate(long j, int i);

    public synchronized void release() {
        long j = this.mNativeStatics;
        if (j != 0) {
            nativeRelease(j);
            this.mNativeStatics = 0L;
        }
    }

    private void update() {
        if (!this.mList.isEmpty()) {
            Long valueOf = Long.valueOf(System.currentTimeMillis() - this.mWinMs);
            while (!this.mList.isEmpty()) {
                Long l = (Long) ListProtector.get(this.mList, 0);
                if (l.longValue() < valueOf.longValue()) {
                    this.mList.remove(l);
                } else {
                    return;
                }
            }
        }
    }

    public void add() {
        if (this.mEstRateStatisticsType == 2) {
            long j = this.mNativeStatics;
            if (j != 0) {
                nativeUpdate(j, 1);
                return;
            }
        }
        synchronized (this.mList) {
            update();
            this.mList.add(Long.valueOf(System.currentTimeMillis()));
        }
    }

    public float getRealRatePerSecond() {
        if (this.mEstRateStatisticsType == 2) {
            long j = this.mNativeStatics;
            if (j != 0) {
                return (float) nativeGetFrameRate(j);
            }
        }
        synchronized (this.mList) {
            update();
            if (this.mList.isEmpty()) {
                return 0.0f;
            }
            if (this.mEstRateStatisticsType == 1) {
                return (this.mList.size() * 1000.0f) / this.mWinMs;
            }
            Long l = this.mList.get(0);
            List<Long> list = this.mList;
            Long valueOf = Long.valueOf(list.get(list.size() - 1).longValue() - l.longValue());
            if (valueOf.longValue() == 0) {
                return 0.0f;
            }
            return (this.mList.size() * 1000.0f) / ((float) valueOf.longValue());
        }
    }

    public void finalize() {
        release();
    }

    public VideoFrameStatics(int i) {
        this(i, 1);
    }

    public VideoFrameStatics(int i, int i2) {
        this.mList = new ArrayList();
        this.mWinMs = i;
        this.mEstRateStatisticsType = i2;
        if (i2 == 2) {
            this.mNativeStatics = nativeCreate();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("using EstRateStatisticsType:");
        LIZ.append(i2);
        AVLog.ioe("VideoFrameStatics", X1D.LIZIZ(LIZ));
    }
}
