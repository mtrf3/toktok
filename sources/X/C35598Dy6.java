package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Dy6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35598Dy6 {
    public final Boolean LIZ;
    public final Boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    public C35598Dy6() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35598Dy6)) {
            return false;
        }
        C35598Dy6 c35598Dy6 = (C35598Dy6) obj;
        return o.LJ(this.LIZ, c35598Dy6.LIZ) && o.LJ(this.LIZIZ, c35598Dy6.LIZIZ);
    }

    public final int hashCode() {
        Boolean bool = this.LIZ;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.LIZIZ;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final int LIZ() {
        Boolean bool = this.LIZ;
        if (bool != null && this.LIZIZ != null) {
            o.LJI(bool);
            if (bool.booleanValue()) {
                Boolean bool2 = this.LIZIZ;
                o.LJI(bool2);
                if (bool2.booleanValue()) {
                    return 3;
                }
            }
            Boolean bool3 = this.LIZ;
            o.LJI(bool3);
            if (bool3.booleanValue()) {
                Boolean bool4 = this.LIZIZ;
                o.LJI(bool4);
                if (!bool4.booleanValue()) {
                    return 1;
                }
            }
            Boolean bool5 = this.LIZIZ;
            o.LJI(bool5);
            if (bool5.booleanValue()) {
                Boolean bool6 = this.LIZ;
                o.LJI(bool6);
                if (!bool6.booleanValue()) {
                    return 2;
                }
            }
            return 0;
        }
        return -1;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PermissionStatus(coHost=");
        LIZ.append(this.LIZ);
        LIZ.append(", multiGuest=");
        return C78920UyC.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C35598Dy6(int i) {
        this.LIZ = null;
        this.LIZIZ = null;
    }
}
