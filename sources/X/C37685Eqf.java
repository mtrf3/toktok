package X;

import java.lang.reflect.Field;

/* renamed from: X.Eqf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37685Eqf {
    public static final OJY LIZ;
    public static final Class LIZIZ;
    public static final Object LIZJ;

    static {
        try {
            if (OJY.LJLJJL == null) {
                OJY.LJLJJL = new OJY();
            }
            OJY ojy = OJY.LJLJJL;
            LIZ = ojy;
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            LIZIZ = cls;
            ojy.getClass();
            LIZJ = OJY.LJ(null, OJY.LIZLLL(cls, "getUnsafe", new Class[0]), new Object[0]);
        } catch (ClassNotFoundException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static long LIZ(Field field) {
        LIZ.getClass();
        Object LJ = OJY.LJ(LIZJ, OJY.LIZLLL(LIZIZ, "objectFieldOffset", Field.class), field);
        if (LJ == null) {
            return 0L;
        }
        return ((Long) LJ).longValue();
    }

    public static void LIZIZ(long j, Object obj, Object obj2) {
        OJY ojy = LIZ;
        Class cls = LIZIZ;
        Class[] clsArr = {Object.class, Long.TYPE, Object.class};
        ojy.getClass();
        Object LJ = OJY.LJ(LIZJ, OJY.LIZLLL(cls, "putObject", clsArr), obj, Long.valueOf(j), obj2);
        if (LJ == null) {
            return;
        }
        ((Long) LJ).longValue();
    }
}
