package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Bay, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29068Bay {
    public final boolean LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final Long LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29068Bay)) {
            return false;
        }
        C29068Bay c29068Bay = (C29068Bay) obj;
        return this.LIZ == c29068Bay.LIZ && this.LIZIZ == c29068Bay.LIZIZ && o.LJ(this.LIZJ, c29068Bay.LIZJ) && o.LJ(this.LIZLLL, c29068Bay.LIZLLL) && o.LJ(this.LJ, c29068Bay.LJ) && this.LJFF == c29068Bay.LJFF && o.LJ(this.LJI, c29068Bay.LJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((r0 * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.LIZLLL;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.LJ;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LJFF) * 31;
        String str3 = this.LJI;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiftPinCardInfo(isShow=");
        LIZ.append(this.LIZ);
        LIZ.append(", height=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", schema=");
        LIZ.append(this.LIZJ);
        LIZ.append(", roomId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", name=");
        LIZ.append(this.LJ);
        LIZ.append(", closeTime=");
        LIZ.append(this.LJFF);
        LIZ.append(", contentInfo=");
        return q.LIZIZ(LIZ, this.LJI, ')', LIZ);
    }

    public C29068Bay(boolean z, int i, String str, Long l, String str2, int i2, String str3) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = l;
        this.LJ = str2;
        this.LJFF = i2;
        this.LJI = str3;
    }
}
