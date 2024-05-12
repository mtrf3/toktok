package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.L2i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53612L2i {
    public int LIZ = Integer.MAX_VALUE;
    public String LIZIZ = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53612L2i)) {
            return false;
        }
        C53612L2i c53612L2i = (C53612L2i) obj;
        return this.LIZ == c53612L2i.LIZ && o.LJ(this.LIZIZ, c53612L2i.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConflictState(highestPriority=");
        LIZ.append(this.LIZ);
        LIZ.append(", aid=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }
}
