package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class L8Q implements InterfaceC55378LoM {
    public static L8J LIZIZ;
    public static L8Z LIZJ;
    public final AtomicBoolean LIZ = new AtomicBoolean(false);

    @Override // X.InterfaceC55378LoM
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC55378LoM
    public final void LIZ() {
        if (this.LIZ.compareAndSet(false, true)) {
            C37183EiZ.LIZ().execute(L8P.LJLIL);
        }
    }

    @Override // X.InterfaceC55378LoM
    public final void LIZJ() {
        L8J l8j = LIZIZ;
        if (l8j != null) {
            l8j.LJIIIIZZ();
            L8Z l8z = LIZJ;
            if (l8z != null) {
                l8z.LIZIZ();
            }
            if (C35052DpI.LIZ == 2) {
                LIZ();
            }
        }
    }

    public L8Q() {
        if (C53160Ktg.LIZ() || C53157Ktd.LIZ()) {
            LIZIZ = new L8J();
            LIZJ = new L8Z();
            C37183EiZ.LIZ().execute(L8S.LJLIL);
            C37183EiZ.LIZ().execute(L8T.LJLIL);
            C37183EiZ.LIZ().execute(L8U.LJLIL);
            C37183EiZ.LIZ().execute(L8V.LJLIL);
        }
    }
}
