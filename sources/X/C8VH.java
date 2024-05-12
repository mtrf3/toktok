package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8VH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8VH extends SZD {
    public final Class<?> LIZJ;
    public final Boolean LIZLLL;
    public final Boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8VH)) {
            return false;
        }
        C8VH c8vh = (C8VH) obj;
        return o.LJ(this.LIZJ, c8vh.LIZJ) && o.LJ(this.LIZLLL, c8vh.LIZLLL) && o.LJ(this.LJ, c8vh.LJ);
    }

    public final int hashCode() {
        Class<?> cls = this.LIZJ;
        int hashCode = (cls == null ? 0 : cls.hashCode()) * 31;
        Boolean bool = this.LIZLLL;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LJ;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AssemDslPerformanceParams(host=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isReused=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", isLazy=");
        return C78920UyC.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C8VH(java.lang.Class r2) {
        /*
            r1 = this;
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.<init>(r2, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8VH.<init>(java.lang.Class):void");
    }

    public C8VH(Class<?> cls, Boolean bool, Boolean bool2) {
        this.LIZJ = cls;
        this.LIZLLL = bool;
        this.LJ = bool2;
    }
}
