package X;

import android.os.Looper;
import java.lang.reflect.Field;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FGP implements Runnable {
    public static final FGP LJLIL = new FGP();

    public static void LIZ() {
        try {
            Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
            o.LJFF(declaredField, "Looper::class.java.getDe…aredField(\"sThreadLocal\")");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            if (obj != null) {
                ((ThreadLocal) obj).set(C16880lQ.LLJJJJ());
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type java.lang.ThreadLocal<android.os.Looper>");
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
