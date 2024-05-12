package X;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: X.0S5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0S5 {
    public static boolean LIZIZ;
    public static Class<?> LIZJ;
    public static Method LIZLLL;
    public static Method LJ;
    public final Object LIZ;

    public static Object LIZIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-5268641794861812387"));
        return LIZJ2.LIZ ? LIZJ2.LIZIZ : method.invoke(obj, objArr);
    }

    public C0S5(Context context) {
        this.LIZ = null;
        synchronized (C0S5.class) {
            if (!LIZIZ) {
                try {
                    C0YN.LIZ(3);
                    LIZJ = C0YS.LIZ("android.util.BoostFramework");
                    C0YN.LIZ(3);
                    LIZLLL = C0YS.LIZJ(LIZJ, "perfLockAcquire", Integer.TYPE, int[].class);
                    C0YN.LIZ(3);
                    LJ = C0YS.LIZJ(LIZJ, "perfLockRelease", new Class[0]);
                    LIZIZ = true;
                    C0YN.LIZ(4);
                } catch (Exception e) {
                    LIZIZ = false;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("BoostFramework() : Exception_1 = ");
                    LIZ.append(e);
                    X1D.LIZIZ(LIZ);
                    C0YN.LIZ(6);
                }
            }
        }
        try {
            Class<?> cls = LIZJ;
            if (cls != null) {
                this.LIZ = C0YS.LIZIZ(cls, Context.class).newInstance(context);
            }
        } catch (Exception e2) {
            try {
                this.LIZ = C0YS.LIZIZ(LIZJ, new Class[0]).newInstance(new Object[0]);
            } catch (Exception unused) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("BoostFramework() : Exception_3 = ");
                LIZ2.append(e2);
                X1D.LIZIZ(LIZ2);
                C0YN.LIZ(6);
            }
        }
    }

    public final void LIZ(int i, int... iArr) {
        try {
            Method method = LIZLLL;
            if (method != null) {
                int intValue = ((Integer) LIZIZ(this.LIZ, method, new Object[]{Integer.valueOf(i), iArr})).intValue();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("invoke perfLockAcquire result ");
                LIZ.append(intValue);
                LIZ.append(" for ");
                LIZ.append(i);
                LIZ.append(" with ");
                LIZ.append(Arrays.toString(iArr));
                X1D.LIZIZ(LIZ);
                C0YN.LIZ(4);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Exception ");
            LIZ2.append(e);
            X1D.LIZIZ(LIZ2);
            C0YN.LIZ(6);
        }
    }
}
