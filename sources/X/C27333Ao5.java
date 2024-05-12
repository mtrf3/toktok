package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Ao5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27333Ao5 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;

    public C27333Ao5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27333Ao5)) {
            return false;
        }
        C27333Ao5 c27333Ao5 = (C27333Ao5) obj;
        return o.LJ(this.LIZ, c27333Ao5.LIZ) && o.LJ(this.LIZIZ, c27333Ao5.LIZIZ) && o.LJ(this.LIZJ, c27333Ao5.LIZJ) && o.LJ(this.LIZLLL, c27333Ao5.LIZLLL) && o.LJ(this.LJ, c27333Ao5.LJ) && o.LJ(this.LJFF, c27333Ao5.LJFF) && o.LJ(this.LJI, c27333Ao5.LJI) && o.LJ(this.LJII, c27333Ao5.LJII);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJ;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJFF;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LJI;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LJII;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CouponTrackParam(couponTypeInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(", couponCostRole=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", couponTypeId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", couponId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", campaignChannel=");
        LIZ.append(this.LJ);
        LIZ.append(", campaignUserTag=");
        LIZ.append(this.LJFF);
        LIZ.append(", campaignType=");
        LIZ.append(this.LJI);
        LIZ.append(", campaignId=");
        return q.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    public C27333Ao5(int i) {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = "-1";
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = null;
    }
}
