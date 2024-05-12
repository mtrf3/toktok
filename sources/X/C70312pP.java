package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2pP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70312pP implements InterfaceC57784Mm4 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70312pP)) {
            return false;
        }
        obj.getClass();
        return o.LJ(null, null) && o.LJ(null, null);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowWidgetGuideItem(fromVideo=");
        LIZ.append(false);
        LIZ.append(", imgUrlModel=");
        LIZ.append((Object) null);
        LIZ.append(", listVM=");
        return U26.LIZJ(LIZ, null, ')', LIZ);
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
