package X;

import java.lang.reflect.Method;

/* renamed from: X.EUh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36503EUh {
    public static final Class LIZ;
    public static final Object LIZIZ;

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "3004755939328792390"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    static {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            LIZ = cls;
            Method LIZIZ2 = LIZIZ(cls, "getUnsafe", new Class[0]);
            Object[] objArr = new Object[0];
            Object obj = null;
            if (LIZIZ2 != null) {
                try {
                    obj = LIZ(null, LIZIZ2, objArr);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            LIZIZ = obj;
        } catch (ClassNotFoundException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    public static Method LIZIZ(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static void LIZJ(long j, Object obj, Object obj2) {
        Method LIZIZ2 = LIZIZ(LIZ, "putObject", Object.class, Long.TYPE, Object.class);
        Object obj3 = LIZIZ;
        Object[] objArr = {obj, Long.valueOf(j), obj2};
        if (LIZIZ2 != null) {
            try {
                Object LIZ2 = LIZ(obj3, LIZIZ2, objArr);
                if (LIZ2 != null) {
                    ((Long) LIZ2).longValue();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
