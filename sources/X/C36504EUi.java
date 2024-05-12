package X;

import java.lang.reflect.Method;

/* renamed from: X.EUi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36504EUi {
    public static final Class LIZ;
    public static final Object LIZIZ;

    static {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            LIZ = cls;
            Method LIZ2 = LIZ(cls, "getUnsafe", new Class[0]);
            Object[] objArr = new Object[0];
            Object obj = null;
            if (LIZ2 != null) {
                try {
                    obj = LIZ2.invoke(null, objArr);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            LIZIZ = obj;
        } catch (ClassNotFoundException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    public static Method LIZ(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static void LIZIZ(long j, Object obj, HandlerC36506EUk handlerC36506EUk) {
        Method LIZ2 = LIZ(LIZ, "putObject", Object.class, Long.TYPE, Object.class);
        Object obj2 = LIZIZ;
        Object[] objArr = {obj, Long.valueOf(j), handlerC36506EUk};
        if (LIZ2 != null) {
            try {
                Object invoke = LIZ2.invoke(obj2, objArr);
                if (invoke != null) {
                    ((Long) invoke).longValue();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
