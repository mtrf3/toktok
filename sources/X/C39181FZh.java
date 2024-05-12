package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;

/* renamed from: X.FZh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39181FZh extends ReentrantLock {
    public volatile boolean LJLIL;

    @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
    public boolean tryLock() {
        if (!this.LJLIL) {
            return super.tryLock();
        }
        return true;
    }

    @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
    public void unlock() {
        super.unlock();
        this.LJLIL = true;
    }

    @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
    public boolean tryLock(long j, TimeUnit unit) {
        o.LJIIIZ(unit, "unit");
        if (!this.LJLIL) {
            return super.tryLock(j, unit);
        }
        return true;
    }
}
