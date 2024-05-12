package ms.bd.o;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import java.lang.reflect.Method;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class p1 extends b.a {
    public static Object LIZJ(Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{null, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "2981384262718885"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(null, objArr);
    }

    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        try {
            Method method = Class.forName((String) k.a(16777217, 0, 0L, "613397", new byte[]{36, 60, 77, 9, 4, 57, 33, 21, 102, 98, 41, 48, 69, 9, 11, 47, 55, 3, 103, 96, 105, 32, 69, 73, 21, 47, 39, 94, 111, 111, 105, 30, 115, 101})).getMethod((String) k.a(16777217, 0, 0L, "93e398", new byte[]{41}), new Class[0]);
            if (method != null) {
                return (Long) LIZJ(method, new Object[0]);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
