package X;

import kotlin.jvm.internal.o;

/* renamed from: X.LaF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54503LaF implements InterfaceC57784Mm4 {
    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public C54503LaF(EnumC54550Lb0 mode) {
        o.LJIIIZ(mode, "mode");
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
