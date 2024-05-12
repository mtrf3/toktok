package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.L2h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53611L2h {
    public final int LIZ;
    public final String LIZIZ;

    public C53611L2h() {
        this(1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53611L2h)) {
            return false;
        }
        C53611L2h c53611L2h = (C53611L2h) obj;
        return this.LIZ == c53611L2h.LIZ && o.LJ(this.LIZIZ, c53611L2h.LIZIZ);
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
        LIZ.append(", keyWord=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C53611L2h(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
