package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.SxS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73778SxS<T> extends AbstractRunnableC73776SxQ<T> {
    public static final long serialVersionUID = -7139995637533111443L;
    public final AtomicInteger LJLJLJ;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (this.LJLJLJ.incrementAndGet() == 2) {
                LIZJ();
                if (this.LJLJLJ.decrementAndGet() == 0) {
                    this.LJLIL.onComplete();
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // X.AbstractRunnableC73776SxQ
    public final void LIZIZ() {
        LIZJ();
        if (this.LJLJLJ.decrementAndGet() == 0) {
            this.LJLIL.onComplete();
        }
    }

    public C73778SxS(C73843SyV c73843SyV, long j, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        super(c73843SyV, j, timeUnit, abstractC73946T0k);
        this.LJLJLJ = new AtomicInteger(1);
    }
}
