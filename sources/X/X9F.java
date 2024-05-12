package X;

import java.util.concurrent.Future;

/* loaded from: classes16.dex */
public final class X9F extends X9H {
    public final Future<?> LJLIL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CancelFutureOnCancel[");
        LIZ.append(this.LJLIL);
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }

    public X9F(Future<?> future) {
        this.LJLIL = future;
    }

    @Override // X.X9G
    public final void LIZ(Throwable th) {
        if (th != null) {
            this.LJLIL.cancel(false);
        }
    }

    @Override // X.InterfaceC88472Yns
    public final /* bridge */ /* synthetic */ C76800UCe invoke(Throwable th) {
        LIZ(th);
        return C76800UCe.LIZ;
    }
}
