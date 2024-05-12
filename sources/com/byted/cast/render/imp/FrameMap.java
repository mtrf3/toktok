package com.byted.cast.render.imp;

import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes29.dex */
public final class FrameMap {
    public final AtomicLongArray mFakeFrameHashMap = new AtomicLongArray(4096);

    public final long find(long j) {
        return this.mFakeFrameHashMap.getAndSet((int) (j & 4095), -1L);
    }

    public final long findOnly(long j) {
        return this.mFakeFrameHashMap.get((int) (j & 4095));
    }

    public final void put(long j, long j2) {
        this.mFakeFrameHashMap.set((int) (j & 4095), j2);
    }
}
