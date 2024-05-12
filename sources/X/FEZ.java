package X;

import defpackage.b0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes7.dex */
public final class FEZ implements InterfaceC38630FEc {
    public volatile int LIZ = -1;
    public final AtomicInteger LIZIZ = new AtomicInteger(0);
    public final ReentrantLock LIZJ;
    public final Condition LIZLLL;
    public volatile Throwable LJ;

    @Override // X.InterfaceC38630FEc
    public final void LIZ() {
        if (this.LIZ > 0) {
            int incrementAndGet = this.LIZIZ.incrementAndGet();
            if (incrementAndGet <= this.LIZ) {
                LIZIZ();
                if (incrementAndGet == this.LIZ) {
                    ReentrantLock reentrantLock = this.LIZJ;
                    reentrantLock.lock();
                    try {
                        this.LIZLLL.signalAll();
                        return;
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                return;
            }
            StringBuilder LJ = C7MY.LJ("created view count ", incrementAndGet, " is bigger than total view count ");
            throw new IllegalStateException(b0.LIZJ(LJ, this.LIZ, '.', LJ));
        }
        throw new IllegalStateException("Total view count <= 0.");
    }

    public final void LIZIZ() {
        Throwable th = this.LJ;
        if (th == null) {
        } else {
            throw new C38629FEb(th);
        }
    }

    public FEZ() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LIZJ = reentrantLock;
        this.LIZLLL = reentrantLock.newCondition();
    }
}
