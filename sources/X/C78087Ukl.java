package X;

/* renamed from: X.Ukl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78087Ukl {
    public final int LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public C78087Ukl() {
        this(0L, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78087Ukl)) {
            return false;
        }
        C78087Ukl c78087Ukl = (C78087Ukl) obj;
        return this.LIZ == c78087Ukl.LIZ && this.LIZIZ == c78087Ukl.LIZIZ && this.LIZJ == c78087Ukl.LIZJ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZJ) + JBR.LIZJ(this.LIZIZ, this.LIZ * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CriticalStrikeInfo(criticalStrikeFromCombo=");
        LIZ.append(this.LIZ);
        LIZ.append(", criticalStrikeShowTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", criticalStrikeMultiplier=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public /* synthetic */ C78087Ukl(long j, int i) {
        this(0, 0L, (i & 4) != 0 ? 0L : j);
    }

    public static C78087Ukl LIZ(C78087Ukl c78087Ukl, int i) {
        return new C78087Ukl(i, c78087Ukl.LIZIZ, c78087Ukl.LIZJ);
    }

    public C78087Ukl(int i, long j, long j2) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
