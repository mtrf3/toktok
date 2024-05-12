package X;

import android.os.Build;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: X.0YS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0YS {
    public static final Method LIZ;
    public static final Method LIZIZ;
    public static final Method LIZJ;

    static {
        try {
            Class.class.getDeclaredMethod("getDeclaredField", String.class);
            LIZ = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            LIZIZ = Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
            LIZJ = Class.class.getDeclaredMethod("forName", String.class);
        } catch (Throwable unused) {
        }
    }

    public static Class<?> LIZ(String str) {
        Method method;
        Class<?> cls;
        return (Build.VERSION.SDK_INT < 29 || (method = LIZJ) == null || (cls = (Class) LIZLLL(null, method, new Object[]{str})) == null) ? Class.forName(str) : cls;
    }

    public static Constructor LIZIZ(Class<?> cls, Class<?>... clsArr) {
        Method method;
        Constructor constructor;
        return (Build.VERSION.SDK_INT < 29 || (method = LIZIZ) == null || (constructor = (Constructor) LIZLLL(cls, method, new Object[]{clsArr})) == null) ? cls.getDeclaredConstructor(clsArr) : constructor;
    }

    public static Method LIZJ(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        Method method2;
        return (Build.VERSION.SDK_INT < 29 || (method = LIZ) == null || (method2 = (Method) LIZLLL(cls, method, new Object[]{str, clsArr})) == null) ? cls.getDeclaredMethod(str, clsArr) : method2;
    }

    public static Object LIZLLL(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-3654710194777993697"));
        return LIZJ2.LIZ ? LIZJ2.LIZIZ : method.invoke(obj, objArr);
    }
}
