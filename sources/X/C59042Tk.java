package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2Tk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59042Tk extends F9E implements InterfaceC57784Mm4 {
    public final int LJLIL = 0;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL)};
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C59042Tk) || this.LJLIL != ((C59042Tk) interfaceC57784Mm4).LJLIL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}
