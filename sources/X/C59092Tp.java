package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2Tp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59092Tp extends F9E implements InterfaceC57784Mm4 {
    public final int LJLIL;

    public C59092Tp() {
        this(0);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL)};
    }

    public C59092Tp(int i) {
        this.LJLIL = 0;
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
