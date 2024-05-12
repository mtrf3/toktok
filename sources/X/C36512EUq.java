package X;

import android.os.Build;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.EUq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36512EUq {
    public static final Method LIZ;
    public static final Method LIZIZ;
    public static final Method LIZJ;
    public static final Method LIZLLL;

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "8409012737549723757"));
        return LIZJ2.LIZ ? LIZJ2.LIZIZ : method.invoke(obj, objArr);
    }

    static {
        try {
            LIZ = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            LIZIZ = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            LIZJ = Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
            LIZLLL = Class.class.getDeclaredMethod("forName", String.class);
        } catch (Throwable unused) {
        }
    }

    public static Class<?> LIZIZ(String str) {
        Method method;
        Class<?> cls;
        if (Build.VERSION.SDK_INT < 29 || (method = LIZLLL) == null || (cls = (Class) LIZ(null, method, new Object[]{str})) == null) {
            return Class.forName(str);
        }
        return cls;
    }

    public static Constructor LIZJ(Class<?> cls, Class<?>... clsArr) {
        Method method;
        Constructor constructor;
        if (Build.VERSION.SDK_INT < 29 || (method = LIZJ) == null || (constructor = (Constructor) LIZ(cls, method, new Object[]{clsArr})) == null) {
            return cls.getDeclaredConstructor(clsArr);
        }
        return constructor;
    }

    public static Field LIZLLL(Class<?> cls, String str) {
        Method method;
        Field field;
        if (Build.VERSION.SDK_INT < 29 || (method = LIZ) == null || (field = (Field) LIZ(cls, method, new Object[]{str})) == null) {
            return cls.getDeclaredField(str);
        }
        return field;
    }

    public static Object LJFF(Object obj, String str) {
        try {
            Field LIZLLL2 = LIZLLL(obj.getClass(), str);
            LIZLLL2.setAccessible(true);
            return LIZLLL2.get(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method LJ(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        Method method2;
        if (Build.VERSION.SDK_INT < 29 || (method = LIZIZ) == null || (method2 = (Method) LIZ(cls, method, new Object[]{str, clsArr})) == null) {
            return cls.getDeclaredMethod(str, clsArr);
        }
        return method2;
    }
}
