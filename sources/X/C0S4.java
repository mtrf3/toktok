package X;

import android.content.Context;
import java.lang.reflect.Method;

/* renamed from: X.0S4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0S4 {
    public static boolean LIZIZ;
    public static Class<?> LIZJ;
    public static Method LIZLLL;
    public static Method LJ;
    public static Method LJFF;
    public static Method LJI;
    public static Method LJII;
    public final Object LIZ;

    public static Object LIZJ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-5268641794861812388"));
        return LIZJ2.LIZ ? LIZJ2.LIZIZ : method.invoke(obj, objArr);
    }

    public final int LIZLLL() {
        try {
            Method method = LJ;
            if (method != null) {
                return ((Integer) LIZJ(this.LIZ, method, new Object[0])).intValue();
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Exception ");
            LIZ.append(e);
            X1D.LIZIZ(LIZ);
            C0YN.LIZ(6);
        }
        return -1;
    }

    public C0S4(Context context) {
        this.LIZ = null;
        synchronized (C0S4.class) {
            if (!LIZIZ) {
                try {
                    C0YN.LIZ(3);
                    LIZJ = C0YS.LIZ("com.mediatek.perfservice.PerfServiceWrapper");
                    C0YN.LIZ(3);
                    Class cls = Integer.TYPE;
                    LIZLLL = C0YS.LIZJ(LIZJ, "userGetCapability", cls);
                    C0YN.LIZ(3);
                    LJ = C0YS.LIZJ(LIZJ, "userRegScn", new Class[0]);
                    C0YN.LIZ(3);
                    LJFF = C0YS.LIZJ(LIZJ, "userRegScnConfig", cls, cls, cls, cls, cls, cls);
                    C0YN.LIZ(3);
                    C0YS.LIZJ(LIZJ, "userEnable", cls);
                    C0YN.LIZ(3);
                    LJI = C0YS.LIZJ(LIZJ, "userEnableTimeoutMs", cls, cls);
                    C0YN.LIZ(3);
                    LJII = C0YS.LIZJ(LIZJ, "userDisable", cls);
                    LIZIZ = true;
                    C0YN.LIZ(4);
                } catch (Exception e) {
                    LIZIZ = false;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("PerfService() : Exception_1 = ");
                    LIZ.append(e);
                    X1D.LIZIZ(LIZ);
                    C0YN.LIZ(6);
                }
            }
        }
        try {
            Class<?> cls2 = LIZJ;
            if (cls2 != null) {
                this.LIZ = C0YS.LIZIZ(cls2, Context.class).newInstance(context);
            }
        } catch (Exception e2) {
            try {
                this.LIZ = C0YS.LIZIZ(LIZJ, new Class[0]).newInstance(new Object[0]);
            } catch (Exception unused) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("MTKPerfService() : Exception_4 = ");
                LIZ2.append(e2);
                X1D.LIZIZ(LIZ2);
                C0YN.LIZ(6);
            }
        }
    }

    public final int LJ(int i) {
        try {
            Method method = LIZLLL;
            if (method != null) {
                return ((Integer) LIZJ(this.LIZ, method, new Object[]{Integer.valueOf(i)})).intValue();
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Exception ");
            LIZ.append(e);
            X1D.LIZIZ(LIZ);
            C0YN.LIZ(6);
        }
        return -1;
    }

    public final void LIZ(int i, int i2) {
        try {
            Method method = LJI;
            if (method != null) {
                LIZJ(this.LIZ, method, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("invoke userEnableTimeoutMs with handle ");
                LIZ.append(i);
                LIZ.append(" and timeout ");
                LIZ.append(i2);
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

    public final void LIZIZ(int i, int i2, int i3, int i4) {
        try {
            Method method = LJFF;
            if (method != null) {
                LIZJ(this.LIZ, method, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), -1, -1});
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("invoke userRegScnConfig with handle ");
                LIZ.append(i);
                LIZ.append(" and cmd ");
                LIZ.append(i2);
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
