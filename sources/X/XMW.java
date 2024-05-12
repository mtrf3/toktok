package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XMW implements XMV<C58761N4j> {
    public final C58761N4j LJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof XMW) && o.LJ(this.LJLIL, ((XMW) obj).LJLIL) && o.LJ(null, null);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        this.LJLIL.hashCode();
        throw null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StretchItem(element=");
        LIZ.append(this.LJLIL);
        LIZ.append(", listConfig=");
        LIZ.append((Object) null);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.XMV
    public final /* bridge */ /* synthetic */ C58761N4j LIZLLL() {
        return this.LJLIL;
    }

    public XMW(C58761N4j element) {
        o.LJIIIZ(element, "element");
        o.LJIIIZ(null, "listConfig");
        this.LJLIL = element;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return areItemTheSame(other);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return XMY.LIZ(this, interfaceC57784Mm4);
    }
}
