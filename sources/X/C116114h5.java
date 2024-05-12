package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4h5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116114h5 extends F9E implements InterfaceC57784Mm4 {
    public final C61262ao LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C116114h5(C61262ao c61262ao) {
        this.LJLIL = c61262ao;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        if (other instanceof C116114h5) {
            return o.LJ(this.LJLIL, ((C116114h5) other).LJLIL);
        }
        return o.LJ(other, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}
