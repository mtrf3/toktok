package X;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: X.ZdU, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90376ZdU {
    public static final Unsafe LIZ;
    public static final Class<?> LIZIZ;
    public static final AbstractC90367ZdL LIZJ;
    public static final boolean LIZLLL;
    public static final long LJ;
    public static final boolean LJFF;

    public static Field LIZIZ() {
        Field field;
        Field field2;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field == null) {
            try {
                field2 = Buffer.class.getDeclaredField("address");
            } catch (Throwable unused2) {
                field2 = null;
            }
            if (field2 == null || field2.getType() != Long.TYPE) {
                return null;
            }
            return field2;
        }
        return field;
    }

    public static Unsafe LJIIJ() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C90346Zd0());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    static {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90376ZdU.<clinit>():void");
    }

    public static void LIZ(Class cls) {
        if (LIZLLL) {
            LIZJ.LJIIIIZZ(cls);
        }
    }

    public static <T> T LJIIIIZZ(Class<T> cls) {
        try {
            return (T) LIZ.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static /* synthetic */ void LJIIJJI(Throwable th) {
        Logger.getLogger(C90376ZdU.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static boolean LJIILJJIL(Class<?> cls) {
        try {
            Class<?> cls2 = LIZIZ;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int LJIILLIIL(Class<?> cls) {
        if (LIZLLL) {
            return LIZJ.LJII(cls);
        }
        return -1;
    }

    public static double LJ(long j, Object obj) {
        return LIZJ.LIZ(j, obj);
    }

    public static float LJFF(long j, Object obj) {
        return LIZJ.LIZIZ(j, obj);
    }

    public static int LJI(long j, Object obj) {
        return LIZJ.LJIIIZ(j, obj);
    }

    public static long LJII(long j, Object obj) {
        return LIZJ.LJIIJ(j, obj);
    }

    public static Object LJIIIZ(long j, Object obj) {
        return LIZJ.LJIIL(j, obj);
    }

    public static boolean LJIILL(long j, Object obj) {
        return LIZJ.LJI(j, obj);
    }

    public static void LIZJ(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        AbstractC90367ZdL abstractC90367ZdL = LIZJ;
        int LJIIIZ = abstractC90367ZdL.LJIIIZ(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        abstractC90367ZdL.LJIILIIL(j2, ((255 & b) << i) | (LJIIIZ & (~(255 << i))), obj);
    }

    public static void LIZLLL(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        AbstractC90367ZdL abstractC90367ZdL = LIZJ;
        int i = (((int) j) & 3) << 3;
        abstractC90367ZdL.LJIILIIL(j2, ((255 & b) << i) | (abstractC90367ZdL.LJIIIZ(j2, obj) & (~(255 << i))), obj);
    }

    public static void LJIIL(long j, int i, Object obj) {
        LIZJ.LJIILIIL(j, i, obj);
    }

    public static void LJIILIIL(long j, Object obj, Object obj2) {
        LIZJ.LJIILL(j, obj, obj2);
    }
}
