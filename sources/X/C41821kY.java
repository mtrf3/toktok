package X;

/* renamed from: X.1kY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41821kY extends C31241Km {
    public final boolean LIZ;

    public C41821kY() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41821kY) && this.LIZ == ((C41821kY) obj).LIZ;
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
        LIZ.append("BackToPreviousSceneAction(forceCloseContainer=");
        return C48339Iy7.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C41821kY(boolean z) {
        this.LIZ = z;
    }
}
