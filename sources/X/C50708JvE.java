package X;

/* renamed from: X.JvE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50708JvE implements InterfaceC50310Joo {
    public final boolean LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C50708JvE) && this.LIZ == ((C50708JvE) obj).LIZ;
    }

    public final int hashCode() {
        boolean z = this.LIZ;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchLockIntermedateAction(isLocked=");
        return C48339Iy7.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C50708JvE(boolean z) {
        this.LIZ = z;
    }
}
