package X;

/* renamed from: X.0wC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23560wC {
    public static final long LIZIZ = C78983UzD.LJFF(0.0f, 0.0f);
    public static final /* synthetic */ int LIZJ = 0;
    public final long LIZ;

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZ);
    }

    public final String toString() {
        long j = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('(');
        LIZ.append(LIZIZ(j));
        LIZ.append(", ");
        LIZ.append(LIZJ(j));
        LIZ.append(") px/sec");
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C23560wC(long j) {
        this.LIZ = j;
    }

    public static final float LIZIZ(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float LIZJ(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C23560wC) || j != ((C23560wC) obj).LIZ) {
            return false;
        }
        return true;
    }

    public static final long LIZLLL(long j, long j2) {
        return C78983UzD.LJFF(LIZIZ(j) - LIZIZ(j2), LIZJ(j) - LIZJ(j2));
    }

    public static final long LJ(long j, long j2) {
        return C78983UzD.LJFF(LIZIZ(j2) + LIZIZ(j), LIZJ(j2) + LIZJ(j));
    }

    public static long LIZ(long j, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = LIZIZ(j);
        }
        if ((i & 2) != 0) {
            f2 = LIZJ(j);
        }
        return C78983UzD.LJFF(f, f2);
    }
}
