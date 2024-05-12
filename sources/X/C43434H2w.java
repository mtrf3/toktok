package X;

import Y.ACallableS110S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.H2w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43434H2w implements InterfaceC171226nm {
    public final /* synthetic */ C43426H2o LIZ;
    public final /* synthetic */ C68322mC<String> LIZIZ;

    public C43434H2w(C43426H2o c43426H2o, C68322mC<String> c68322mC) {
        this.LIZ = c43426H2o;
        this.LIZIZ = c68322mC;
    }

    @Override // X.InterfaceC171226nm
    public final void LIZ() {
        C67996QmO c67996QmO = this.LIZ.LJII;
        if (c67996QmO == null) {
            o.LJIJI("nodeCallback");
            throw null;
        }
        c67996QmO.LIZIZ(new C41773GaP(this.LIZIZ.element), EnumC43531H6p.OUTER);
        C43426H2o c43426H2o = this.LIZ;
        ((C42132GgC) c43426H2o.LJIIIZ.getValue()).LIZ();
        C67996QmO c67996QmO2 = c43426H2o.LJII;
        if (c67996QmO2 != null) {
            c67996QmO2.LJ(null, false);
            C76940UHo c76940UHo = c43426H2o.LJIIIIZZ;
            if (c76940UHo != null) {
                c76940UHo.LIZ();
            }
            c43426H2o.LJIIIIZZ = null;
            C10K.LIZJ(new ACallableS110S0100000_7(c43426H2o, 58));
            return;
        }
        o.LJIJI("nodeCallback");
        throw null;
    }
}
