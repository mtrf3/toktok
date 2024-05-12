package X;

import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.EUc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36498EUc {
    public static final Method LIZ;
    public static final Method LIZIZ;

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-8621302746655671261"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    static {
        try {
            LIZ = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            LIZIZ = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
            Class.class.getDeclaredMethod("forName", String.class);
        } catch (Throwable unused) {
        }
    }

    public static Field LIZIZ(Class<?> cls, String str) {
        Method method;
        Field field;
        if (Build.VERSION.SDK_INT < 29 || (method = LIZ) == null || (field = (Field) LIZ(cls, method, new Object[]{str})) == null) {
            return cls.getDeclaredField(str);
        }
        return field;
    }

    public static Method LIZJ(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        Method method2;
        if (Build.VERSION.SDK_INT < 29 || (method = LIZIZ) == null || (method2 = (Method) LIZ(cls, method, new Object[]{str, clsArr})) == null) {
            return cls.getDeclaredMethod(str, clsArr);
        }
        return method2;
    }
}
