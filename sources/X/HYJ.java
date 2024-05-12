package X;

/* loaded from: classes8.dex */
public final class HYJ extends HYI {
    public final int LIZ = -1;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof HYJ) && this.LIZ == ((HYJ) obj).LIZ;
        }
        return true;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HWEncodeFailed(ret=");
        return C08380Uo.LIZ(LIZ, this.LIZ, ")", LIZ);
    }
}
