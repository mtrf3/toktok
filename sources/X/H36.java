package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H36 implements InterfaceC171226nm {
    public final /* synthetic */ C43421H2j LIZ;
    public final /* synthetic */ String LIZIZ;

    public H36(C43421H2j c43421H2j, String str) {
        this.LIZ = c43421H2j;
        this.LIZIZ = str;
    }

    @Override // X.InterfaceC171226nm
    public final void LIZ() {
        C67996QmO c67996QmO = this.LIZ.LJIILLIIL;
        if (c67996QmO == null) {
            o.LJIJI("nodeCallback");
            throw null;
        }
        c67996QmO.LIZIZ(new C41773GaP(this.LIZIZ), EnumC43531H6p.OUTER);
        C111214Yb.LIZJ("CompileTask", "extract thumbnail success");
        C42132GgC c42132GgC = (C42132GgC) this.LIZ.LJJIIJ.getValue();
        if (c42132GgC != null) {
            c42132GgC.LIZ();
        }
    }
}
