package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SIF extends F9E implements InterfaceC57784Mm4 {
    public final SI6 LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public SIF(SI6 si6) {
        this.LJLIL = si6;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof SIF)) {
            return false;
        }
        return o.LJ(((SIF) interfaceC57784Mm4).LJLIL.LIZIZ, this.LJLIL.LIZIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}
