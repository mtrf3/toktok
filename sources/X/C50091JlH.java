package X;

import defpackage.s0;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JlH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50091JlH {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Integer LJFF;
    public final C5H3 LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50091JlH)) {
            return false;
        }
        C50091JlH c50091JlH = (C50091JlH) obj;
        return o.LJ(this.LIZ, c50091JlH.LIZ) && o.LJ(this.LIZIZ, c50091JlH.LIZIZ) && o.LJ(this.LIZJ, c50091JlH.LIZJ) && o.LJ(this.LIZLLL, c50091JlH.LIZLLL) && o.LJ(this.LJ, c50091JlH.LJ) && o.LJ(this.LJFF, c50091JlH.LJFF);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        String str = this.LIZJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.LIZLLL;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.LJ;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Integer num = this.LJFF;
        if (num != null) {
            i = num.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InnerFlowContext(enterFromDocId=");
        LIZ.append(this.LIZ);
        LIZ.append(", inheritMaxPosOuterDocId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", lastInnerMaxPosDocId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", lastOuterMaxPosDocId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", newEnterFromDocId=");
        LIZ.append(this.LJ);
        LIZ.append(", enterFromDocIdPos=");
        return s0.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public C50091JlH(String enterFromDocId, String inheritMaxPosOuterDocId, String str, String str2, String str3, Integer num) {
        o.LJIIIZ(enterFromDocId, "enterFromDocId");
        o.LJIIIZ(inheritMaxPosOuterDocId, "inheritMaxPosOuterDocId");
        this.LIZ = enterFromDocId;
        this.LIZIZ = inheritMaxPosOuterDocId;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = num;
        this.LJI = V16.LJJJJLL(new AqS158S0100000_8(this, 287));
    }
}
