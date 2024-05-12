package com.bytedance.realx.video.memory;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes33.dex */
public class RefObject {
    public final AtomicInteger refCount = new AtomicInteger(1);
    public final Runnable releaseCallback;

    public boolean hasReleaseCallback() {
        if (this.releaseCallback != null) {
            return true;
        }
        return false;
    }

    public void release() {
        Runnable runnable;
        if (this.refCount.decrementAndGet() == 0 && (runnable = this.releaseCallback) != null) {
            runnable.run();
        }
    }

    public void retain() {
        this.refCount.incrementAndGet();
    }

    public RefObject(Runnable runnable) {
        this.releaseCallback = runnable;
    }
}
