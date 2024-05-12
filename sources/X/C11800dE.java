package X;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* renamed from: X.0dE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11800dE {
    public static Method LIZ;
    public static Method LIZIZ;
    public static boolean LIZJ;

    public static void LIZ(Canvas canvas, boolean z) {
        o.LJIIIZ(canvas, "canvas");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            C11810dF.LIZ(canvas, z);
            return;
        }
        if (!LIZJ) {
            try {
                if (i != 28) {
                    LIZ = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    LIZIZ = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                } else {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    LIZ = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    LIZIZ = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                }
                Method method = LIZ;
                if (method != null) {
                    method.setAccessible(true);
                }
                Method method2 = LIZIZ;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            LIZJ = true;
        }
        try {
            if (z) {
                Method method3 = LIZ;
                if (method3 != null) {
                    method3.invoke(canvas, new Object[0]);
                }
            } else {
                Method method4 = LIZIZ;
                if (method4 != null) {
                    method4.invoke(canvas, new Object[0]);
                }
            }
        } catch (IllegalAccessException | InvocationTargetException unused2) {
        }
    }
}
