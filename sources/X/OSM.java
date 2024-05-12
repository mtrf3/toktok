package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OSM<A, B, C, D, E> {
    public final A LIZ;
    public final B LIZIZ;
    public final C LIZJ;
    public final D LIZLLL;
    public final E LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OSM)) {
            return false;
        }
        OSM osm = (OSM) obj;
        return o.LJ(this.LIZ, osm.LIZ) && o.LJ(this.LIZIZ, osm.LIZIZ) && o.LJ(this.LIZJ, osm.LIZJ) && o.LJ(this.LIZLLL, osm.LIZLLL) && o.LJ(this.LJ, osm.LJ);
    }

    public final int hashCode() {
        A a = this.LIZ;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.LIZIZ;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.LIZJ;
        int hashCode3 = (hashCode2 + (c == null ? 0 : c.hashCode())) * 31;
        D d = this.LIZLLL;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        E e = this.LJ;
        return hashCode4 + (e != null ? e.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Tuple5(a=");
        LIZ.append(this.LIZ);
        LIZ.append(", b=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", c=");
        LIZ.append(this.LIZJ);
        LIZ.append(", d=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", e=");
        return U26.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public OSM(A a, B b, C c, D d, E e) {
        this.LIZ = a;
        this.LIZIZ = b;
        this.LIZJ = c;
        this.LIZLLL = d;
        this.LJ = e;
    }
}
