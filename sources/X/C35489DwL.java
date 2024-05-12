package X;

import kotlin.jvm.internal.o;

/* renamed from: X.DwL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35489DwL implements InterfaceC57784Mm4 {
    public final boolean LJLIL;

    public C35489DwL() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35489DwL) && this.LJLIL == ((C35489DwL) obj).LJLIL;
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        boolean z = this.LJLIL;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiPublishRcmdListHeaderCellData(holder=");
        return C48339Iy7.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C35489DwL(int i) {
        this.LJLIL = true;
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
