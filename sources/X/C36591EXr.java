package X;

import Y.ARunnableS42S0100000_6;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;

/* renamed from: X.EXr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36591EXr {
    public static Class LIZ;
    public static Field LIZIZ;
    public static Object LIZJ;
    public static Object LIZLLL;
    public static final java.util.Set<Integer> LJ;
    public static Class LJFF;

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

    public static Object LIZ() {
        if (LIZJ == null) {
            try {
                synchronized (C36591EXr.class) {
                    if (LIZJ == null) {
                        if (LJFF == null) {
                            LJFF = Class.forName("android.app.ActivityThread");
                        }
                        LIZJ = C36596EXw.LIZLLL(LJFF, new Object[0]);
                    }
                    if (LIZJ == null && Looper.myLooper() != C16880lQ.LLJJJJ()) {
                        Object obj = new Object();
                        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS42S0100000_6(obj, 92));
                        if (LIZJ == null) {
                            synchronized (obj) {
                                try {
                                    obj.wait(5000L);
                                } catch (InterruptedException unused) {
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return LIZJ;
    }

    public static synchronized Class LIZIZ() {
        Class cls;
        synchronized (C36591EXr.class) {
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

    public static synchronized Field LIZJ() {
        Field field;
        synchronized (C36591EXr.class) {
            if (LIZIZ == null) {
                LIZIZ = EUN.LIZ(LIZIZ(), "mH");
            }
            field = LIZIZ;
        }
        return field;
    }

    public static synchronized Object LIZLLL() {
        Object obj;
        synchronized (C36591EXr.class) {
            if (LIZLLL == null) {
                try {
                    LIZLLL = LIZJ().get(LJ());
                } catch (IllegalAccessException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            obj = LIZLLL;
        }
        return obj;
    }

    public static synchronized Object LJ() {
        Object obj;
        synchronized (C36591EXr.class) {
            try {
                if (LIZJ == null) {
                    LIZJ = C36596EXw.LIZLLL(LIZIZ(), new Object[0]);
                }
                obj = LIZJ;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
        return obj;
    }
}
