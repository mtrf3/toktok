package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.SxT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73779SxT<T> extends AbstractRunnableC73776SxQ<T> {
    public static final long serialVersionUID = -7139995637533111443L;

    @Override // X.AbstractRunnableC73776SxQ
    public final void LIZIZ() {
        this.LJLIL.onComplete();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public C73779SxT(C73843SyV c73843SyV, long j, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        super(c73843SyV, j, timeUnit, abstractC73946T0k);
    }
}
