package X;

import android.view.ViewGroup;
import defpackage.q;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U8Y {
    public final long LIZ;
    public final InterfaceC65784Pro<String> LIZIZ;
    public final InterfaceC65784Pro<String> LIZJ;
    public final long LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final InterfaceC65784Pro<ViewGroup> LJI;
    public final String LJII;

    public U8Y() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U8Y)) {
            return false;
        }
        U8Y u8y = (U8Y) obj;
        return this.LIZ == u8y.LIZ && o.LJ(this.LIZIZ, u8y.LIZIZ) && o.LJ(this.LIZJ, u8y.LIZJ) && this.LIZLLL == u8y.LIZLLL && this.LJ == u8y.LJ && o.LJ(this.LJFF, u8y.LJFF) && o.LJ(this.LJI, u8y.LJI) && o.LJ(this.LJII, u8y.LJII);
    }

    public final int hashCode() {
        return this.LJII.hashCode() + C1JX.LIZLLL(this.LJI, C79062V1e.LJ(this.LJFF, (JBR.LIZJ(this.LIZLLL, C1JX.LIZLLL(this.LIZJ, C1JX.LIZLLL(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31), 31), 31) + this.LJ) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Config(uid=");
        LIZ.append(this.LIZ);
        LIZ.append(", linkmicId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", role=");
        LIZ.append(this.LIZJ);
        LIZ.append(", roomId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", scene=");
        LIZ.append(this.LJ);
        LIZ.append(", liveType=");
        LIZ.append(this.LJFF);
        LIZ.append(", businessParent=");
        LIZ.append(this.LJI);
        LIZ.append(", source=");
        return q.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    public U8Y(long j, AqS163S0100000_13 aqS163S0100000_13, AqS163S0100000_13 aqS163S0100000_132, long j2, int i, String liveType, AqS163S0100000_13 aqS163S0100000_133) {
        o.LJIIIZ(liveType, "liveType");
        this.LIZ = j;
        this.LIZIZ = aqS163S0100000_13;
        this.LIZJ = aqS163S0100000_132;
        this.LIZLLL = j2;
        this.LJ = i;
        this.LJFF = liveType;
        this.LJI = aqS163S0100000_133;
        this.LJII = "multi_live_sdk";
    }
}
