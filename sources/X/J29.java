package X;

import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J29 implements Runnable {
    public static final J29 LJLIL = new J29();

    public static void LIZ() {
        Method method;
        J2E j2e = new J2E();
        j2e.LIZ = 30;
        J28.LJ = new J2B(j2e);
        if (J28.LIZJ) {
            return;
        }
        J28.LIZIZ = C16880lQ.LLIIIJ();
        try {
            method = Class.forName("android.view.Choreographer").getDeclaredMethod("postCallbackDelayed", Integer.TYPE, Runnable.class, Object.class, Long.TYPE);
            method.setAccessible(true);
        } catch (Throwable unused) {
            method = null;
        }
        J28.LJIIIZ = method;
        while (true) {
            int i = J28.LIZ;
            if (i < 0) {
                break;
            }
            try {
                Method method2 = J28.LJIIIZ;
                if (method2 != null) {
                    J28.LIZ(J28.LIZIZ, method2, new Object[]{Integer.valueOf(i), J28.LJIIL, null, 0});
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            } catch (Exception unused2) {
                int i2 = J28.LIZ;
                if (i2 == 0) {
                    J28.LJIIIZ = null;
                }
                J28.LIZ = i2 - 1;
            }
        }
        J28.LIZJ = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
