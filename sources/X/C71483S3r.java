package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.S3r, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71483S3r {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public Integer LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71483S3r)) {
            return false;
        }
        C71483S3r c71483S3r = (C71483S3r) obj;
        return o.LJ(this.LIZ, c71483S3r.LIZ) && this.LIZIZ == c71483S3r.LIZIZ && this.LIZJ == c71483S3r.LIZJ && this.LIZLLL == c71483S3r.LIZLLL && this.LJ == c71483S3r.LJ && o.LJ(this.LJFF, c71483S3r.LJFF);
    }

    public final int hashCode() {
        int hashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31;
        Integer num = this.LJFF;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Part(text=");
        LIZ.append(this.LIZ);
        LIZ.append(", font=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", partColor=");
        LIZ.append(this.LIZJ);
        LIZ.append(", marginLeft=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", marginBottom=");
        LIZ.append(this.LJ);
        LIZ.append(", textSize=");
        return s0.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public C71483S3r(String text, int i, int i2, int i3) {
        o.LJIIIZ(text, "text");
        this.LIZ = text;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = 0;
        this.LJ = i3;
        this.LJFF = null;
    }
}
