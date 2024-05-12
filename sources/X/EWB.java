package X;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;

/* loaded from: classes7.dex */
public final class EWB {
    public static Class LIZ;
    public static Field LIZIZ;
    public static Object LIZJ;
    public static Object LIZLLL;
    public static final java.util.Set<Integer> LJ;

    static {
        HashSet hashSet = new HashSet();
        LJ = hashSet;
        hashSet.add(113);
        hashSet.add(114);
        hashSet.add(115);
        hashSet.add(116);
        hashSet.add(121);
        hashSet.add(122);
        hashSet.add(100);
        hashSet.add(159);
        hashSet.add(123);
    }

    public static synchronized Class LIZ() {
        Class cls;
        synchronized (EWB.class) {
            if (LIZ == null) {
                try {
                    LIZ = Class.forName("android.app.ActivityThread");
                } catch (ClassNotFoundException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            cls = LIZ;
        }
        return cls;
    }

    public static synchronized Field LIZIZ() {
        Field field;
        synchronized (EWB.class) {
            if (LIZIZ == null) {
                LIZIZ = EWA.LIZ(LIZ(), "mH");
            }
            field = LIZIZ;
        }
        return field;
    }

    public static synchronized Object LIZJ() {
        Object obj;
        synchronized (EWB.class) {
            if (LIZLLL == null) {
                try {
                    LIZLLL = LIZIZ().get(LIZLLL());
                } catch (IllegalAccessException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            obj = LIZLLL;
        }
        return obj;
    }

    public static synchronized Object LIZLLL() {
        Object obj;
        synchronized (EWB.class) {
            try {
                if (LIZJ == null) {
                    LIZJ = EW7.LIZIZ(LIZ(), "currentActivityThread", new Object[0]);
                }
                obj = LIZJ;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
        return obj;
    }
}
