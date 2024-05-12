package X;

/* renamed from: X.0fV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13210fV {
    public static final long LIZ;
    public static final long LIZIZ;
    public static final long LIZJ;
    public static final long LIZLLL;
    public static final /* synthetic */ int LJ = 0;

    static {
        long j = 3;
        long j2 = j << 32;
        LIZ = (0 & 4294967295L) | j2;
        LIZIZ = (1 & 4294967295L) | j2;
        LIZJ = j2 | (2 & 4294967295L);
        LIZLLL = (j & 4294967295L) | (4 << 32);
    }

    public static final boolean LIZ(long j, long j2) {
        return j == j2;
    }

    public static String LIZIZ(long j) {
        if (LIZ(j, LIZ)) {
            return "Rgb";
        }
        if (LIZ(j, LIZIZ)) {
            return "Xyz";
        }
        if (LIZ(j, LIZJ)) {
            return "Lab";
        }
        if (LIZ(j, LIZLLL)) {
            return "Cmyk";
        }
        return "Unknown";
    }
}
