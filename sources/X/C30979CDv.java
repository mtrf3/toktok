package X;

import kotlin.jvm.internal.o;

/* renamed from: X.CDv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30979CDv implements Comparable<C30979CDv> {
    public final CEM LJLIL;
    public final CE1 LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30979CDv)) {
            return false;
        }
        C30979CDv c30979CDv = (C30979CDv) obj;
        return o.LJ(this.LJLIL, c30979CDv.LJLIL) && this.LJLILLLLZI == c30979CDv.LJLILLLLZI;
    }

    public final int hashCode() {
        return this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DialogShowCallBackWithPriority(callback=");
        LIZ.append(this.LJLIL);
        LIZ.append(", name=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C30979CDv c30979CDv) {
        C30979CDv other = c30979CDv;
        o.LJIIIZ(other, "other");
        return this.LJLILLLLZI.ordinal() - other.LJLILLLLZI.ordinal();
    }

    public C30979CDv(CEM cem, CE1 name) {
        o.LJIIIZ(name, "name");
        this.LJLIL = cem;
        this.LJLILLLLZI = name;
    }
}
