package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8gt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217918gt extends F9E implements InterfaceC57784Mm4 {
    public final Y9G LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C217918gt(Y9G user) {
        o.LJIIIZ(user, "user");
        this.LJLIL = user;
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
