package X;

/* renamed from: X.0as, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10340as {
    public static final long LIZ = C78897Uxp.LJI(0.0f, 0.0f);
    public static final /* synthetic */ int LIZIZ = 0;

    public static final boolean LIZ(long j, long j2) {
        return j == j2;
    }

    public static final float LIZIZ(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float LIZJ(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String LIZLLL(long j) {
        boolean z;
        if (LIZIZ(j) == LIZJ(j)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("CornerRadius.circular(");
            LIZ2.append(C87277YNd.LJJJJIZL(LIZIZ(j)));
            LIZ2.append(')');
            return X1D.LIZIZ(LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("CornerRadius.elliptical(");
        LIZ3.append(C87277YNd.LJJJJIZL(LIZIZ(j)));
        LIZ3.append(", ");
        LIZ3.append(C87277YNd.LJJJJIZL(LIZJ(j)));
        LIZ3.append(')');
        return X1D.LIZIZ(LIZ3);
    }
}
