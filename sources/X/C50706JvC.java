package X;

/* renamed from: X.JvC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50706JvC implements InterfaceC50310Joo {
    public final boolean LIZ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C50706JvC) && this.LIZ == ((C50706JvC) obj).LIZ;
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
        LIZ.append("SearchUpdateFirstIntermediate(isFirstIntermediate=");
        return C48339Iy7.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }
}
