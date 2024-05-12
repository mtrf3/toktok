package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0Vk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08600Vk<A, B, C, D> {
    public final A LIZ;
    public final B LIZIZ;
    public final C LIZJ;
    public final D LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C08600Vk)) {
            return false;
        }
        C08600Vk c08600Vk = (C08600Vk) obj;
        return o.LJ(this.LIZ, c08600Vk.LIZ) && o.LJ(this.LIZIZ, c08600Vk.LIZIZ) && o.LJ(this.LIZJ, c08600Vk.LIZJ) && o.LJ(this.LIZLLL, c08600Vk.LIZLLL);
    }

    public final int hashCode() {
        A a = this.LIZ;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.LIZIZ;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.LIZJ;
        int hashCode3 = (hashCode2 + (c != null ? c.hashCode() : 0)) * 31;
        D d = this.LIZLLL;
        return hashCode3 + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('(');
        LIZ.append(this.LIZ);
        LIZ.append(", ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", ");
        LIZ.append(this.LIZJ);
        LIZ.append(',');
        return U26.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C08600Vk(A a, B b, C c, D d) {
        this.LIZ = a;
        this.LIZIZ = b;
        this.LIZJ = c;
        this.LIZLLL = d;
    }
}
