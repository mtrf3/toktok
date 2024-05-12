package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.L2g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53610L2g {
    public final int LIZ;
    public final String LIZIZ;

    public C53610L2g() {
        this(1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53610L2g)) {
            return false;
        }
        C53610L2g c53610L2g = (C53610L2g) obj;
        return this.LIZ == c53610L2g.LIZ && o.LJ(this.LIZIZ, c53610L2g.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CursorData(pageIndex=");
        LIZ.append(this.LIZ);
        LIZ.append(", keyword=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C53610L2g(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
