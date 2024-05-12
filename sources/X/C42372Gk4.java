package X;

import java.util.concurrent.Future;

/* renamed from: X.Gk4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42372Gk4 implements T2N {
    public final Future<?> LJLIL;

    @Override // X.T2N
    public final void dispose() {
        this.LJLIL.cancel(false);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DisposableFutureHandle[");
        LIZ.append(this.LJLIL);
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }

    public C42372Gk4(Future<?> future) {
        this.LJLIL = future;
    }
}
