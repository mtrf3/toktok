package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class JU9 implements InterfaceC49224JTo {
    public JU3 LJLIL;

    @Override // X.InterfaceC49224JTo
    public final void LLLLLILLIL() {
        this.LJLIL = null;
    }

    public void LIZ() {
        LIZIZ(new JU6(C61878OQg.INSTANCE, false));
    }

    public void LIZIZ(JU6 ju6) {
        JU3 ju3 = this.LJLIL;
        if (ju3 != null) {
            ju3.LIZ(ju6);
            C76800UCe c76800UCe = C76800UCe.LIZ;
        }
    }

    @Override // X.InterfaceC49224JTo
    public final void LLIIJI(JU3 eventDispatcher) {
        o.LJIIIZ(eventDispatcher, "eventDispatcher");
        this.LJLIL = eventDispatcher;
    }
}
