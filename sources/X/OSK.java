package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OSK<A, B, C> {
    public final A LIZ;
    public final B LIZIZ;
    public final C LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OSK)) {
            return false;
        }
        OSK osk = (OSK) obj;
        return o.LJ(this.LIZ, osk.LIZ) && o.LJ(this.LIZIZ, osk.LIZIZ) && o.LJ(this.LIZJ, osk.LIZJ);
    }

    public final int hashCode() {
        A a = this.LIZ;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.LIZIZ;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.LIZJ;
        return hashCode2 + (c != null ? c.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Tuple3(a=");
        LIZ.append(this.LIZ);
        LIZ.append(", b=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", c=");
        return U26.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public OSK(A a, B b, C c) {
        this.LIZ = a;
        this.LIZIZ = b;
        this.LIZJ = c;
    }
}
