package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Xbd, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85165Xbd extends F9E implements InterfaceC57784Mm4 {
    public final C85136XbA LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C85165Xbd(C85136XbA c85136XbA) {
        this.LJLIL = c85136XbA;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}
