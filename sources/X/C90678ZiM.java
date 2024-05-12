package X;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* renamed from: X.ZiM, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90678ZiM extends AbstractC90380ZdY {
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
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C90263Zbf());
            }
            try {
                LIZJ = unsafe.objectFieldOffset(AbstractC90683ZiR.class.getDeclaredField("LJLJI"));
                LIZIZ = unsafe.objectFieldOffset(AbstractC90683ZiR.class.getDeclaredField("LJLILLLLZI"));
                LIZLLL = unsafe.objectFieldOffset(AbstractC90683ZiR.class.getDeclaredField("LJLIL"));
                LJ = unsafe.objectFieldOffset(C90274Zbq.class.getDeclaredField("LIZ"));
                LJFF = unsafe.objectFieldOffset(C90274Zbq.class.getDeclaredField("LIZIZ"));
                LIZ = unsafe;
            } catch (Exception e) {
                if (!(e instanceof RuntimeException)) {
                    throw new RuntimeException(e);
                }
                throw e;
            }
        } catch (PrivilegedActionException e2) {
            throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
        }
    }

    @Override // X.AbstractC90380ZdY
    public final void LIZ(C90274Zbq c90274Zbq, C90274Zbq c90274Zbq2) {
        LIZ.putObject(c90274Zbq, LJFF, c90274Zbq2);
    }

    @Override // X.AbstractC90380ZdY
    public final void LIZIZ(C90274Zbq c90274Zbq, Thread thread) {
        LIZ.putObject(c90274Zbq, LJ, thread);
    }

    @Override // X.AbstractC90380ZdY
    public final boolean LIZJ(AbstractC90683ZiR<?> abstractC90683ZiR, C90404Zdw c90404Zdw, C90404Zdw c90404Zdw2) {
        return C90254ZbW.LIZ(LIZ, abstractC90683ZiR, LIZIZ, c90404Zdw, c90404Zdw2);
    }

    @Override // X.AbstractC90380ZdY
    public final boolean LIZLLL(AbstractC90683ZiR<?> abstractC90683ZiR, Object obj, Object obj2) {
        return C90254ZbW.LIZ(LIZ, abstractC90683ZiR, LIZLLL, obj, obj2);
    }

    @Override // X.AbstractC90380ZdY
    public final boolean LJ(AbstractC90683ZiR<?> abstractC90683ZiR, C90274Zbq c90274Zbq, C90274Zbq c90274Zbq2) {
        return C90254ZbW.LIZ(LIZ, abstractC90683ZiR, LIZJ, c90274Zbq, c90274Zbq2);
    }
}
