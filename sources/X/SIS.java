package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SIS {
    public final int LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final java.util.Map<String, String> LJFF;

    public SIS() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SIS)) {
            return false;
        }
        SIS sis = (SIS) obj;
        return this.LIZ == sis.LIZ && this.LIZIZ == sis.LIZIZ && o.LJ(this.LIZJ, sis.LIZJ) && o.LJ(this.LIZLLL, sis.LIZLLL) && this.LJ == sis.LJ && o.LJ(this.LJFF, sis.LJFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int i = this.LIZ * 31;
        boolean z = this.LIZIZ;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int LJ = C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, (i + i3) * 31, 31), 31);
        if (!this.LJ) {
            i2 = 0;
        }
        int i4 = (LJ + i2) * 31;
        java.util.Map<String, String> map = this.LJFF;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        return i4 + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NotificationChunkArgs(group=");
        LIZ.append(this.LIZ);
        LIZ.append(", isDetailedPage=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", headerTitleText=");
        LIZ.append(this.LIZJ);
        LIZ.append(", headerMoreText=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", ttShopWithMultiPicStyle=");
        LIZ.append(this.LJ);
        LIZ.append(", extras=");
        return C15890jp.LIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public SIS(String str, String str2, java.util.Map map) {
        this.LIZ = 210;
        this.LIZIZ = false;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = true;
        this.LJFF = map;
    }
}
