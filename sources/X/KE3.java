package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KE3 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public KE3() {
        /*
            r2 = this;
            r1 = 0
            r0 = 31
            r2.<init>(r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KE3.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KE3)) {
            return false;
        }
        KE3 ke3 = (KE3) obj;
        return o.LJ(this.LIZ, ke3.LIZ) && o.LJ(this.LIZIZ, ke3.LIZIZ) && o.LJ(this.LIZJ, ke3.LIZJ) && o.LJ(this.LIZLLL, ke3.LIZLLL) && o.LJ(this.LJ, ke3.LJ);
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
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ECSearchResultMutableData(fromSearchSubTab=");
        LIZ.append(this.LIZ);
        LIZ.append(", sugSessionId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", fromMiddleBackFromResult=");
        LIZ.append(this.LIZJ);
        LIZ.append(", groupId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", lastFromGroupId=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public /* synthetic */ KE3(String str, String str2, int i) {
        this(null, null, null, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
    }

    public KE3(String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
