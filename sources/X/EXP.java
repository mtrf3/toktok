package X;

import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class EXP {
    public final Object LIZ;
    public final Method LIZIZ;

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "2497762059929964671"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public EXP() {
        try {
            Class<?> cls = Class.forName("com.bytedance.pia.core.ServiceProvider");
            this.LIZ = cls.newInstance();
            this.LIZIZ = cls.getMethod("get", Class.class);
        } catch (Throwable unused) {
        }
    }

    public static <T> T LIZIZ(Class<T> cls) {
        Method method;
        EXP exp = EXQ.LIZ;
        Object obj = exp.LIZ;
        if (obj != null && (method = exp.LIZIZ) != null) {
            try {
                return (T) LIZ(obj, method, new Object[]{cls});
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
