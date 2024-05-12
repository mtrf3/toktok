package X;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* loaded from: classes16.dex */
public final class XP0 extends AbstractC84770XOs {
    public static final Unsafe LIZ;
    public static final long LIZIZ;
    public static final long LIZJ;
    public static final long LIZLLL;
    public static final long LJ;
    public static final long LJFF;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new VJM());
        }
        try {
            LIZJ = unsafe.objectFieldOffset(AbstractC84773XOv.class.getDeclaredField("LJLJI"));
            LIZIZ = unsafe.objectFieldOffset(AbstractC84773XOv.class.getDeclaredField("LJLILLLLZI"));
            LIZLLL = unsafe.objectFieldOffset(AbstractC84773XOv.class.getDeclaredField("LJLIL"));
            LJ = unsafe.objectFieldOffset(C84772XOu.class.getDeclaredField("LIZ"));
            LJFF = unsafe.objectFieldOffset(C84772XOu.class.getDeclaredField("LIZIZ"));
            LIZ = unsafe;
        } catch (Exception e2) {
            C36747EbX.LIZJ(e2);
            throw new RuntimeException(e2);
        }
    }

    @Override // X.AbstractC84770XOs
    public final void LIZLLL(C84772XOu c84772XOu, C84772XOu c84772XOu2) {
        LIZ.putObject(c84772XOu, LJFF, c84772XOu2);
    }

    @Override // X.AbstractC84770XOs
    public final void LJ(C84772XOu c84772XOu, Thread thread) {
        LIZ.putObject(c84772XOu, LJ, thread);
    }

    @Override // X.AbstractC84770XOs
    public final boolean LIZ(AbstractC84773XOv<?> abstractC84773XOv, XP9 xp9, XP9 xp92) {
        return C0AX.LIZJ(LIZ, abstractC84773XOv, LIZIZ, xp9, xp92);
    }

    @Override // X.AbstractC84770XOs
    public final boolean LIZIZ(AbstractC84773XOv<?> abstractC84773XOv, Object obj, Object obj2) {
        return C0AX.LIZJ(LIZ, abstractC84773XOv, LIZLLL, obj, obj2);
    }

    @Override // X.AbstractC84770XOs
    public final boolean LIZJ(AbstractC84773XOv<?> abstractC84773XOv, C84772XOu c84772XOu, C84772XOu c84772XOu2) {
        return C0AX.LIZJ(LIZ, abstractC84773XOv, LIZJ, c84772XOu, c84772XOu2);
    }
}
