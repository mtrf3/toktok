package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.Sz8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73882Sz8<T> extends AbstractRunnableC73881Sz7<T> {
    public static final long serialVersionUID = -7139995637533111443L;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.LJLIL.onNext(andSet);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // X.AbstractRunnableC73881Sz7
    public final void LIZ() {
        this.LJLIL.onComplete();
    }

    public C73882Sz8(C73844SyW c73844SyW, long j, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        super(c73844SyW, j, timeUnit, abstractC73946T0k);
    }
}
