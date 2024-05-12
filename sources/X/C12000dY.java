package X;

/* renamed from: X.0dY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12000dY {
    public static final long LIZIZ = C78983UzD.LJ(0.5f, 0.5f);
    public static final /* synthetic */ int LIZJ = 0;
    public final long LIZ;

    public static String LIZJ(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TransformOrigin(packedValue=");
        LIZ.append(j);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String toString() {
        return LIZJ(this.LIZ);
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZ);
    }

    public static final float LIZ(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float LIZIZ(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C12000dY) || j != ((C12000dY) obj).LIZ) {
            return false;
        }
        return true;
    }
}
