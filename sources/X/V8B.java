package X;

import java.util.concurrent.TimeUnit;

/* loaded from: classes14.dex */
public final class V8B {
    public static final long LIZ = C78866UxK.LJJZ(100000, 1, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
    public static final int LIZIZ;
    public static final int LIZJ;
    public static final long LIZLLL;
    public static final V8C LJ;

    static {
        C78866UxK.LJJZZI("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12);
        int i = C78873UxR.LIZ;
        int i2 = 2;
        if (i >= 2) {
            i2 = i;
        }
        int LJJZZI = C78866UxK.LJJZZI("kotlinx.coroutines.scheduler.core.pool.size", i2, 1, 0, 8);
        LIZIZ = LJJZZI;
        LIZJ = C78866UxK.LJJZZI("kotlinx.coroutines.scheduler.max.pool.size", C78842Uww.LJIIL(i * 128, LJJZZI, 2097150), 0, 2097150, 4);
        LIZLLL = TimeUnit.SECONDS.toNanos(C78866UxK.LJJZ(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        LJ = V8C.LIZ;
    }
}
