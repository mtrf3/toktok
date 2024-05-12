package X;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Random;
import sun.misc.Unsafe;

/* loaded from: classes16.dex */
public abstract class XP1 extends Number {
    public static final ThreadLocal<int[]> LJLJJI = new ThreadLocal<>();
    public static final Random LJLJJL = new Random();
    public static final int LJLJJLL = Runtime.getRuntime().availableProcessors();
    public static final Unsafe LJLJL;
    public static final long LJLJLJ;
    public static final long LJLJLLL;
    public volatile transient XP6[] LJLIL;
    public volatile transient long LJLILLLLZI;
    public volatile transient int LJLJI;

    static {
        try {
            Unsafe LIZLLL = LIZLLL();
            LJLJL = LIZLLL;
            LJLJLJ = LIZLLL.objectFieldOffset(XP1.class.getDeclaredField("LJLILLLLZI"));
            LJLJLLL = LIZLLL.objectFieldOffset(XP1.class.getDeclaredField("LJLJI"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public final boolean LIZJ() {
        return LJLJL.compareAndSwapInt(this, LJLJLLL, 0, 1);
    }

    public static Unsafe LIZLLL() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new VJN());
        }
    }

    public final boolean LIZIZ(long j, long j2) {
        return LJLJL.compareAndSwapLong(this, LJLJLJ, j, j2);
    }
}
