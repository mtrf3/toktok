package X;

/* renamed from: X.aNu, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93254aNu {
    public static long LIZJ;
    public static long LJFF;
    public static final Object LIZ = new Object();
    public static long LIZIZ = -1;
    public static final Object LIZLLL = new Object();
    public static long LJ = -1;

    public static long LIZ(int i, C93251aNr c93251aNr) {
        long currentTimeMillis = System.currentTimeMillis();
        if (i != 0) {
            if (i != 1) {
                return 0L;
            }
            long j = LJ;
            if (j == -1 || currentTimeMillis - j > 3600000) {
                synchronized (LIZLLL) {
                    long j2 = LJ;
                    if (j2 == -1 || currentTimeMillis - j2 > 3600000) {
                        LJFF = c93251aNr.LIZLLL(i);
                        LJ = currentTimeMillis;
                    }
                }
            }
            return LJFF;
        }
        long j3 = LIZIZ;
        if (j3 == -1 || currentTimeMillis - j3 > 86400000) {
            synchronized (LIZ) {
                long j4 = LIZIZ;
                if (j4 == -1 || currentTimeMillis - j4 > 86400000) {
                    LIZJ = c93251aNr.LIZLLL(i);
                    LIZIZ = currentTimeMillis;
                }
            }
        }
        return LIZJ;
    }
}
