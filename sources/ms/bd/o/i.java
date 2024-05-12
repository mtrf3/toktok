package ms.bd.o;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import java.lang.reflect.Method;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class i extends b.a {
    public static Object LIZJ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "96173685894149"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        try {
            Class<?> cls = Class.forName((String) k.a(16777217, 0, 0L, "e169a1", new byte[]{119, 60, 72, 3, 77, 53, 40, 17, 105, 109, 102, 60, 76, 73, 16, 51, 97, 19, 41, 120, 97, 60, 81, 76, 16, 4, 66, 62, 98, 125, 99, 60, 87, 70, 106, 39, 97, 51, 104, 103, 96, 54, 93, 89, 110, 52, 105, 6, 110, 109, 113, 33, 100, 73, 95, 54, 114, 21, 117}));
            Method declaredMethod = cls.getDeclaredMethod((String) k.a(16777217, 0, 0L, "2bd6c1", new byte[]{46, 97, 5, 73, 125, 53, 31, 70, 34, 83, 48, 101, 5}), new Class[0]);
            declaredMethod.setAccessible(true);
            Object newInstance = cls.newInstance();
            if (newInstance != null ? ((Boolean) LIZJ(newInstance, declaredMethod, new Object[0])).booleanValue() : false) {
                return (String) k.a(16777217, 0, 0L, "7fdaa5", new byte[]{40, 97, 0, 32, 77, 39, 38});
            }
            return null;
        } catch (Throwable unused) {
            k.a(16777217, 0, 0L, "42951e", new byte[]{34, 49, 76});
            return null;
        }
    }
}
