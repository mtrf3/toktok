package X;

import android.os.Build;
import android.os.Handler;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedList;

/* loaded from: classes7.dex */
public final class FA3 {
    public static Handler LIZ = null;
    public static LinkedList<Runnable> LIZIZ = null;
    public static FA4 LIZJ = null;
    public static Field LIZLLL = null;
    public static Object LJ = null;
    public static boolean LJFF = false;
    public static int LJI = -1;

    public static void LIZ(Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{null, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "6002131952382011415")).LIZ) {
            return;
        }
        method.invoke(null, objArr);
    }

    public static void LIZIZ() {
        int i;
        if (LJFF || (i = Build.VERSION.SDK_INT) < 26 || i > 33) {
            return;
        }
        try {
            Class<?> cls = Class.forName("android.app.QueuedWork");
            Field LIZ2 = C36508EUm.LIZ(cls, "sHandler");
            LIZLLL = C36508EUm.LIZ(cls, "sWork");
            Field LIZ3 = C36508EUm.LIZ(cls, "sFinishers");
            Field LIZ4 = C36508EUm.LIZ(cls, "sLock");
            Method LIZIZ2 = C36508EUm.LIZIZ(cls, "getHandler", new Class[0]);
            if (LIZIZ2 != null) {
                LIZ(LIZIZ2, new Object[0]);
                if (LIZ2 == null) {
                    return;
                }
                LIZ = (Handler) LIZ2.get(null);
                Field field = LIZLLL;
                if (field != null && LIZ4 != null) {
                    LIZIZ = (LinkedList) field.get(null);
                    LJ = LIZ4.get(null);
                }
                if (LIZIZ != null && LJ != null) {
                    FA4 fa4 = new FA4();
                    LIZJ = fa4;
                    LIZ3.set(null, fa4);
                    LIZ2.set(null, new FA2(LIZ.getLooper()));
                    LJFF = true;
                }
            }
        } catch (Throwable unused) {
        }
    }
}
