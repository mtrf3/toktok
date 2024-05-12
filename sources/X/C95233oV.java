package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3oV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95233oV implements InterfaceC57784Mm4 {
    public final C95833pT LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public C95233oV(C95833pT info) {
        o.LJIIIZ(info, "info");
        this.LJLIL = info;
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
