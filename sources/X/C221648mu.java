package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.8mu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221648mu {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C221648mu)) {
            return false;
        }
        C221648mu c221648mu = (C221648mu) obj;
        return o.LJ(this.LIZ, c221648mu.LIZ) && o.LJ(this.LIZIZ, c221648mu.LIZIZ) && o.LJ(this.LIZJ, c221648mu.LIZJ) && o.LJ(this.LIZLLL, c221648mu.LIZLLL) && o.LJ(this.LJ, c221648mu.LJ);
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
        LIZ.append("QuickDMClickEventParam(enterPosition=");
        LIZ.append(this.LIZ);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", groupId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", authorId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", followStatus=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public C221648mu(String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
