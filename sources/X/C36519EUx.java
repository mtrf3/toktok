package X;

import java.lang.reflect.Method;

/* renamed from: X.EUx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36519EUx {
    public static volatile boolean LIZ;

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "8822827628582856597"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public static Method LIZIZ(Class cls, String str) {
        for (Method method : cls.getDeclaredMethods()) {
            if (str.equals(method.getName())) {
                method.setAccessible(true);
                return method;
            }
        }
        return null;
    }
}
