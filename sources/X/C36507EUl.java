package X;

import java.lang.reflect.Method;

/* renamed from: X.EUl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36507EUl<T> {
    public final Method LIZ;

    public static Object LIZ(Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{null, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "6376738822615076370"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(null, objArr);
    }

    public C36507EUl(Class[] clsArr) {
        Method method;
        try {
            try {
                method = Class.forName("android.os.UserHandle").getDeclaredMethod("myUserId", clsArr);
            } catch (NoSuchMethodException unused) {
                method = null;
            }
            this.LIZ = method;
        } catch (Exception unused2) {
        }
        Method method2 = this.LIZ;
        if (method2 != null) {
            method2.setAccessible(true);
        }
    }
}
