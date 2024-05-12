package X;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes16.dex */
public abstract class XN1 implements Closeable {
    public static final AtomicIntegerFieldUpdater<XN1> SHARED_LOCK_UPDATER = AtomicIntegerFieldUpdater.newUpdater(XN1.class, "sharedLock");
    public volatile int sharedLock;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.sharedLock == -1) {
                return;
            }
            if (SHARED_LOCK_UPDATER.compareAndSet(this, 0, -1)) {
                doClose();
                return;
            }
            throw new IllegalStateException("Attempt to close while in use");
        }
    }

    public abstract void doClose();

    public void storeFence() {
        this.sharedLock = 0;
    }

    public void acquireSharedLock() {
        int i;
        do {
            i = this.sharedLock;
            if (i >= 0) {
                if (i == Integer.MAX_VALUE) {
                    throw new IllegalStateException("Shared lock overflow");
                }
            } else {
                throw new IllegalStateException("Closed");
            }
        } while (!SHARED_LOCK_UPDATER.compareAndSet(this, i, i + 1));
    }

    public void releaseSharedLock() {
        int i;
        do {
            i = this.sharedLock;
            if (i >= 0) {
                if (i == 0) {
                    throw new IllegalStateException("Shared lock underflow");
                }
            } else {
                throw new IllegalStateException("Closed");
            }
        } while (!SHARED_LOCK_UPDATER.compareAndSet(this, i, i - 1));
    }
}
