package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3dO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88343dO extends F9E implements InterfaceC57784Mm4 {
    public final String LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C88343dO() {
        this("");
    }

    public C88343dO(String title) {
        o.LJIIIZ(title, "title");
        this.LJLIL = title;
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
