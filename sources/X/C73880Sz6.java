package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Sz6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73880Sz6<T> extends AbstractRunnableC73881Sz7<T> {
    public static final long serialVersionUID = -7139995637533111443L;
    public final AtomicInteger LJLJL;

    @Override // X.AbstractRunnableC73881Sz7
    public final void LIZ() {
        T andSet = getAndSet(null);
        if (andSet != null) {
            this.LJLIL.onNext(andSet);
        }
        if (this.LJLJL.decrementAndGet() == 0) {
            this.LJLIL.onComplete();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (this.LJLJL.incrementAndGet() == 2) {
                T andSet = getAndSet(null);
                if (andSet != null) {
                    this.LJLIL.onNext(andSet);
                }
                if (this.LJLJL.decrementAndGet() == 0) {
                    this.LJLIL.onComplete();
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public C73880Sz6(C73844SyW c73844SyW, long j, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        super(c73844SyW, j, timeUnit, abstractC73946T0k);
        this.LJLJL = new AtomicInteger(1);
    }
}
