package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.DzG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35670DzG {
    public final boolean LIZ;
    public final String LIZIZ;

    public C35670DzG() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35670DzG)) {
            return false;
        }
        C35670DzG c35670DzG = (C35670DzG) obj;
        return this.LIZ == c35670DzG.LIZ && o.LJ(this.LIZIZ, c35670DzG.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.LIZIZ;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CustomContent(showDivider=");
        LIZ.append(this.LIZ);
        LIZ.append(", title=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C35670DzG(String str, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        str = (i & 2) != 0 ? null : str;
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
