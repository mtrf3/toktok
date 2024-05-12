package X;

import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: X.EUd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36499EUd {
    public static final Method LIZ;

    static {
        try {
            Class.class.getDeclaredMethod("getDeclaredField", String.class);
            LIZ = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
            Class.class.getDeclaredMethod("forName", String.class);
        } catch (Throwable unused) {
        }
    }

    public static Method LIZ(Class cls, Class... clsArr) {
        Method method;
        Object invoke;
        if (Build.VERSION.SDK_INT >= 28 && (method = LIZ) != null) {
            Object[] objArr = {"getBlocksPerSecondRange", clsArr};
            C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{cls, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "3375892011896560574"));
            if (LIZJ.LIZ) {
                invoke = LIZJ.LIZIZ;
            } else {
                invoke = method.invoke(cls, objArr);
            }
            Method method2 = (Method) invoke;
            if (method2 != null) {
                return method2;
            }
        }
        return cls.getDeclaredMethod("getBlocksPerSecondRange", clsArr);
    }
}
