package X;

import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: X.Eaz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36713Eaz extends AbstractC36715Eb1 {
    public static Object LIZLLL(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-9185383958742868012"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    static {
        AbstractC36715Eb1.LIZJ("activityDestroyed", new C36714Eb0(0));
        AbstractC36715Eb1.LIZJ("activitySlept", new C36714Eb0(0));
    }

    public final void LJ() {
        Object LIZLLL;
        if (Build.VERSION.SDK_INT < 29) {
            F8X.LIZ();
            return;
        }
        try {
            Field LIZ = EWF.LIZ(Class.forName("android.app.ActivityTaskManager"), "IActivityTaskManagerSingleton");
            Object obj = null;
            if (LIZ != null) {
                obj = EWF.LIZIZ(LIZ, null);
            }
            if (Class.forName("android.util.Singleton").isInstance(obj)) {
                C73340SqO.LJIIL(obj, "target object must not be null");
                Field LIZ2 = EWF.LIZ(obj.getClass(), "mInstance");
                if (((LIZ2 != null && (LIZLLL = EWF.LIZIZ(LIZ2, obj)) != null) || (LIZLLL = LIZLLL(obj, EWC.LIZ(obj.getClass(), "get", new Class[0]), new Object[0])) != null) && !Proxy.isProxyClass(LIZLLL.getClass())) {
                    this.LIZLLL = true;
                    this.LIZIZ = LIZLLL;
                    Object LJII = C60903NvH.LJII(LIZLLL, this);
                    Field LIZ3 = EWF.LIZ(obj.getClass(), "mInstance");
                    if (LIZ3 != null) {
                        if (!LIZ3.isAccessible()) {
                            LIZ3.setAccessible(true);
                        }
                        LIZ3.set(obj, LJII);
                    }
                    F8X.LIZ();
                }
            }
        } catch (Throwable unused) {
            F8X.LIZ();
        }
    }
}
