package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GgC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42132GgC {
    public final String LIZ;
    public final EnumC42135GgF LIZIZ;
    public final C62822Ol8 LIZJ;
    public long LIZLLL;

    public final void LIZ() {
        int i = C42134GgE.LIZ[this.LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    ((InterfaceC42116Gfw) this.LIZJ.getValue()).LIZ(this.LIZ).LJIILIIL(System.currentTimeMillis() - this.LIZLLL);
                    return;
                }
                ((InterfaceC42116Gfw) this.LIZJ.getValue()).LIZ(this.LIZ).LIZIZ(System.currentTimeMillis() - this.LIZLLL);
                return;
            }
            ((InterfaceC42116Gfw) this.LIZJ.getValue()).LIZ(this.LIZ).LIZJ(System.currentTimeMillis() - this.LIZLLL);
            return;
        }
        ((InterfaceC42116Gfw) this.LIZJ.getValue()).LIZ(this.LIZ).LIZ(System.currentTimeMillis() - this.LIZLLL);
    }

    public final void LIZIZ() {
        this.LIZLLL = System.currentTimeMillis();
    }

    public C42132GgC(String id, EnumC42135GgF state) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(state, "state");
        this.LIZ = id;
        this.LIZIZ = state;
        this.LIZJ = C221108m2.LIZIZ(C42133GgD.LJLIL);
        this.LIZLLL = System.currentTimeMillis();
    }
}
