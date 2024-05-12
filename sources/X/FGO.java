package X;

import android.os.Looper;
import java.lang.reflect.Field;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FGO implements Runnable {
    public static final FGO LJLIL = new FGO();

    public static void LIZ() {
        try {
            Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
            o.LJIIIIZZ(declaredField, "Looper::class.java.getDe…aredField(\"sThreadLocal\")");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            o.LJII(obj, "null cannot be cast to non-null type java.lang.ThreadLocal<android.os.Looper>");
            ((ThreadLocal) obj).set(C16880lQ.LLJJJJ());
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
        } catch (NoSuchFieldException e2) {
            C16880lQ.LLLLIIL(e2);
        }
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
