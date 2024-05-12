package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Ftp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40429Ftp {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40429Ftp)) {
            return false;
        }
        C40429Ftp c40429Ftp = (C40429Ftp) obj;
        return o.LJ(this.LIZ, c40429Ftp.LIZ) && o.LJ(this.LIZIZ, c40429Ftp.LIZIZ) && o.LJ(this.LIZJ, c40429Ftp.LIZJ) && o.LJ(this.LIZLLL, c40429Ftp.LIZLLL) && o.LJ(this.LJ, c40429Ftp.LJ) && o.LJ(this.LJFF, c40429Ftp.LJFF);
    }

    public final int hashCode() {
        return this.LJFF.hashCode() + C79062V1e.LJ(this.LJ, C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DialogContent(title=");
        LIZ.append(this.LIZ);
        LIZ.append(", content=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", feedbackStr=");
        LIZ.append(this.LIZJ);
        LIZ.append(", positiveBtn=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", negativeBtn=");
        LIZ.append(this.LJ);
        LIZ.append(", packageName=");
        return q.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public C40429Ftp(String str, String str2, String str3, String str4, String str5, String str6) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
    }
}
