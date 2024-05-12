package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes16.dex */
public final class X3G implements InterfaceC84175X1v {
    public final /* synthetic */ AtomicBoolean LIZ;
    public final /* synthetic */ X4O LIZIZ;

    @Override // X.InterfaceC84175X1v
    public final void LJJIJ() {
        X3D LJIIL;
        synchronized (this.LIZIZ) {
            this.LIZ.set(true);
            X4O x4o = this.LIZIZ;
            if (!x4o.LJ() && (LJIIL = C84212X3g.LJIIL()) != null) {
                LJIIL.LJIJJ(x4o.LJLLILLLL.getId());
            }
        }
    }

    public X3G(X4O x4o, AtomicBoolean atomicBoolean) {
        this.LIZIZ = x4o;
        this.LIZ = atomicBoolean;
    }
}
