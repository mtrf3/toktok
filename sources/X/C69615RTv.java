package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.RTv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69615RTv {
    public final String LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;
    public final Integer LJ;

    public C69615RTv() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69615RTv)) {
            return false;
        }
        C69615RTv c69615RTv = (C69615RTv) obj;
        return o.LJ(this.LIZ, c69615RTv.LIZ) && o.LJ(this.LIZIZ, c69615RTv.LIZIZ) && o.LJ(this.LIZJ, c69615RTv.LIZJ) && o.LJ(this.LIZLLL, c69615RTv.LIZLLL) && o.LJ(this.LJ, c69615RTv.LJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LIZJ;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LJ;
        return hashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiGuestAudienceAdStruct(adUrl=");
        LIZ.append(this.LIZ);
        LIZ.append(", adId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", adPlayTimes=");
        LIZ.append(this.LIZJ);
        LIZ.append(", adDuration=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", seekTime=");
        return s0.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public C69615RTv(String str, String str2, Integer num, Integer num2, Integer num3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = num;
        this.LIZLLL = num2;
        this.LJ = num3;
    }
}
