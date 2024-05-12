package X;

import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: X.0Ry, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07700Ry {
    public static boolean LIZ;
    public static Class<?> LIZIZ;
    public static Method LIZJ;
    public static Object LIZLLL;

    public static Object LIZIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-5268641794861812394"));
        return LIZJ2.LIZ ? LIZJ2.LIZIZ : method.invoke(obj, objArr);
    }

    public C07700Ry() {
        synchronized (C07700Ry.class) {
            if (!LIZ) {
                try {
                    int i = Build.VERSION.SDK_INT;
                    if (i == 29) {
                        Class<?> LIZ2 = C0YS.LIZ("android.scrollerboostmanager.ScrollerBoostManager");
                        LIZIZ = LIZ2;
                        LIZJ = C0YS.LIZJ(LIZ2, "listFling", Integer.TYPE);
                    } else if (i == 28 || i == 27 || i == 26) {
                        Class<?> LIZ3 = C0YS.LIZ("android.iawareperf.UniPerf");
                        LIZIZ = LIZ3;
                        LIZJ = C0YS.LIZJ(LIZ3, "uniPerfEvent", Integer.TYPE, String.class, int[].class);
                        C0YN.LIZ(4);
                    }
                } catch (Exception e) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("CHRYBoostFramework() : Exception_1 = ");
                    LIZ4.append(e);
                    X1D.LIZIZ(LIZ4);
                    C0YN.LIZ(6);
                }
            }
        }
        try {
            if (LIZIZ != null) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 == 29) {
                    LIZLLL = LIZIZ(LIZIZ, C0YS.LIZJ(LIZIZ, "getInstance", new Class[0]), new Object[0]);
                    LIZIZ(LIZLLL, C0YS.LIZJ(LIZIZ, "init", new Class[0]), new Object[0]);
                } else if (i2 == 28 || i2 == 27 || i2 == 26) {
                    LIZLLL = LIZIZ(null, C0YS.LIZJ(LIZIZ, "getInstance", new Class[0]), new Object[0]);
                } else {
                    return;
                }
                LIZ = true;
            }
        } catch (Exception e2) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("CHRYBoostFramework() : Exception_2 = ");
            LIZ5.append(e2);
            X1D.LIZIZ(LIZ5);
            C0YN.LIZ(6);
        }
    }

    public static void LIZ(long j) {
        StringBuilder LIZ2;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i == 29) {
                LIZIZ(LIZLLL, LIZJ, new Object[]{Integer.valueOf((int) j)});
                LIZ2 = X1D.LIZ();
                LIZ2.append("invoke listFling result  for ");
                LIZ2.append(j);
            } else if (i == 28 || i == 27 || i == 26) {
                int intValue = ((Integer) LIZIZ(LIZLLL, LIZJ, new Object[]{4099, "canBoost=true|screenOn=1", new int[0]})).intValue();
                LIZ2 = X1D.LIZ();
                LIZ2.append("invoke uniPerfEvent result ");
                LIZ2.append(intValue);
                LIZ2.append(" for ");
                LIZ2.append(j);
            } else {
                return;
            }
            X1D.LIZIZ(LIZ2);
            C0YN.LIZ(4);
        } catch (Throwable th) {
            th.getMessage();
            C0YN.LIZ(5);
        }
    }
}
