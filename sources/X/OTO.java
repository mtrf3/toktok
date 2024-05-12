package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OTO {
    public final String LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OTO)) {
            return false;
        }
        OTO oto = (OTO) obj;
        return o.LJ(this.LIZ, oto.LIZ) && o.LJ(this.LIZIZ, oto.LIZIZ) && o.LJ(this.LIZJ, oto.LIZJ) && o.LJ(this.LIZLLL, oto.LIZLLL) && o.LJ(this.LJ, oto.LJ) && o.LJ(this.LJFF, oto.LJFF) && o.LJ(this.LJI, oto.LJI);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        Integer num = this.LIZJ;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str = this.LIZLLL;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.LJ;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.LJFF;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str4 = this.LJI;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QRCodeScanParams(ticket=");
        LIZ.append(this.LIZ);
        LIZ.append(", token=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", authType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", clientKey=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", clientTicket=");
        LIZ.append(this.LJ);
        LIZ.append(", scope=");
        LIZ.append(this.LJFF);
        LIZ.append(", nextURL=");
        return q.LIZIZ(LIZ, this.LJI, ')', LIZ);
    }

    public OTO(String token, Integer num, String str, String str2, String str3, String str4) {
        o.LJIIIZ(token, "token");
        this.LIZ = "";
        this.LIZIZ = token;
        this.LIZJ = num;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = str4;
    }
}
