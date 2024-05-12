package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0tA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21680tA {
    public final AbstractC34231Vz LIZ;
    public final AbstractC34231Vz LIZIZ;
    public final AbstractC34231Vz LIZJ;

    public C21680tA() {
        this(0);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Shapes(small=");
        LIZ.append(this.LIZ);
        LIZ.append(", medium=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", large=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C21680tA(int i) {
        C43401n6 LIZ = C17480mO.LIZ(4);
        C43401n6 LIZ2 = C17480mO.LIZ(4);
        C43401n6 LIZ3 = C17480mO.LIZ(0);
        this.LIZ = LIZ;
        this.LIZIZ = LIZ2;
        this.LIZJ = LIZ3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21680tA)) {
            return false;
        }
        C21680tA c21680tA = (C21680tA) obj;
        if (o.LJ(this.LIZ, c21680tA.LIZ) && o.LJ(this.LIZIZ, c21680tA.LIZIZ) && o.LJ(this.LIZJ, c21680tA.LIZJ)) {
            return true;
        }
        return false;
    }
}
