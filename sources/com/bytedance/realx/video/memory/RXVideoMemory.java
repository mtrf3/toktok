package com.bytedance.realx.video.memory;

import com.bytedance.realx.base.RefCounted;
import com.bytedance.realx.video.RXVideoMemoryType;
import com.bytedance.realx.video.RXVideoRotation;
import com.bytedance.realx.video.memory.RXVideoMemory;

/* loaded from: classes33.dex */
public abstract class RXVideoMemory implements RefCounted {
    public RefObject refCounted = new RefObject(new Runnable() { // from class: X.ZV5
        @Override // java.lang.Runnable
        public final void run() {
            RXVideoMemory.this.lambda$new$0();
        }
    });
    public Runnable releaseCallback;

    public abstract int getHeight();

    public abstract RXVideoMemoryType getMemoryType();

    public abstract RXVideoRotation getRotation();

    public abstract int getWidth();

    public synchronized boolean hasReleaseCallback() {
        boolean z;
        if (this.releaseCallback == null) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    @Override // com.bytedance.realx.base.RefCounted
    public synchronized void release() {
        this.refCounted.release();
    }

    @Override // com.bytedance.realx.base.RefCounted
    public synchronized void retain() {
        this.refCounted.retain();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        Runnable runnable = this.releaseCallback;
        if (runnable != null) {
            runnable.run();
        }
    }

    public synchronized void setReleaseCallback(Runnable runnable) {
        this.releaseCallback = runnable;
    }
}
