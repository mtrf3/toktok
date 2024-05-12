package X;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: X.YIw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87166YIw {
    public static final Logger LIZ = Logger.getLogger(C87166YIw.class.getName());
    public static final Unsafe LIZIZ;
    public static final Class<?> LIZJ;
    public static final YJ1 LIZLLL;
    public static final boolean LJ;
    public static final boolean LJFF;
    public static final long LJI;
    public static final boolean LJII;

    /* JADX WARN: Removed duplicated region for block: B:12:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87166YIw.<clinit>():void");
    }

    public static Unsafe LJ() {
        try {
            return (Unsafe) AccessController.doPrivileged(new VJL());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field LJFF() {
        Field field;
        Field field2;
        if (C64525PUb.LIZ()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
                field2.setAccessible(true);
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
            field.setAccessible(true);
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static <T> T LJIIIIZZ(Class<T> cls) {
        try {
            return (T) LIZIZ.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static int LJIIIZ(Class<?> cls) {
        if (LJFF) {
            return LIZLLL.LIZ.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void LJIIJJI(Class cls) {
        if (LJFF) {
            LIZLLL.LIZ.arrayIndexScale(cls);
        }
    }

    public static boolean LJIILIIL(Class<?> cls) {
        if (!C64525PUb.LIZ()) {
            return false;
        }
        try {
            Class<?> cls2 = LIZJ;
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

    public static byte LIZ(long j, byte[] bArr) {
        return LIZLLL.LJIIJJI(LJI + j, bArr);
    }

    public static int LJIIJ(long j, Object obj) {
        return LIZLLL.LJI(j, obj);
    }

    public static long LJIIL(long j, Object obj) {
        return LIZLLL.LJII(j, obj);
    }

    public static boolean LJIILJJIL(long j, Object obj) {
        return LIZLLL.LJIIIIZZ(j, obj);
    }

    public static float LJIILL(long j, Object obj) {
        return LIZLLL.LJIIIZ(j, obj);
    }

    public static double LJIILLIIL(long j, Object obj) {
        return LIZLLL.LJIIJ(j, obj);
    }

    public static Object LJIIZILJ(long j, Object obj) {
        return LIZLLL.LIZ.getObject(obj, j);
    }

    public static byte LJIJ(long j, Object obj) {
        return (byte) (LJIIJ((-4) & j, obj) >>> ((int) (((~j) & 3) << 3)));
    }

    public static byte LJIJI(long j, Object obj) {
        return (byte) (LJIIJ((-4) & j, obj) >>> ((int) ((j & 3) << 3)));
    }

    public static void LIZIZ(long j, Object obj, Object obj2) {
        LIZLLL.LIZ.putObject(obj, j, obj2);
    }

    public static void LIZJ(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int LJIIJ = LJIIJ(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        LJI(j2, ((255 & b) << i) | (LJIIJ & (~(255 << i))), obj);
    }

    public static void LIZLLL(byte[] bArr, long j, byte b) {
        LIZLLL.LJFF(bArr, LJI + j, b);
    }

    public static void LJI(long j, int i, Object obj) {
        LIZLLL.LJ(j, i, obj);
    }

    public static void LJII(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        LJI(j2, ((255 & b) << i) | (LJIIJ(j2, obj) & (~(255 << i))), obj);
    }
}
