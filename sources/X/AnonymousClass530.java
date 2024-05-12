package X;

/* renamed from: X.530, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass530 extends C53C {
    public final boolean LIZ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass530) && this.LIZ == ((AnonymousClass530) obj).LIZ;
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
        LIZ.append("BackToRootAction(isRoot=");
        return C48339Iy7.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }
}
