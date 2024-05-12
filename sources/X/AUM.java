package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AUM {
    public String LIZ;
    public final String LIZIZ;
    public String LIZJ;
    public final java.util.Map<String, String> LIZLLL;
    public final java.util.Map<EnumC53663L4h, ? extends Object> LJ;

    public AUM() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AUM)) {
            return false;
        }
        AUM aum = (AUM) obj;
        return o.LJ(this.LIZ, aum.LIZ) && o.LJ(this.LIZIZ, aum.LIZIZ) && o.LJ(this.LIZJ, aum.LIZJ) && o.LJ(this.LIZLLL, aum.LIZLLL) && o.LJ(this.LJ, aum.LJ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31);
        java.util.Map<String, String> map = this.LIZLLL;
        int i = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        java.util.Map<EnumC53663L4h, ? extends Object> map2 = this.LJ;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AvatarTrackerConfig(enterFrom=");
        LIZ.append(this.LIZ);
        LIZ.append(", enterMethod=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", position=");
        LIZ.append(this.LIZJ);
        LIZ.append(", extra=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", businessExtra=");
        return C15890jp.LIZ(LIZ, this.LJ, ')', LIZ);
    }

    public AUM(Object obj) {
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = "";
        this.LIZLLL = null;
        this.LJ = null;
    }
}
