package X;

import kotlin.jvm.internal.o;

/* renamed from: X.L7a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53734L7a {
    public final int LIZ;
    public Boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53734L7a)) {
            return false;
        }
        C53734L7a c53734L7a = (C53734L7a) obj;
        return this.LIZ == c53734L7a.LIZ && o.LJ(this.LIZIZ, c53734L7a.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        Boolean bool = this.LIZIZ;
        return i + (bool == null ? 0 : bool.hashCode());
    }

    public C53734L7a() {
        this(0, Boolean.FALSE);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SecondRelation(secondRelation=");
        LIZ.append(this.LIZ);
        LIZ.append(", logHadShow=");
        return C78920UyC.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C53734L7a(int i, Boolean bool) {
        this.LIZ = i;
        this.LIZIZ = bool;
    }
}
