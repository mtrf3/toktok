package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class P2J extends P2U {
    public final EnumC58046MqI LJLIL;
    public final boolean LJLILLLLZI;
    public final int LJLJI;
    public final C57571Mid LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.LJLJJI.hashCode() + ((((hashCode + i) * 31) + this.LJLJI) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecFriendsAuthItem(platform=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isGrant=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", matchCount=");
        LIZ.append(this.LJLJI);
        LIZ.append(", trackInfo=");
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.P2U, X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        P2J p2j;
        boolean z = interfaceC57784Mm4 instanceof P2J;
        P2J p2j2 = null;
        if (z) {
            p2j2 = (P2J) interfaceC57784Mm4;
        }
        if (p2j2 == null || this.LJLJI != p2j2.LJLJI || !z || (p2j = (P2J) interfaceC57784Mm4) == null || this.LJLILLLLZI != p2j.LJLILLLLZI) {
            return false;
        }
        return true;
    }

    @Override // X.P2U, X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        P2J p2j;
        EnumC58046MqI enumC58046MqI = this.LJLIL;
        EnumC58046MqI enumC58046MqI2 = null;
        if ((interfaceC57784Mm4 instanceof P2J) && (p2j = (P2J) interfaceC57784Mm4) != null) {
            enumC58046MqI2 = p2j.LJLIL;
        }
        if (enumC58046MqI == enumC58046MqI2) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P2J)) {
            return false;
        }
        P2J p2j = (P2J) obj;
        if (this.LJLIL == p2j.LJLIL && this.LJLILLLLZI == p2j.LJLILLLLZI && this.LJLJI == p2j.LJLJI && o.LJ(this.LJLJJI, p2j.LJLJJI)) {
            return true;
        }
        return false;
    }

    public P2J(EnumC58046MqI platform, boolean z, int i, C57571Mid trackInfo) {
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(trackInfo, "trackInfo");
        this.LJLIL = platform;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
        this.LJLJJI = trackInfo;
    }
}
