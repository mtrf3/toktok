package X;

import kotlin.jvm.internal.AqS194S0100000_12;

/* loaded from: classes13.dex */
public final class T3D {
    public final boolean LIZ;
    public final InterfaceC65784Pro<Boolean> LIZIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZJ;
    public boolean LIZLLL;
    public final AqS194S0100000_12 LJ = new AqS194S0100000_12(this, 132);

    public final void LIZ() {
        C74216TAu c74216TAu = C74216TAu.LIZIZ;
        if (!c74216TAu.LJIIIZ() && !this.LIZLLL) {
            this.LIZLLL = true;
            c74216TAu.LIZJ(this.LJ);
        }
    }

    public final void LIZIZ() {
        if (this.LIZLLL) {
            this.LIZLLL = false;
            C74216TAu.LIZIZ.LIZ(this.LJ);
        }
    }

    public T3D(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, boolean z) {
        this.LIZ = z;
        this.LIZIZ = interfaceC65784Pro;
        this.LIZJ = interfaceC65784Pro2;
    }
}
