package X;

import kotlin.jvm.internal.AqS163S0100000_13;

/* loaded from: classes14.dex */
public final class UOE extends AbstractC792639e {
    public final InterfaceC65784Pro<C76800UCe> LJ;

    @Override // X.AbstractC792639e
    public final int LIZIZ() {
        return 1;
    }

    @Override // X.AbstractC792639e
    public final void LIZ() {
        if (!InterfaceC30442Bx8.g1.LIZJ().booleanValue()) {
            return;
        }
        if (!this.LIZ) {
            this.LIZIZ = false;
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJ;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                return;
            }
            return;
        }
        this.LIZIZ = true;
    }

    public UOE(AqS163S0100000_13 aqS163S0100000_13) {
        this.LJ = aqS163S0100000_13;
        this.LIZJ = 110000L;
    }
}
