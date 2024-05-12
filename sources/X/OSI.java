package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OSI<A, B, C, D> {
    public final A LIZ;
    public final B LIZIZ;
    public final C LIZJ;
    public final D LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OSI)) {
            return false;
        }
        OSI osi = (OSI) obj;
        return o.LJ(this.LIZ, osi.LIZ) && o.LJ(this.LIZIZ, osi.LIZIZ) && o.LJ(this.LIZJ, osi.LIZJ) && o.LJ(this.LIZLLL, osi.LIZLLL);
    }

    public final int hashCode() {
        A a = this.LIZ;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.LIZIZ;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.LIZJ;
        int hashCode3 = (hashCode2 + (c == null ? 0 : c.hashCode())) * 31;
        D d = this.LIZLLL;
        return hashCode3 + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DataContext4(a=");
        LIZ.append(this.LIZ);
        LIZ.append(", b=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", c=");
        LIZ.append(this.LIZJ);
        LIZ.append(", d=");
        return U26.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public OSI(A a, B b, C c, D d) {
        this.LIZ = a;
        this.LIZIZ = b;
        this.LIZJ = c;
        this.LIZLLL = d;
    }
}