package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.0jw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15960jw {
    public final String LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public boolean LJFF;
    public boolean LJI;
    public String LJII;
    public long LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;
    public String LJIIJJI;
    public boolean LJIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15960jw)) {
            return false;
        }
        C15960jw c15960jw = (C15960jw) obj;
        return o.LJ(this.LIZ, c15960jw.LIZ) && this.LIZIZ == c15960jw.LIZIZ && o.LJ(this.LIZJ, c15960jw.LIZJ) && o.LJ(this.LIZLLL, c15960jw.LIZLLL) && o.LJ(this.LJ, c15960jw.LJ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LIZJ = JBR.LIZJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        String str = this.LIZJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        String str2 = this.LIZLLL;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.LJ;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShowRechargeDialogData(chargeReason=");
        LIZ.append(this.LIZ);
        LIZ.append(", needCoins=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", previousPage=");
        LIZ.append(this.LIZJ);
        LIZ.append(", giftEnterFrom=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", notificationType=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public C15960jw(String str, long j, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
    }
}
