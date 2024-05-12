package X;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: X.YIx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87167YIx {
    public static final Unsafe LIZ;
    public static final Class LIZIZ;
    public static final YJ0 LIZJ;
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
            return (Unsafe) AccessController.doPrivileged(new VJK());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0109  */
    static {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87167YIx.<clinit>():void");
    }

    public static void LIZ(Class cls) {
        if (LIZLLL) {
            LIZJ.LJIIIIZZ(cls);
        }
    }

    public static Object LJIIIIZZ(Class cls) {
        try {
            return LIZ.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static /* bridge */ /* synthetic */ void LJIIJJI(Throwable th) {
        Logger.getLogger(C87167YIx.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LJIILJJIL(Class cls) {
        try {
            Class cls2 = LIZIZ;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
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

    public static int LJIILLIIL(Class cls) {
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
        YJ0 yj0 = LIZJ;
        int LJIIIZ = yj0.LJIIIZ(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        yj0.LJIILIIL(j2, ((255 & b) << i) | (LJIIIZ & (~(255 << i))), obj);
    }

    public static void LIZLLL(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        YJ0 yj0 = LIZJ;
        int i = (((int) j) & 3) << 3;
        yj0.LJIILIIL(j2, ((255 & b) << i) | (yj0.LJIIIZ(j2, obj) & (~(255 << i))), obj);
    }

    public static void LJIIL(long j, int i, Object obj) {
        LIZJ.LJIILIIL(j, i, obj);
    }

    public static void LJIILIIL(long j, Object obj, Object obj2) {
        LIZJ.LJIILL(j, obj, obj2);
    }
}
