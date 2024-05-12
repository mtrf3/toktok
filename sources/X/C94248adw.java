package X;

/* renamed from: X.adw, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94248adw extends AbstractC93769aWD {
    public final int LIZ = 1;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C94248adw) && this.LIZ == ((C94248adw) obj).LIZ;
        }
        return true;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DRAFTUPGRADE_START(from=");
        LIZ.append(this.LIZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }
}
