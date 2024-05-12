package X;

import java.io.InputStream;

/* renamed from: X.Ena, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37494Ena<T> implements BQ6<InterfaceC37464En6> {
    public final /* synthetic */ BQ6 LIZ = null;
    public final /* synthetic */ BQ6 LIZIZ = null;

    @Override // X.BQ6
    public final void accept(InterfaceC37464En6 interfaceC37464En6) {
        InputStream data;
        Object LIZ;
        InterfaceC37464En6 interfaceC37464En62 = interfaceC37464En6;
        C37542EoM c37542EoM = C37542EoM.LJIIJJI;
        C37542EoM.LJFF.set(false);
        C37542EoM.LJI.set(true);
        C37542EoM.LJ = System.currentTimeMillis();
        if (interfaceC37464En62 != null && (data = interfaceC37464En62.getData()) != null) {
            try {
                c37542EoM.getClass();
                C37542EoM.LIZJ(data);
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl != null) {
                BQ6 bq6 = this.LIZ;
                if (bq6 != null) {
                    bq6.accept(new C37394Ely(-10002, m10exceptionOrNullimpl.getMessage()));
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("[PIASettings] Exception happened when handling settings stream. Error: ");
                LIZ2.append(m10exceptionOrNullimpl);
                C37238EjS.LIZLLL(6, X1D.LIZIZ(LIZ2), null);
            }
            if (C3C5.m13isSuccessimpl(LIZ)) {
                BQ6 bq62 = this.LIZIZ;
                if (bq62 != null) {
                    bq62.accept(null);
                }
                C37238EjS.LJI(6, "[PIASettings] Update Async settings success.", null);
            }
            C3C5.m6boximpl(LIZ);
        }
    }
}
