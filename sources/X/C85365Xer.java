package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Xer, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85365Xer implements InterfaceC57784Mm4 {
    public final C85359Xel LJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C85365Xer) && o.LJ(this.LJLIL, ((C85365Xer) obj).LJLIL);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiPublishRcmdListFooterCellData(extensionMiscData=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C85365Xer(C85359Xel extensionMiscData) {
        o.LJIIIZ(extensionMiscData, "extensionMiscData");
        this.LJLIL = extensionMiscData;
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
