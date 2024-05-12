package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.9lH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C246119lH {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C246119lH() {
        this(false, "", null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C246119lH)) {
            return false;
        }
        C246119lH c246119lH = (C246119lH) obj;
        return this.LIZ == c246119lH.LIZ && o.LJ(this.LIZIZ, c246119lH.LIZIZ) && o.LJ(this.LIZJ, c246119lH.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int LJ = C79062V1e.LJ(this.LIZIZ, r0 * 31, 31);
        String str = this.LIZJ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IsUserRemoved(isRemoved=");
        LIZ.append(this.LIZ);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", uid=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C246119lH(boolean z, String enterFrom, String str) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ = z;
        this.LIZIZ = enterFrom;
        this.LIZJ = str;
    }
}
