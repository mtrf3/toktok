package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class P2K extends P2U {
    public final C57571Mid LJLIL;

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecFriendsInviteItem(trackInfo=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public P2K(C57571Mid trackInfo) {
        o.LJIIIZ(trackInfo, "trackInfo");
        this.LJLIL = trackInfo;
    }

    @Override // X.P2U, X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return interfaceC57784Mm4 instanceof P2K;
    }

    @Override // X.P2U, X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return interfaceC57784Mm4 instanceof P2K;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof P2K) && o.LJ(this.LJLIL, ((P2K) obj).LJLIL)) {
            return true;
        }
        return false;
    }
}
