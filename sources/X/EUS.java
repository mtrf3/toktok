package X;

import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EUS {
    public static final Class<?> LIZ;
    public static final Object LIZIZ;

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-437604247655067977"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    static {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            LIZ = cls;
            LIZIZ = LIZ(null, C36496EUa.LIZIZ(cls, "getUnsafe", new Class[0]), new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static final int LIZIZ(long j) {
        try {
            Object LIZ2 = LIZ(LIZIZ, C36496EUa.LIZIZ(LIZ, "getInt", Long.TYPE), new Object[]{Long.valueOf(j)});
            o.LJII(LIZ2, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) LIZ2).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }
}
