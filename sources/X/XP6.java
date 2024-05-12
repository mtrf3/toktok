package X;

import sun.misc.Unsafe;

/* loaded from: classes16.dex */
public final class XP6 {
    public static final Unsafe LIZIZ;
    public static final long LIZJ;
    public volatile long LIZ;

    static {
        try {
            Unsafe LIZLLL = XP1.LIZLLL();
            LIZIZ = LIZLLL;
            LIZJ = LIZLLL.objectFieldOffset(XP6.class.getDeclaredField("LIZ"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public XP6(long j) {
        this.LIZ = j;
    }

    public final boolean LIZ(long j, long j2) {
        return LIZIZ.compareAndSwapLong(this, LIZJ, j, j2);
    }
}
