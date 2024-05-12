package X;

import java.util.concurrent.Future;

/* renamed from: X.QFp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66697QFp extends WB7 {
    public final /* synthetic */ Future LIZ;
    public final /* synthetic */ QGR LIZIZ;

    @Override // X.InterfaceC81847WAh
    public final void LIZJ() {
        if (this.LIZ.cancel(false)) {
            ((W7U) this.LIZIZ).LIZ();
        }
    }

    public C66697QFp(Future future, W7U w7u) {
        this.LIZ = future;
        this.LIZIZ = w7u;
    }
}
