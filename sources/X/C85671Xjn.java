package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Xjn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85671Xjn {
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
        if (!(obj instanceof C85671Xjn)) {
            return false;
        }
        C85671Xjn c85671Xjn = (C85671Xjn) obj;
        return o.LJ(this.LIZ, c85671Xjn.LIZ) && o.LJ(this.LIZIZ, c85671Xjn.LIZIZ) && o.LJ(this.LIZJ, c85671Xjn.LIZJ) && o.LJ(this.LIZLLL, c85671Xjn.LIZLLL) && o.LJ(this.LJ, c85671Xjn.LJ) && o.LJ(this.LJFF, c85671Xjn.LJFF);
    }

    public final int hashCode() {
        return this.LJFF.hashCode() + C79062V1e.LJ(this.LJ, C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Param(title=");
        LIZ.append(this.LIZ);
        LIZ.append(", desc=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", firstItem=");
        LIZ.append(this.LIZJ);
        LIZ.append(", secondItem=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", enterType=");
        LIZ.append(this.LJ);
        LIZ.append(", phoneNum=");
        return q.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public C85671Xjn(String str, String str2, String str3, String str4, String enterType, String phoneNum) {
        o.LJIIIZ(enterType, "enterType");
        o.LJIIIZ(phoneNum, "phoneNum");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = enterType;
        this.LJFF = phoneNum;
    }
}
