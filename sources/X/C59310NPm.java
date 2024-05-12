package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.NPm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59310NPm {
    public String LIZ = null;
    public String LIZIZ = null;
    public String LIZJ = null;
    public String LIZLLL = null;
    public String LJ = null;
    public long LJFF = 0;
    public String LJI = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59310NPm)) {
            return false;
        }
        C59310NPm c59310NPm = (C59310NPm) obj;
        return o.LJ(this.LIZ, c59310NPm.LIZ) && o.LJ(this.LIZIZ, c59310NPm.LIZIZ) && o.LJ(this.LIZJ, c59310NPm.LIZJ) && o.LJ(this.LIZLLL, c59310NPm.LIZLLL) && o.LJ(this.LJ, c59310NPm.LJ) && this.LJFF == c59310NPm.LJFF && o.LJ(this.LJI, c59310NPm.LJI);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.LIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.LIZIZ;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.LIZJ;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.LIZLLL;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.LJ;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LJFF, (i5 + hashCode5) * 31, 31);
        String str6 = this.LJI;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return LIZJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommerceInfoFromAweme(creativeId=");
        LIZ.append(this.LIZ);
        LIZ.append(", adId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", itemId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", advId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", desc=");
        LIZ.append(this.LJ);
        LIZ.append(", viewTime=");
        LIZ.append(this.LJFF);
        LIZ.append(", coverUrl=");
        return q.LIZIZ(LIZ, this.LJI, ')', LIZ);
    }
}
