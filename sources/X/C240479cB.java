package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9cB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C240479cB extends F9E implements InterfaceC57784Mm4 {
    public final String LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C240479cB(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C240479cB) {
            return o.LJ(((C240479cB) interfaceC57784Mm4).LJLIL, this.LJLIL);
        }
        return false;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C240479cB) {
            return o.LJ(((C240479cB) interfaceC57784Mm4).LJLIL, this.LJLIL);
        }
        return false;
    }
}
