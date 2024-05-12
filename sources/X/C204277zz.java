package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.7zz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C204277zz {
    public final boolean LIZ;
    public final Float LIZIZ;
    public final String LIZJ;

    public C204277zz() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C204277zz)) {
            return false;
        }
        C204277zz c204277zz = (C204277zz) obj;
        return this.LIZ == c204277zz.LIZ && o.LJ(this.LIZIZ, c204277zz.LIZIZ) && o.LJ(this.LIZJ, c204277zz.LIZJ);
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
        Float f = this.LIZIZ;
        int hashCode = (i + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.LIZJ;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShareCountState(visible=");
        LIZ.append(this.LIZ);
        LIZ.append(", size=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", text=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C204277zz(java.lang.String r4, int r5) {
        /*
            r3 = this;
            r0 = r5 & 1
            if (r0 == 0) goto Lf
            r2 = 1
        L5:
            r1 = r5 & 4
            r0 = 0
            if (r1 == 0) goto Lb
            r4 = r0
        Lb:
            r3.<init>(r0, r4, r2)
            return
        Lf:
            r2 = 0
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204277zz.<init>(java.lang.String, int):void");
    }

    public C204277zz(Float f, String str, boolean z) {
        this.LIZ = z;
        this.LIZIZ = f;
        this.LIZJ = str;
    }
}
