package X;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.EUz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36521EUz {
    public static Method LIZ;
    public static Method LIZIZ;
    public static boolean LIZJ;

    public static void LIZ(Canvas canvas, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (i != 28) {
            if (!LIZJ) {
                try {
                    Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    LIZ = declaredMethod;
                    declaredMethod.setAccessible(true);
                    Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                    LIZIZ = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                LIZJ = true;
            }
            try {
                if (z) {
                    Method method = LIZ;
                    if (method != null) {
                        method.invoke(canvas, new Object[0]);
                    }
                } else {
                    Method method2 = LIZIZ;
                    if (method2 != null) {
                        method2.invoke(canvas, new Object[0]);
                    }
                }
                return;
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        throw new IllegalStateException("This method doesn't work on Pie!");
    }
}
