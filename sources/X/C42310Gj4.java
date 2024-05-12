package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Gj4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42310Gj4 {
    public final String LIZ;
    public final Integer LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42310Gj4)) {
            return false;
        }
        C42310Gj4 c42310Gj4 = (C42310Gj4) obj;
        return o.LJ(this.LIZ, c42310Gj4.LIZ) && o.LJ(this.LIZIZ, c42310Gj4.LIZIZ) && o.LJ(this.LIZJ, c42310Gj4.LIZJ) && o.LJ(this.LIZLLL, c42310Gj4.LIZLLL) && o.LJ(this.LJ, c42310Gj4.LJ) && o.LJ(this.LJFF, c42310Gj4.LJFF) && o.LJ(this.LJI, c42310Gj4.LJI);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.LIZ.hashCode() * 31;
        Integer num = this.LIZIZ;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        String str = this.LIZJ;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.LIZLLL;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.LJ;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return this.LJI.hashCode() + C79062V1e.LJ(this.LJFF, (i4 + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddTagMobWrapper(challengeName=");
        LIZ.append(this.LIZ);
        LIZ.append(", rank=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", enterMethod=");
        LIZ.append(this.LIZJ);
        LIZ.append(", cid=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", queryId=");
        LIZ.append(this.LJ);
        LIZ.append(", tagSource=");
        LIZ.append(this.LJFF);
        LIZ.append(", logId=");
        return q.LIZIZ(LIZ, this.LJI, ')', LIZ);
    }

    public /* synthetic */ C42310Gj4(String str, String str2, String str3, String str4, Integer num) {
        this(num, str, str2, str3, null, str4, "");
    }

    public C42310Gj4(Integer num, String challengeName, String str, String str2, String str3, String str4, String logId) {
        o.LJIIIZ(challengeName, "challengeName");
        o.LJIIIZ(logId, "logId");
        this.LIZ = challengeName;
        this.LIZIZ = num;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = logId;
    }
}
