package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aiA, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94510aiA extends F9E implements InterfaceC57784Mm4 {
    public final C113624d4 LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C94510aiA(C113624d4 item) {
        o.LJIIIZ(item, "item");
        this.LJLIL = item;
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
