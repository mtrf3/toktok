package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8Yh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C213198Yh<A, B> {
    public final A LIZ;
    public final B LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C213198Yh)) {
            return false;
        }
        C213198Yh c213198Yh = (C213198Yh) obj;
        return o.LJ(this.LIZ, c213198Yh.LIZ) && o.LJ(this.LIZIZ, c213198Yh.LIZIZ);
    }

    public final int hashCode() {
        A a = this.LIZ;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.LIZIZ;
        return hashCode + (b != null ? b.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Tuple2(a=");
        LIZ.append(this.LIZ);
        LIZ.append(", b=");
        return U26.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C213198Yh(A a, B b) {
        this.LIZ = a;
        this.LIZIZ = b;
    }
}
