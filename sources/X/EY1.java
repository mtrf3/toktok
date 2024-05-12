package X;

import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class EY1 {
    public static final Method LIZ;

    public static Object LIZ(Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{null, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-2816208361828566607"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(null, objArr);
    }

    static {
        try {
            for (Method method : Class.forName("android.os.SystemProperties").getMethods()) {
                String name = method.getName();
                if (name.equals("get")) {
                    LIZ = method;
                } else if (!name.equals("set") && !name.equals("getLong")) {
                    name.equals("getInt");
                }
            }
        } catch (ClassNotFoundException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
