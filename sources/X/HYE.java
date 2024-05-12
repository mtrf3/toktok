package X;

/* loaded from: classes8.dex */
public final class HYE extends HYI {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof HYE) && this.LIZ == ((HYE) obj).LIZ;
        }
        return true;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProcessRunningError(ret=");
        return C08380Uo.LIZ(LIZ, this.LIZ, ")", LIZ);
    }

    public HYE(int i) {
        this.LIZ = i;
    }
}
