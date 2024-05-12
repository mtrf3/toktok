package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes16.dex */
public final class XIW {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C64429PQj.LJLIL);
    public static final AtomicLong LIZJ = new AtomicLong(0);
    public static final AtomicLong LIZLLL = new AtomicLong(0);
    public static final AtomicLong LJ = new AtomicLong(0);
    public static final AtomicLong LJFF = new AtomicLong(0);
    public static final AtomicLong LJI = new AtomicLong(0);
    public static final AtomicLong LJII = new AtomicLong(0);
    public static final AtomicLong LJIIIIZZ = new AtomicLong(0);
    public static final AtomicLong LJIIIZ = new AtomicLong(0);
    public static final AtomicLong LJIIJ = new AtomicLong(0);
    public static final AtomicLong LJIIJJI = new AtomicLong(0);

    public static long LIZ(AtomicLong atomicLong) {
        long j = atomicLong.get();
        atomicLong.set(0L);
        return j;
    }

    public static void LIZIZ(long j, String str) {
        if (j <= 0) {
            return;
        }
        SZE.LIZLLL(str, 1.0f, new XIM(j));
    }
}
