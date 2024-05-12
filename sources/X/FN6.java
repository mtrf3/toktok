package X;

import android.view.Choreographer;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FN6 {
    public static final FN6 LIZ = new FN6();
    public static int LIZIZ = 4;
    public static Choreographer LIZJ;
    public static Method LIZLLL;
    public static Field LJ;
    public static Method LJFF;
    public static Method LJI;
    public static boolean LJII;

    public final synchronized void LIZ() {
        Method method;
        if (LJII) {
            return;
        }
        LIZJ = C16880lQ.LLIIIJ();
        try {
            method = Class.forName("android.view.Choreographer").getDeclaredMethod("postCallbackDelayed", Integer.TYPE, Runnable.class, Object.class, Long.TYPE);
            method.setAccessible(true);
        } catch (Throwable unused) {
            method = null;
        }
        LIZLLL = method;
        while (LIZIZ >= 0) {
            try {
                Method method2 = LIZLLL;
                o.LJI(method2);
                method2.invoke(LIZJ, Integer.valueOf(LIZIZ), FN8.LJLIL, null, 0);
                break;
            } catch (Exception unused2) {
                int i = LIZIZ;
                if (i == 0) {
                    LIZLLL = null;
                }
                LIZIZ = i - 1;
            }
        }
        LIZIZ();
        LJII = true;
    }

    public static void LIZIZ() {
        Field field;
        if (!C51785KUb.LIZJ) {
            return;
        }
        Field field2 = null;
        try {
            field = Choreographer.class.getField("mCallbacksRunning");
            field.setAccessible(true);
        } catch (Exception unused) {
            try {
                if (LJFF == null) {
                    LJFF = Class.class.getDeclaredMethod("getDeclaredField", String.class);
                }
                Method method = LJFF;
                if (method != null) {
                    Object invoke = method.invoke(Choreographer.class, "mCallbacksRunning");
                    o.LJII(invoke, "null cannot be cast to non-null type java.lang.reflect.Field");
                    Field field3 = (Field) invoke;
                    if (LJI == null) {
                        LJI = AccessibleObject.class.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    }
                    Method method2 = LJI;
                    if (method2 != null) {
                        method2.invoke(field3, Boolean.TRUE);
                        field2 = field3;
                    }
                }
            } catch (Exception unused2) {
            }
            field = field2;
        }
        LJ = field;
    }

    public static boolean LIZJ(Runnable runnable) {
        Method method;
        o.LJIIIZ(runnable, "runnable");
        boolean z = false;
        if (!LJII || (method = LIZLLL) == null) {
            return false;
        }
        try {
            method.invoke(LIZJ, Integer.valueOf(LIZIZ), runnable, null, 0);
            z = true;
            return true;
        } catch (Throwable unused) {
            return z;
        }
    }
}
