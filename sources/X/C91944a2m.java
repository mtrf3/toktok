package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a2m, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91944a2m {
    public final Boolean LIZ;
    public final Boolean LIZIZ;
    public final Boolean LIZJ;

    public C91944a2m() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91944a2m)) {
            return false;
        }
        C91944a2m c91944a2m = (C91944a2m) obj;
        return o.LJ(this.LIZ, c91944a2m.LIZ) && o.LJ(this.LIZIZ, c91944a2m.LIZIZ) && o.LJ(this.LIZJ, c91944a2m.LIZJ);
    }

    public final int hashCode() {
        Boolean bool = this.LIZ;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.LIZIZ;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.LIZJ;
        return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OcrModifyStatus(cardNumber=");
        LIZ.append(this.LIZ);
        LIZ.append(", holderName=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", expireData=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C91944a2m(Boolean bool, Boolean bool2, Boolean bool3) {
        this.LIZ = bool;
        this.LIZIZ = bool2;
        this.LIZJ = bool3;
    }

    public static C91944a2m LIZ(C91944a2m c91944a2m, Boolean bool, Boolean bool2, Boolean bool3, int i) {
        if ((i & 1) != 0) {
            bool = c91944a2m.LIZ;
        }
        if ((i & 2) != 0) {
            bool2 = c91944a2m.LIZIZ;
        }
        if ((i & 4) != 0) {
            bool3 = c91944a2m.LIZJ;
        }
        return new C91944a2m(bool, bool2, bool3);
    }
}
