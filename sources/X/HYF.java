package X;

/* loaded from: classes8.dex */
public final class HYF extends HYI {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof HYF) && this.LIZ == ((HYF) obj).LIZ;
        }
        return true;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StartRecordFailed(ret=");
        return C08380Uo.LIZ(LIZ, this.LIZ, ")", LIZ);
    }

    public HYF(int i) {
        this.LIZ = i;
    }
}
