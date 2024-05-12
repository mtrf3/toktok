package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RCD {
    public final String LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RCD)) {
            return false;
        }
        RCD rcd = (RCD) obj;
        return o.LJ(this.LIZ, rcd.LIZ) && o.LJ(this.LIZIZ, rcd.LIZIZ) && o.LJ(this.LIZJ, rcd.LIZJ) && o.LJ(this.LIZLLL, rcd.LIZLLL) && o.LJ(this.LJ, rcd.LJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LIZJ;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TwoStepAuthResponse(successTicket=");
        LIZ.append(this.LIZ);
        LIZ.append(", profileKey=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", errorCode=");
        LIZ.append(this.LIZJ);
        LIZ.append(", errorMessage=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", smsCodeKey=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public /* synthetic */ RCD(Integer num, String str, String str2, String str3) {
        this(str, str2, num, str3, null);
    }

    public RCD(String str, String str2, Integer num, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = num;
        this.LIZLLL = str3;
        this.LJ = str4;
    }
}
