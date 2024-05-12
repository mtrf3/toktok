package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XMX implements XMV<C62724OjY> {
    public final C62724OjY LJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof XMX) && o.LJ(this.LJLIL, ((XMX) obj).LJLIL) && o.LJ(null, null);
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
        LIZ.append("FriendUserItem(element=");
        LIZ.append(this.LJLIL);
        LIZ.append(", listConfig=");
        LIZ.append((Object) null);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.XMV
    public final /* bridge */ /* synthetic */ C62724OjY LIZLLL() {
        return this.LJLIL;
    }

    public XMX(C62724OjY element) {
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
