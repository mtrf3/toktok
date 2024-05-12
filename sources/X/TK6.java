package X;

import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TK6 {
    public boolean LIZ;
    public final AqS194S0100000_12 LIZIZ;
    public InterfaceC65784Pro<Boolean> LIZJ;
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;

    public final void LIZJ() {
        this.LIZ = false;
        C74216TAu.LIZIZ.LIZ(this.LIZIZ);
    }

    public final void LIZ() {
        C74216TAu c74216TAu = C74216TAu.LIZIZ;
        if (!c74216TAu.LJIIIZ() && !this.LIZ) {
            this.LIZ = true;
            c74216TAu.LIZJ(this.LIZIZ);
        }
    }

    public final void LIZIZ() {
        if (C74216TAu.LIZIZ.LJII() == T39.AVAILABLE && this.LIZJ.invoke().booleanValue()) {
            LIZJ();
            this.LIZLLL.invoke();
        } else {
            LIZ();
        }
    }

    public TK6(InterfaceC65784Pro<Boolean> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> retryCallback) {
        o.LJIIIZ(retryCallback, "retryCallback");
        this.LIZJ = interfaceC65784Pro;
        this.LIZLLL = retryCallback;
        this.LIZIZ = new AqS194S0100000_12(this, 211);
    }
}
