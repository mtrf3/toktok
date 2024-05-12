package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.L2e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53608L2e {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53608L2e)) {
            return false;
        }
        C53608L2e c53608L2e = (C53608L2e) obj;
        return this.LIZ == c53608L2e.LIZ && o.LJ(this.LIZIZ, c53608L2e.LIZIZ) && o.LJ(this.LIZJ, c53608L2e.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.LIZIZ;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BuyInfo(disable=");
        LIZ.append(this.LIZ);
        LIZ.append(", normalText=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", disableText=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C53608L2e(boolean z, String str, String str2) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
