package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3ir, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91733ir extends F9E implements InterfaceC57784Mm4 {
    public final String LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C91733ir(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C91733ir)) {
            return false;
        }
        return o.LJ(this.LJLIL, ((C91733ir) interfaceC57784Mm4).LJLIL);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C91733ir)) {
            return false;
        }
        return true;
    }
}
